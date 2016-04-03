package de.data.sawa;

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;
/**
 * 
 * @author Emil Kowalewski
 * Diese Klasse repr�sentiert ein einzeles Rezept
 *
 */
public class Recipe  implements Parcelable{
	private  List<String> recipe = null;
	private  List<String> ingredients = null;
	private  String preparation = null;
	private List<String> attIngredians = null;
/**
 * 
 * @param recipe - beinhaltet Eingenschaften eines Rezept wie z.B. Name oder Schwirigkeitsgrad
 * @param ingredients - beinhaltet Zutaten eines Rezept als Text z.B. 2 El �l
 * @param preparation - beinhaltet Zubereitung eines Rezept  
 * @param attIngredians - beinhaltet Eingenschaften einer Zutat wie z.B. �l
 */
	public Recipe(List<String> recipe, List<String> ingredients,
			String preparation, List<String> attIngredians) {
		this.recipe = recipe;
		this.ingredients = ingredients;
		this.preparation = preparation;
		this.attIngredians = attIngredians;
	}
/**
 * 
 * @param source - Parcel Objekt wird �bergeben um auf alle Daten nach dem Senden wieder zugreifen zu k�nnen  
 */
	public Recipe(Parcel source) {
		recipe = new ArrayList<String>();
		source.readStringList(recipe);
		ingredients = new ArrayList<String>();
		source.readStringList(ingredients);
		attIngredians = new ArrayList<String>();
		source.readStringList(attIngredians);
		this.preparation = source.readString();
		
	}
/**
 * 
 * @return attIngredians - Eingenschaften einer Zutat wie z.B. �l
 */
	public List<String> getattIngredians(){
		return attIngredians;
		
	}
	/**
	 * 
	 * @return - Eingenschaften eines Rezept wie z.B. Name oder Schwirigkeitsgrad
	 */
	public List<String> getRecipe() {
		return recipe;
	}
	/**
	 * 
	 * @return - Zutaten eines Rezept als Text z.B. 2 El �l
	 */
	public List<String> getIngredients() {
		return ingredients;
	}
	/**
	 * 
	 * @return - Zubereitung eines Rezept
	 */
	public String getPreparation() {
		return preparation;
	}
/**
 * Beschreibt die Arten von besonderen Objekten in diesem Parcel 
 */
	@Override
	public int describeContents() {
		return 0;
	}
	/**
	 * Schreibt alle Daten der Klasse auf dem Parcel Objekt, die gesendet werde sollen 
	 */
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeStringList(recipe);
		dest.writeStringList(ingredients);
		dest.writeStringList(attIngredians);
		dest.writeString(preparation);
		
		
	}
	/**
	 * Erstellt ein CREATOR Instanz die f�r die Erstellung eines Parcel zust�ndigt ist 
	 */
	public static final Parcelable.Creator<Recipe> CREATOR = new Creator<Recipe>() {
		/**
		 * Hier wird ein Array der Klasse Recipe erstellt 
		 */
		@Override
		public Recipe[] newArray(int size) {
			return new Recipe[size];
		}
		/**
		 * Spricht den Konstruktor der Klasse Recipe mit dem Parcel Parameter
		 * um Daten wieder her  
		 */
		@Override
		public Recipe createFromParcel(Parcel source) {
			return new Recipe(source);
		}
	};
}
