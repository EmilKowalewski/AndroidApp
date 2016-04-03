package de.piramid.sawa;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.testsawa.R;
import com.example.testsawa.R.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
/**
 * Diese Klasse ist für das Anzeigen von Öle, Fette und Salz
 * zuständigt. 
 * @author Emil Kowalewski 
 */

public class PyramidFragmentD extends Fragment {
	View view;

	private ToggleButton Butter; 
	private ToggleButton Margarine;
	private ToggleButton Kochfette;
	private ToggleButton Bratfette;
	private ToggleButton Backfette; 
	private ToggleButton Siedefette;
	private ToggleButton Speisefett;
	private ToggleButton Pflanzenfett;
	private ToggleButton Olivenoel;
	private ToggleButton Kokosfett;
	private ToggleButton Arganoel;
	private ToggleButton Rapsoel;
	private ToggleButton Sonnenblumenoel;

	HashMap<String, Boolean> isPressed;
	private ArrayList<String> ingredientsList;
	/**
	 * Diese Methode fegt die ToggleButtons fest.
	 * Die Buttons werden in einer Hashmap gespeichert als key. 
	 * Der Value liegt fest ob der Button ankeglick wurde.
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_piramid_fragment_d,  container,false);
		ingredientsList = new ArrayList<String>();
		isPressed = new HashMap<String, Boolean>();
		
		Butter  =(ToggleButton) view.findViewById(R.id.button_Butter);
		isPressed.put((String) Butter.getTextOn(), true);
		
		Margarine  =(ToggleButton) view.findViewById(R.id.button_Margarine);
		isPressed.put((String) Margarine.getTextOn(), true);
		
		Kochfette  =(ToggleButton) view.findViewById(R.id.button_Kochfette);
		isPressed.put((String) Kochfette.getTextOn(), true);
		
		Bratfette  =(ToggleButton) view.findViewById(R.id.button_Bratfette);
		isPressed.put((String) Bratfette.getTextOn(), true);
		
		Backfette  =(ToggleButton) view.findViewById(R.id.button_Backfette);
		isPressed.put((String) Backfette.getTextOn(), true);
		
		Siedefette  =(ToggleButton) view.findViewById(R.id.button_Siedefette);
		isPressed.put((String) Siedefette.getTextOn(), true);
		
		Speisefett  =(ToggleButton) view.findViewById(R.id.button_Speisefett);
		isPressed.put((String) Speisefett.getTextOn(), true);
		
		Pflanzenfett  =(ToggleButton) view.findViewById(R.id.button_Pflanzenfett);
		isPressed.put((String) Pflanzenfett.getTextOn(), true);
		
		Olivenoel  =(ToggleButton) view.findViewById(R.id.button_Olivenoel);
		isPressed.put((String) Olivenoel.getTextOn(), true);
		
		Kokosfett  =(ToggleButton) view.findViewById(R.id.button_Kokosfett);
		isPressed.put((String) Kokosfett.getTextOn(), true);
		
		Arganoel  =(ToggleButton) view.findViewById(R.id.button_Arganoel);
		isPressed.put((String) Arganoel.getTextOn(), true);
		
		Rapsoel  =(ToggleButton) view.findViewById(R.id.button_Rapsoel);
		isPressed.put((String) Rapsoel.getTextOn(), true);
		
		Sonnenblumenoel  =(ToggleButton) view.findViewById(R.id.button_Sonnenblumenoel);
		isPressed.put((String) Sonnenblumenoel.getTextOn(), true);
		
		return view;
	}
	/**
	 * Diese Methode fegt die ToggleButtons fest.
	 * Die Buttons werden in einer Hashmap gespeichert als key. 
	 * Der Value liegt fest ob der Button ankeglick wurde.
	 */
	public void imageClickFett(View view){
		switch (view.getId()) {
		case R.id.button_Butter:
			if (isPressed.get(Butter.getTextOn())) {
				setIngredient((String) Butter.getTextOn());
				isPressed.put((String) Butter.getTextOn(), false);
			}else{
				deleteIngredient((String) Butter.getTextOn());
				isPressed.put((String) Butter.getTextOn(), true);
			}
			break;
			
		case R.id.button_Margarine:
			if (isPressed.get(Margarine.getTextOn())) {
				setIngredient((String) Margarine.getTextOn());
				isPressed.put((String) Margarine.getTextOn(), false);
			}else{
				deleteIngredient((String) Margarine.getTextOn());
				isPressed.put((String) Margarine.getTextOn(), true);
			}
			break;
			
		case R.id.button_Kochfette:
			if (isPressed.get(Kochfette.getTextOn())) {
				setIngredient((String) Kochfette.getTextOn());
				isPressed.put((String) Kochfette.getTextOn(), false);
			}else{
				deleteIngredient((String) Kochfette.getTextOn());
				isPressed.put((String) Kochfette.getTextOn(), true);
			}
			break;
			
		case R.id.button_Bratfette:
			if (isPressed.get(Bratfette.getTextOn())) {
				setIngredient((String) Bratfette.getTextOn());
				isPressed.put((String) Bratfette.getTextOn(), false);
			}else{
				deleteIngredient((String) Bratfette.getTextOn());
				isPressed.put((String) Bratfette.getTextOn(), true);
			}
			break;
			
		case R.id.button_Backfette:
			if (isPressed.get(Backfette.getTextOn())) {
				setIngredient((String) Backfette.getTextOn());
				isPressed.put((String) Backfette.getTextOn(), false);
			}else{
				deleteIngredient((String) Backfette.getTextOn());
				isPressed.put((String) Backfette.getTextOn(), true);
			}
			break;
			
		case R.id.button_Siedefette:
			if (isPressed.get(Siedefette.getTextOn())) {
				setIngredient((String) Siedefette.getTextOn());
				isPressed.put((String) Siedefette.getTextOn(), false);
			}else{
				deleteIngredient((String) Siedefette.getTextOn());
				isPressed.put((String) Siedefette.getTextOn(), true);
			}
			break;
			
		case R.id.button_Speisefett:
			if (isPressed.get(Speisefett.getTextOn())) {
				setIngredient((String) Speisefett.getTextOn());
				isPressed.put((String) Speisefett.getTextOn(), false);
			}else{
				deleteIngredient((String) Speisefett.getTextOn());
				isPressed.put((String) Speisefett.getTextOn(), true);
			}
			break;
			
		case R.id.button_Pflanzenfett:
			if (isPressed.get(Pflanzenfett.getTextOn())) {
				setIngredient((String) Pflanzenfett.getTextOn());
				isPressed.put((String) Pflanzenfett.getTextOn(), false);
			}else{
				deleteIngredient((String) Pflanzenfett.getTextOn());
				isPressed.put((String) Pflanzenfett.getTextOn(), true);
			}
			break;
			
		case R.id.button_Olivenoel:
			if (isPressed.get(Olivenoel.getTextOn())) {
				setIngredient((String) Olivenoel.getTextOn());
				isPressed.put((String) Olivenoel.getTextOn(), false);
			}else{
				deleteIngredient((String) Olivenoel.getTextOn());
				isPressed.put((String) Olivenoel.getTextOn(), true);
			}
			break;
			
		case R.id.button_Kokosfett:
			if (isPressed.get(Kokosfett.getTextOn())) {
				setIngredient((String) Kokosfett.getTextOn());
				isPressed.put((String) Kokosfett.getTextOn(), false);
			}else{
				deleteIngredient((String) Kokosfett.getTextOn());
				isPressed.put((String) Kokosfett.getTextOn(), true);
			}
			break;
			
		case R.id.button_Arganoel:
			if (isPressed.get(Arganoel.getTextOn())) {
				setIngredient((String) Arganoel.getTextOn());
				isPressed.put((String) Arganoel.getTextOn(), false);
			}else{
				deleteIngredient((String) Arganoel.getTextOn());
				isPressed.put((String) Arganoel.getTextOn(), true);
			}
			break;
			
		case R.id.button_Rapsoel:
			if (isPressed.get(Rapsoel.getTextOn())) {
				setIngredient((String) Rapsoel.getTextOn());
				isPressed.put((String) Rapsoel.getTextOn(), false);
			}else{
				deleteIngredient((String) Rapsoel.getTextOn());
				isPressed.put((String) Rapsoel.getTextOn(), true);
			}
			break;
			
		case R.id.button_Sonnenblumenoel:
			if (isPressed.get(Sonnenblumenoel.getTextOn())) {
				setIngredient((String) Sonnenblumenoel.getTextOn());
				isPressed.put((String) Sonnenblumenoel.getTextOn(), false);
			}else{
				deleteIngredient((String) Sonnenblumenoel.getTextOn());
				isPressed.put((String) Sonnenblumenoel.getTextOn(), true);
			}
			break;
		default:
			break;
		}
		
		
	}
	/**
	 * Diese Methode speicher in der List die angeklickte Zutat
	 * @param ingredient - Die Zutat, die angeklick war
	 */	
	 public void setIngredient(String ingredient){
	        if(ingredientsList == null) {
	             ingredientsList = new ArrayList<String>();
	        }
	        ingredientsList.add(ingredient);
	        System.out.println(ingredientsList +"and"+ ingredientsList.size());
	    }
	    /**
	     * Diese Methode löscht aus der List die angeklickte Zutat
	     * @param ingredient - die Zutat, die weg geklickt war
	     */
	    public void deleteIngredient(String ingredient){
	    	if (!ingredientsList.isEmpty()) {
				ingredientsList.remove(ingredient);
			}
	    	System.out.println(ingredientsList +"and"+ ingredientsList.size());
	    }
	    
		public ArrayList<String> getIngredient(){
			
			return ingredientsList;
			
		}

}