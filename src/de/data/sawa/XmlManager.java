package de.data.sawa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Xml;


/**
 * 
 * @author Emil Kowalewski
 * Diese Klasse Parst rec.xml und legt alle Daten in der List von Typ Recipe fest 
 *
 */
public class XmlManager extends Activity  {
	
	private String ns = null;
	private List<String> attIngredians= null; 
	/**
	 * Diese Methode starte das Parsen
	 * @return - gibt zurück geparste Liste von Typ Recipe
	 * @throws XmlPullParserException
	 * @throws IOException
	 */
	public List<Recipe> parse() throws XmlPullParserException, IOException {
		    
		 	// FileReader liest eine vorhandene rec.xml 
		 	FileReader in = new FileReader(Environment.getExternalStorageDirectory()+"/"+"Sawa"+"/"+"rec.xml");
		 	//Aus BufferedReader werden die Daten gelesen
		 	BufferedReader br = new BufferedReader(in);
	        try {
	            XmlPullParser parser = Xml.newPullParser();//XmlPullParser wird instanziert
	            //Parser wird in ein Modus versetzt, das NAMESPACES in der rec.xml ignoriert
	            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
	            parser.setInput(br);//dem Parser wird Imput übergeben
	            parser.nextTag();//Parser startet und gib ein Parsing EVENT zurück
	         
	            return readRecipes(parser);//Startet mit der erste Methode des Parser 
	        } finally {
	            br.close();//Schließe den BufferedReader
	        }
	    }
		/**
		 * readRecipes Methode sucht nach dem Würzel Element und ruft Parser weitere Methode. 
		 * @param parser - Parser mit dem ersten Parsing-EVENT
		 * @return Gibt eine Liste von Typ Recipe mit geparsten Daten
		 * @throws XmlPullParserException
		 * @throws IOException
		 */
	    private List<Recipe> readRecipes(XmlPullParser parser) throws XmlPullParserException, IOException {
	        List<Recipe> recipes = new ArrayList<Recipe>();
	        //Das Programm geht weiter nur wenn der Parsing-EVENT ein START_TAG ist. 
	        //Parameter "recipes" ist ein Würzel-Element der rec.xml Datei
	        parser.require(XmlPullParser.START_TAG, ns, "recipes");
	        //Die Schleife geht so lange durch bis ein END_TAG des Würzels-Element als Parsing-EVENT 
	        //identifiziert wird
	        while (parser.next() != XmlPullParser.END_TAG) {
	        	//Hier wird abfefragt, ob ein Start_Tag eines anderes Element geparst wird 
	            if (parser.getEventType() != XmlPullParser.START_TAG) {
	                continue;
	            }
	            String name = parser.getName();
	            // Hier wird abfragt ob er START_TAG ein recipe Tag ist
	            if (name.equals("recipe")) {
	            	//Hier wird die Methode readeRecipe aufgerüfen und das Ergebnis in der List gespeochert
	                recipes.add( readRecipe(parser));
	            } 
	        }
	        //returnt die List
	        return recipes;
	    }
	    /**
	     * In diese Methode wird ein recipe Tag geparst. Das ist der Element, der 
	     * späer eine Representation in der Klasse Recipe findet.
	     * @param parser mit dem nächsten Parsing-EVENT
	     * @return
	     * @throws XmlPullParserException
	     * @throws IOException
	     */
	    @SuppressWarnings("null")
		private Recipe readRecipe(XmlPullParser parser) throws XmlPullParserException, IOException {
	    	//Das Programm geht weiter nur wenn ein recipe Tag geparst wurde
	        parser.require(XmlPullParser.START_TAG, ns, "recipe");
	        List<String> recipe = new ArrayList<String>();
	        List<String> ingredients = new ArrayList<String>();
	        String preparation = "";
	        //Die schleife geht so lange weiter bis ein END_Tag des recipe-Tag identifiziert konnte       
	        while (parser.getEventType() != XmlPullParser.END_TAG) {
	        	//----------------Hier wird abfefragt, ob ein Start_Tag eines anderes Element geparst wird 
	            if (parser.getEventType() != XmlPullParser.START_TAG) {
	                continue;
	            }
	            String name = parser.getName();
	            //Die Liste recipe bekommt alle Attribute eines Recipe-Tags
	            if (name.equals("recipe")) {
	            	recipe.add(parser.getAttributeValue(null, "name"));
	            	recipe.add(parser.getAttributeValue(null, "portion"));
	            	recipe.add(parser.getAttributeValue(null, "time"));
	            	recipe.add(parser.getAttributeValue(null, "difficulty"));
	            } else if (name.equals("ingredients")) {
	            	//Wenn name des Tags ein ingredients ruft eine Methode readIngredians
	            	ingredients = readIngredians(parser);
	            } else if (name.equals("preparation")) {
	            	//Wenn name des Tags ein ingredients ruft eine Methode readPreparation
	            	preparation = readPreparation(parser);
	            } 
	            parser.nextTag();//Parse weiter um weiter Elemente identifizieren zu können
	        }
	        //Nach dem der ENT_TAG des recipe-Tags identifieziert konnte Istanziere 
	        //ein Rezpet Objekt mit allen geparsten daten  
	        return new Recipe(recipe, ingredients, preparation, attIngredians );
	    }

