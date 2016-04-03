package modulTest;



import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import de.data.sawa.Recipe;
import de.data.sawa.XmlManager;
import de.piramid.sawa.CompareRecipe;

public class Test_Compare extends TestCase {

	private List<String> testSystem;
	private List<String> testUser;
	private String[] testArray;
	private String testArray2[];
	private CompareRecipe cRecipe;
	private double cProzent;
	@Override
	public void setUp() throws Exception {
		super.setUp();
		testSystem = new ArrayList<String>();
		testUser = new ArrayList<String>();		
		testArray = new String[] {"Tomaten","Nudel","Orangen","Öl","Ei","Gurke","Zwiblen","Kartoffeln","Wasser","Zitrone"};
		testArray2 = new String[] {"Kartoffeln","Orangen","Öl","Zwiblen","Tomaten"};
		cRecipe = new CompareRecipe();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}



	public void testCompare(){
		
		for (String test : testArray) {
			testSystem.add(test);
		}
		for (String test2 : testArray2) {
			testUser.add(test2);
		}
		
		cRecipe.matchIngredians(testUser, testSystem);
		cProzent = cRecipe.getProcent();
		assertEquals(50.0, cProzent);
		
	}
	
}
