package de.show.sawa;

import java.util.ArrayList;

import com.example.testsawa.R;

import de.data.sawa.Recipe;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
/**
 * 
 * @author Emil Kowalewski
 *
 */
public class ShowRecipe extends Activity {
	Intent intent;
	Recipe findeRecipe;
	ArrayList<String> recipe;
	TextView viewTitle;
	TextView viewRecipe;
	TextView viewIngredients;
	TextView viewPreparation;
	/**
	 * Diese Methode wird jedes mal ausgeführt wenn die Klasse von System angesproche ist
	 * Sie stellt alle Komponenten der Klasse bereit
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_recipe);
		//Das gesendete Rezept wird mit Parcelable Methode aufgerüfen und in Variable findeRecipe gespeichert 
		findeRecipe = (Recipe) getIntent().getParcelableExtra("sendRecipe");
		//Title des Rezepts bekommt die View Element
		viewTitle = (TextView) findViewById(R.id.title);
		//Name des Rezept wird angelegt in viewTitle
		viewTitle.setText(findeRecipe.getRecipe().get(0));
		viewRecipe = (TextView) findViewById(R.id.recipe);
		//Überschrift "Eingenschafften" wird in viewRecipe angelegt
		viewRecipe.setText("Eingenschafften"+"\n");
		viewIngredients = (TextView) findViewById(R.id.ingredients);
		//Überschrift "Zutaten" wird in viewIngredients angelegt
		viewIngredients.setText("Zutaten"+"\n");
		viewPreparation = (TextView) findViewById(R.id.preparation);
		//Überschrift "Zubereitung" wird in viewPreparation angelegt
		viewPreparation.setText("Zubereitung"+"\n");
		
		//Andere Eigenschaften der Rezept werden in viewRecipe gespeicher   
		for (int i = 1; i < findeRecipe.getRecipe().size() ; i++) {
			
			viewRecipe.append(findeRecipe.getRecipe().get(i)+"\n");
			
		}
		//Hier werden alle Zutaten ausgegeben
		for (int i = 0; i < findeRecipe.getIngredients().size() ; i++) {
			
			viewIngredients.append(findeRecipe.getIngredients().get(i)+"\n");
			
		}
		//Hier wird die Zubereitung ausgegeben
		viewPreparation.setText(findeRecipe.getPreparation());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_recipe, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