	    /**
	     * Diese Methode sucht nach dem Preparation-Tag
	     * @param parser - parser mit dem nächsten Parsing-EVENT
	     * @return
	     * @throws IOException
	     * @throws XmlPullParserException
	     */
	    private String readPreparation(XmlPullParser parser) throws IOException, XmlPullParserException {
	        String preparation = "";
	        parser.require(XmlPullParser.START_TAG, ns, "preparation");
	        //Hier wird eine Methode aufgerufen die ein Text aus der rec.xml ausliest
	        preparation = readText(parser);
	        parser.require(XmlPullParser.END_TAG, ns, "preparation");
	        return preparation;
	    }

	    /**
	     * Diese Methode sucht nach dem Ingredians Tag
	     * @param parser mit dem nächsten Parsing-EVENT
	     * @return
	     * @throws IOException
	     * @throws XmlPullParserException
	     */
		@SuppressWarnings("null")
		private List<String> readIngredians(XmlPullParser parser) throws IOException, XmlPullParserException {
	    	List<String> ingredients= new ArrayList<String>();
	    	attIngredians = new ArrayList<String>();
	        parser.require(XmlPullParser.START_TAG, ns, "ingredients");
	        //Die Schlaeife geht so lange weiter bis der End Tag des ingredients Tag identifiziert ist 
	        while (parser.next() != XmlPullParser.END_TAG) {
	        	 if (parser.getEventType() != XmlPullParser.START_TAG) {
		                continue;
		            }
	        	String name = parser.getName();
	        	// wenn der name des Tag ingredient gleich ist speichere die Attribute des ingredient Tag
	        	if (name.equals("ingredient") ) {
	        		String attName = parser.getAttributeValue(null, "name");
	        		attIngredians.add(attName);
	        		ingredients.add(readText(parser));
	        		
				}
			}
	        parser.require(XmlPullParser.END_TAG, ns, "ingredients");
	        return ingredients;
	    }
		/**
		 * Diese Methode liest einen Text bestimmtes Element, solbald ein Element einen beinhaltet
		 * @param parser mit dem nächsten Parsing-EVENT
		 * @return
		 * @throws IOException
		 * @throws XmlPullParserException
		 */
		private String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
		    String result = "";
		    if (parser.next() == XmlPullParser.TEXT) {
		    	//Hier wird der string eines bestimmtes Element angesprchen und gespeichert
		    	//trim Methode löscht white space am Anfang und Ende des Strings 
		        result = parser.getText().trim();
		        parser.nextTag();
		    }
		    return result;
		}

	    /**
	     * Hier wierd die Buchstabe als Kriterium übergeben. Die Methode 
	     * gib nur Rezepte mit dem jeweiligen Kriterium zurück  
	     * @param db Liste der geparsten Recepte
	     * @param criteria Kriterium der Liste die Alphabetisch geordnet werden soll
	     * @return
	     */
	    @SuppressWarnings("null")
		public List<String> getByCriteria(List<Recipe> db, char criteria ){
	    	List<String> criteriaList = new ArrayList<String>();
	    	char c = criteria;
	    	//Die Schleife geht alle Recepte durch
	    	for (Recipe recipe : db) {
				//Abfrage überprüft ob der Name eines Rezepts ( get(0) ist immer der Name )
	    		//gleicht dem Kriterium 
	    		if (recipe.getRecipe().get(0).charAt(0) == c){
	    			
	    			criteriaList.add(recipe.getRecipe().get(0));
	    		}
			}
				
			return criteriaList;
	    	
	    }
	    /**
	     * Die Methode such in der Liste nach einem Rezept der als Kriterium angegeben ist
	     * @param db Liste der geparsten Recepte
	     * @param criteria - Name eines Rezept
	     * @return
	     */
		public Recipe getRecipyByCriteria(List<Recipe> db, String criteria ){
	    	
	    	Recipe searchRecipy = null;
	    	//Die Schleife geht alle Recepte durch
	    	for (Recipe recipe : db) {
	    		//Abfrage überprüft ob der Name (hier als Kriterium angeben ist) 
	    		//gleich ist den Namen in der Liste  
	    		if (recipe.getRecipe().get(0).equals(criteria)){
	    			searchRecipy = recipe;
	    			break;
	    		}
			}
	    	//Das gewollte Rezept wird zurück gegeben
			return searchRecipy;
	    	
	    }
		/**
		 * Diese Methode gib nur Attribute der Zutaten da nur sie für die 
		 * Matching benötig sind 
		 * @return gibt ein 
		 */
		public List<String> getAttIngridiens(){
			return attIngredians;
		}
	}

