package de.piramid.sawa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

import org.xmlpull.v1.XmlPullParserException;

import com.example.testsawa.R;
import com.example.testsawa.R.id;
import com.example.testsawa.R.layout;
import com.example.testsawa.R.menu;

import de.data.sawa.Recipe;
import de.data.sawa.XmlManager;
import de.rec.sawa.RecipeList;
import de.show.sawa.ShowRecipe;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.os.Build;
/**
 * Diese Klasse dient um die Rezepte die anch einer bestimmter Trefferquote 
 * angezeigt werden sollen
 * @author Emil Kowalewski
 *
 */
public class ShowMatch extends Activity {

	ListView lView = null;
	XmlManager xManager = null;
	List<Recipe> rec = null;
	List<String> chosenIngridients=null;
	CompareRecipe cRecipe=null;
	Recipe sendRecipe = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_match);
		lView = (ListView) findViewById(R.id.list);
		chosenIngridients = new ArrayList<String>();
		cRecipe = new CompareRecipe();
		xManager = new XmlManager();
		Intent intent = getIntent();
		//liefert eine ArrayList auf dem intetn der an diese Klasse addresiert war
		chosenIngridients = intent.getStringArrayListExtra("data");
		try {
			rec	= xManager.parse();
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		prepareListData();
		
		lView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				 int itemPosition = position;
				 //Hier wird der ausgewählte String aus der Liste gespeicher 
				 String  itemValue = (String) lView.getItemAtPosition(position);
				 //sende Recipe an der ShowRecipe.class
				 sendRecipe = xManager.getRecipyByCriteria(rec, itemValue);
				 Intent in = new Intent(ShowMatch.this,
							ShowRecipe.class);
				 	//setzte die ausgewählte rezept in Intetn ein
					in.putExtra("sendRecipe", sendRecipe);
					startActivity(in);
			}
		});
			
		
	}
	/**
	 * Diese Metode vorbereitet eine Liste und 
	 * liegt in sie Datensetzte ein 
	 */
	private void prepareListData() {
		String[] value = null;
		
		List<String> listShow = new ArrayList<String>();
		for (int i = 0; i < rec.size() ; i++) {
			
			cRecipe.matchIngredians(chosenIngridients, rec.get(i).getattIngredians());
			if (cRecipe.getProcent() > 0) {
				
				listShow.add(rec.get(i).getRecipe().get(0).toString());
				
			}
			
		}
		//an der List wird eine ArrayApapter angelegt der für aussehen der Liste zuständgi ist
		ListAdapter lAdapter = new ArrayAdapter<String>(this, R.layout.list_view, listShow);
		lView.setAdapter(lAdapter);
		
	}
}
