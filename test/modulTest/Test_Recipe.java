package modulTest;

import java.util.ArrayList;
import java.util.List;

import de.data.sawa.Recipe;
import de.data.sawa.XmlManager;
import junit.framework.TestCase;




public class Test_Recipe extends TestCase {
	
	private XmlManager dbManager;
	private List<Recipe> recipe;
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		recipe = new ArrayList<Recipe>();
		dbManager = new XmlManager();
		recipe = dbManager.parse();	
	}

	public void testRecipeListExists(){
		
		assertNotNull(recipe);
		
	}
	
	public void testByCriteria(){
		List<String> testList;
		char testCriteria= 'a';
		testList = dbManager.getByCriteria(recipe, testCriteria);
		assertNotNull(testList);
		
	}
	
	public void testRecipyByCriteria(){
		Recipe testRecipe;
		String testName= "Klassischer Hefeteig";
		String testportion = "1 Portion";
		String testZeit = "1 Stunde";
		String testSchwirigkeit = "mittel";
		
		testRecipe = dbManager.getRecipyByCriteria(recipe, testName);
		assertEquals(testName,testRecipe.getRecipe().get(0));
		assertEquals(testportion,testRecipe.getRecipe().get(1));
		assertEquals(testZeit,testRecipe.getRecipe().get(2));
		assertEquals(testSchwirigkeit,testRecipe.getRecipe().get(3));
	}





}
