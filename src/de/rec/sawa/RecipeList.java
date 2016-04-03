package de.rec.sawa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.xmlpull.v1.XmlPullParserException;

import com.example.testsawa.R;
import com.example.testsawa.R.id;
import com.example.testsawa.R.layout;
import com.example.testsawa.R.menu;

import de.data.sawa.*;

import de.show.sawa.ShowRecipe;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;
/**
 * 
 * @author Emil Kowalewski
 *
 */
public class RecipeList extends Activity {

	MyBaseExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	String sendChildList;
	XmlManager dbMan;
	List<Recipe> db;
	Recipe sendRecipe;
	/**
	 * Diese Methode wird jedes mal ausgeführt wenn die Klasse von System angesproche ist
	 * Sie stellt alle Komponenten der Klasse bereit
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recipe);
		
		//Inizialiesere den XmlManager
		dbMan = new XmlManager();
		try {
			//Hier wird geparst und Daten in der List<Recipe> gespeichert
			db = dbMan.parse();
		} catch (XmlPullParserException e) {
			System.err.println("XmlPullParserException " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IO Excepion " + e.getMessage());
			e.printStackTrace();
		}

		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.expandableListView1);

		// Daten vorbereiten
		prepareListData();
		
		listAdapter = new MyBaseExpandableListAdapter(this, listDataHeader,
				listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);
		//hier ist Der Liste einen Listview child click listener zugewissen
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				//String aus der listDataChild wird hier zurückgegeben
				sendChildList = listDataChild 
						.get(listDataHeader.get(groupPosition))
						.get(childPosition).toString();
				//Suche ein Rezept mit dem aus listDataChild string
				sendRecipe = dbMan.getRecipyByCriteria(db, sendChildList);
				//Intetn initialisieren
				Intent in = new Intent(RecipeList.this,ShowRecipe.class);
				// setzt Intent mit dem jeweiligen Rezept 
				in.putExtra("sendRecipe", sendRecipe);
				//Starte ShowRecipe Activity
				startActivity(in);
				return false;
			}
		});
	}

	/**
	 *Diese Methode setzt in der List-Header Anfangsbuchstaben und in der Child-List Namen der jeweiligen Rezepten
	 */
	private void prepareListData() {

		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();
		char capital;
		int count = 0;
		//Die schleife geht das ganze Alphabet druch
		for (capital = 'A'; capital <= 'Z' ; capital++) {
			
			List<String> isCapital = dbMan.getByCriteria(db, capital);
			if (!isCapital.isEmpty()) {
				listDataHeader.add(Character.toString(capital));
				listDataChild.put(listDataHeader.get(count), isCapital);
				count++;
			}
			
		}
	}

}
