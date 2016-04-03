package de.piramid.sawa;

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewDebug.IntToString;
/**
 * Diese Klasse macht die zutaten der von einem Benutzer gewählt sind mit 
 * Zutaten, die in Datenbank vorhanden sind
 * @author Emil Kowalewski
 *
 */
public class CompareRecipe  {

	private List<String> chosenIngredients = null;
	private double procent = 0; 

	public List<String> getChosenIngredients() {
		return chosenIngredients;
	}
	/**
	 * Diese Methode vergleicht die gewählte Zutaten mit der Zutaten der vorhandenen Rezepten 
	 * am ende wird eine Methode die Trefferquote berechnet aufgerufen 
	 * @param chosenIngredients - Die gewählte Zutaten 
	 * @param recipeIngredients - Zutaten der vorhandenen Rezepten 
	 */
	public void matchIngredians(List<String> chosenIngredients,
			List<String> recipeIngredients) {
		double machQuote = 0;

		for (int i = 0; i < chosenIngredients.size(); i++) {
			for (int j = 0; j < recipeIngredients.size() ; j++) {
				//mit equalsIgnoreCase wird Groß/-Kleinschreibung ingnoriert
				if (chosenIngredients.get(i).equalsIgnoreCase(recipeIngredients.get(j))) {
					machQuote++;
				}
				
			}
		}
		
		
		calculateProcent(recipeIngredients.size(), machQuote);
		
	}
	
	/**
	 * Diese Methode berechnet Trefferquote in Prozent
	 * @param recipeIngredientsSize - Anzahl der zutaten der jeweiligen Rezept
	 * @param machQuote - Treffer Anzahl
	 */
	private void calculateProcent(int recipeIngredientsSize, double machQuote) {
		
		procent = (machQuote*100 ) / recipeIngredientsSize  ;
		
	}
	
	public double getProcent(){
		return procent;
		
	}
	

}
