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
 * Diese Klasse ist für das Anzeigen von Eiweiß 
 * zuständigt. 
 * @author Emil Kowalewski
 *
 */
public class PyramidFragmentC extends Fragment {
	View view;
	
	private ToggleButton Raeuchertofu;
	private ToggleButton Seidentofu;
	private ToggleButton Amaranthsprossen;
	private ToggleButton Ei;
	private ToggleButton Kidneybohnen;
	private ToggleButton Mungobohnen;
	private ToggleButton Sojabohnen;
	private ToggleButton Leinsamen;
	private ToggleButton Erdnuesse;
	private ToggleButton Cashewnuesse;
	private ToggleButton Sonnenblumenkerne;
	private ToggleButton Chia_Samen;
	private ToggleButton Mandeln;
	private ToggleButton Quinoa;
	private ToggleButton Amaranth;
	private ToggleButton Tempeh;
	private ToggleButton Haferflocken;
	private ToggleButton Seitan;
	private ToggleButton Brunnenkresse;
	private ToggleButton Senfblaetter;
	private ToggleButton Kuerbiskerne;
	private ToggleButton Sesamsaat;
	private ToggleButton Hirse;
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
		view = inflater.inflate(R.layout.fragment_piramid_fragment_c,  container,false);
		ingredientsList = new ArrayList<String>();
		isPressed = new HashMap<String, Boolean>();
		
		Raeuchertofu  =(ToggleButton) view.findViewById(R.id.button_Raeuchertofu);
		isPressed.put((String) Raeuchertofu.getTextOn(), true);
		
		Seidentofu  =(ToggleButton) view.findViewById(R.id.button_Seidentofu);
		isPressed.put((String) Seidentofu.getTextOn(), true);
		
		Amaranthsprossen  =(ToggleButton) view.findViewById(R.id.button_Amaranthsprossen);
		isPressed.put((String) Amaranthsprossen.getTextOn(), true);
		
		Ei  =(ToggleButton) view.findViewById(R.id.button_Ei);
		isPressed.put((String) Ei.getTextOn(), true);
		
		Kidneybohnen  =(ToggleButton) view.findViewById(R.id.button_Kidneybohnen);
		isPressed.put((String) Kidneybohnen.getTextOn(), true);
		
		Mungobohnen  =(ToggleButton) view.findViewById(R.id.button_Mungobohnen);
		isPressed.put((String) Mungobohnen.getTextOn(), true);
		
		Sojabohnen  =(ToggleButton) view.findViewById(R.id.button_Sojabohnen);
		isPressed.put((String) Sojabohnen.getTextOn(), true);
		
		Leinsamen  =(ToggleButton) view.findViewById(R.id.button_Leinsamen);
		isPressed.put((String) Leinsamen.getTextOn(), true);
		
		Erdnuesse  =(ToggleButton) view.findViewById(R.id.button_Erdnuesse);
		isPressed.put((String) Erdnuesse.getTextOn(), true);
		
		Cashewnuesse  =(ToggleButton) view.findViewById(R.id.button_Cashewnuesse);
		isPressed.put((String) Cashewnuesse.getTextOn(), true);
		
		Sonnenblumenkerne  =(ToggleButton) view.findViewById(R.id.button_Sonnenblumenkerne);
		isPressed.put((String) Sonnenblumenkerne.getTextOn(), true);
		
		Chia_Samen  =(ToggleButton) view.findViewById(R.id.button_Chia_Samen);
		isPressed.put((String) Chia_Samen.getTextOn(), true);
		
		Mandeln  =(ToggleButton) view.findViewById(R.id.button_Mandeln);
		isPressed.put((String) Mandeln.getTextOn(), true);
		
		Quinoa  =(ToggleButton) view.findViewById(R.id.button_Quinoa);
		isPressed.put((String) Quinoa.getTextOn(), true);
		
		Amaranth  =(ToggleButton) view.findViewById(R.id.button_Amaranth);
		isPressed.put((String) Amaranth.getTextOn(), true);
		
		Tempeh  =(ToggleButton) view.findViewById(R.id.button_Tempeh);
		isPressed.put((String) Tempeh.getTextOn(), true);
		
		Haferflocken  =(ToggleButton) view.findViewById(R.id.button_Haferflocken);
		isPressed.put((String) Haferflocken.getTextOn(), true);
		
		Seitan  =(ToggleButton) view.findViewById(R.id.button_Seitan);
		isPressed.put((String) Seitan.getTextOn(), true);
				
		Brunnenkresse  =(ToggleButton) view.findViewById(R.id.button_Brunnenkresse);
		isPressed.put((String) Brunnenkresse.getTextOn(), true);
		
		Senfblaetter  =(ToggleButton) view.findViewById(R.id.button_Senfblaetter);
		isPressed.put((String) Senfblaetter.getTextOn(), true);
		
		Kuerbiskerne  =(ToggleButton) view.findViewById(R.id.button_Kuerbiskerne);
		isPressed.put((String) Kuerbiskerne.getTextOn(), true);
		
		Sesamsaat  =(ToggleButton) view.findViewById(R.id.button_Sesamsaat);
		isPressed.put((String) Sesamsaat.getTextOn(), true);
		
		Hirse  =(ToggleButton) view.findViewById(R.id.button_Hirse);
		isPressed.put((String) Hirse.getTextOn(), true);
		
		return view;
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
	/**
	 * Diese Methoden Unterscheidet zwischen Bitton die angeklickt sind.
	 * Je nach Aktion Sie ruft die Methode auf, die fürs Sepciher bzw. Löschen zuständig ist
	 * und merkt diese in der Hashmap 
	 * @param view - Die View des jeweiliges Bottons
	 */
	public void imageClickEiweiss(View view){
			switch (view.getId()) {
			case R.id.button_Raeuchertofu:
				if (isPressed.get(Raeuchertofu.getTextOn())) {
					setIngredient((String) Raeuchertofu.getTextOn());
					isPressed.put((String) Raeuchertofu.getTextOn(), false);
				}else{
					deleteIngredient((String) Raeuchertofu.getTextOn());
					isPressed.put((String) Raeuchertofu.getTextOn(), true);
				}
				break;
			case R.id.button_Seidentofu:
				if (isPressed.get(Seidentofu.getTextOn())) {
					setIngredient((String) Seidentofu.getTextOn());
					isPressed.put((String) Seidentofu.getTextOn(), false);
				}else{
					deleteIngredient((String) Seidentofu.getTextOn());
					isPressed.put((String) Seidentofu.getTextOn(), true);
				}
				break;
				
			case R.id.button_Amaranthsprossen:
				if (isPressed.get(Amaranthsprossen.getTextOn())) {
					setIngredient((String) Amaranthsprossen.getTextOn());
					isPressed.put((String) Amaranthsprossen.getTextOn(), false);
				}else{
					deleteIngredient((String) Amaranthsprossen.getTextOn());
					isPressed.put((String) Amaranthsprossen.getTextOn(), true);
				}
				break;
				
			case R.id.button_Ei:
				if (isPressed.get(Ei.getTextOn())) {
					setIngredient((String) Ei.getTextOn());
					isPressed.put((String) Ei.getTextOn(), false);
				}else{
					deleteIngredient((String) Ei.getTextOn());
					isPressed.put((String) Ei.getTextOn(), true);
				}
				break;
				
			case R.id.button_Kidneybohnen:
				if (isPressed.get(Kidneybohnen.getTextOn())) {
					setIngredient((String) Kidneybohnen.getTextOn());
					isPressed.put((String) Kidneybohnen.getTextOn(), false);
				}else{
					deleteIngredient((String) Kidneybohnen.getTextOn());
					isPressed.put((String) Kidneybohnen.getTextOn(), true);
				}
				break;
								
			case R.id.button_Mungobohnen:
				if (isPressed.get(Mungobohnen.getTextOn())) {
					setIngredient((String) Mungobohnen.getTextOn());
					isPressed.put((String) Mungobohnen.getTextOn(), false);
				}else{
					deleteIngredient((String) Mungobohnen.getTextOn());
					isPressed.put((String) Mungobohnen.getTextOn(), true);
				}
				break;
				
			case R.id.button_Sojabohnen:
				if (isPressed.get(Sojabohnen.getTextOn())) {
					setIngredient((String) Sojabohnen.getTextOn());
					isPressed.put((String) Sojabohnen.getTextOn(), false);
				}else{
					deleteIngredient((String) Sojabohnen.getTextOn());
					isPressed.put((String) Sojabohnen.getTextOn(), true);
				}
				break;
				
			case R.id.button_Leinsamen:
				if (isPressed.get(Leinsamen.getTextOn())) {
					setIngredient((String) Leinsamen.getTextOn());
					isPressed.put((String) Leinsamen.getTextOn(), false);
				}else{
					deleteIngredient((String) Leinsamen.getTextOn());
					isPressed.put((String) Leinsamen.getTextOn(), true);
				}
				break;
				
			case R.id.button_Erdnuesse:
				if (isPressed.get(Erdnuesse.getTextOn())) {
					setIngredient((String) Erdnuesse.getTextOn());
					isPressed.put((String) Erdnuesse.getTextOn(), false);
				}else{
					deleteIngredient((String) Erdnuesse.getTextOn());
					isPressed.put((String) Erdnuesse.getTextOn(), true);
				}
				break;
					
			case R.id.button_Cashewnuesse:
				if (isPressed.get(Cashewnuesse.getTextOn())) {
					setIngredient((String) Cashewnuesse.getTextOn());
					isPressed.put((String) Cashewnuesse.getTextOn(), false);
				}else{
					deleteIngredient((String) Cashewnuesse.getTextOn());
					isPressed.put((String) Cashewnuesse.getTextOn(), true);
				}
				break;
				
			case R.id.button_Sonnenblumenkerne:
				if (isPressed.get(Sonnenblumenkerne.getTextOn())) {
					setIngredient((String) Sonnenblumenkerne.getTextOn());
					isPressed.put((String) Sonnenblumenkerne.getTextOn(), false);
				}else{
					deleteIngredient((String) Sonnenblumenkerne.getTextOn());
					isPressed.put((String) Sonnenblumenkerne.getTextOn(), true);
				}
				break;
				
			case R.id.button_Chia_Samen:
				if (isPressed.get(Chia_Samen.getTextOn())) {
					setIngredient((String) Chia_Samen.getTextOn());
					isPressed.put((String) Chia_Samen.getTextOn(), false);
				}else{
					deleteIngredient((String) Chia_Samen.getTextOn());
					isPressed.put((String) Chia_Samen.getTextOn(), true);
				}
				break;
				
			case R.id.button_Mandeln:
				if (isPressed.get(Mandeln.getTextOn())) {
					setIngredient((String) Mandeln.getTextOn());
					isPressed.put((String) Mandeln.getTextOn(), false);
				}else{
					deleteIngredient((String) Mandeln.getTextOn());
					isPressed.put((String) Mandeln.getTextOn(), true);
				}
				break;
				
			case R.id.button_Quinoa:
				if (isPressed.get(Quinoa.getTextOn())) {
					setIngredient((String) Quinoa.getTextOn());
					isPressed.put((String) Quinoa.getTextOn(), false);
				}else{
					deleteIngredient((String) Quinoa.getTextOn());
					isPressed.put((String) Quinoa.getTextOn(), true);
				}
				break;
				
			case R.id.button_Amaranth:
				if (isPressed.get(Amaranth.getTextOn())) {
					setIngredient((String) Amaranth.getTextOn());
					isPressed.put((String) Amaranth.getTextOn(), false);
				}else{
					deleteIngredient((String) Amaranth.getTextOn());
					isPressed.put((String) Amaranth.getTextOn(), true);
				}
				break;
				
			case R.id.button_Tempeh:
				if (isPressed.get(Tempeh.getTextOn())) {
					setIngredient((String) Tempeh.getTextOn());
					isPressed.put((String) Tempeh.getTextOn(), false);
				}else{
					deleteIngredient((String) Tempeh.getTextOn());
					isPressed.put((String) Tempeh.getTextOn(), true);
				}
				break;
				
			case R.id.button_Haferflocken:
				if (isPressed.get(Haferflocken.getTextOn())) {
					setIngredient((String) Haferflocken.getTextOn());
					isPressed.put((String) Haferflocken.getTextOn(), false);
				}else{
					deleteIngredient((String) Haferflocken.getTextOn());
					isPressed.put((String) Haferflocken.getTextOn(), true);
				}
				break;
				
			case R.id.button_Seitan:
				if (isPressed.get(Seitan.getTextOn())) {
					setIngredient((String) Seitan.getTextOn());
					isPressed.put((String) Seitan.getTextOn(), false);
				}else{
					deleteIngredient((String) Seitan.getTextOn());
					isPressed.put((String) Seitan.getTextOn(), true);
				}
				break;
				
			case R.id.button_Brunnenkresse:
				if (isPressed.get(Brunnenkresse.getTextOn())) {
					setIngredient((String) Brunnenkresse.getTextOn());
					isPressed.put((String) Brunnenkresse.getTextOn(), false);
				}else{
					deleteIngredient((String) Brunnenkresse.getTextOn());
					isPressed.put((String) Brunnenkresse.getTextOn(), true);
				}
				break;
				
			case R.id.button_Sesamsaat:
				if (isPressed.get(Sesamsaat.getTextOn())) {
					setIngredient((String) Sesamsaat.getTextOn());
					isPressed.put((String) Sesamsaat.getTextOn(), false);
				}else{
					deleteIngredient((String) Sesamsaat.getTextOn());
					isPressed.put((String) Sesamsaat.getTextOn(), true);
				}
				break;
				
			case R.id.button_Hirse:
				if (isPressed.get(Hirse.getTextOn())) {
					setIngredient((String) Hirse.getTextOn());
					isPressed.put((String) Hirse.getTextOn(), false);
				}else{
					deleteIngredient((String) Hirse.getTextOn());
					isPressed.put((String) Hirse.getTextOn(), true);
				}
				break;
		
		default:
			break;
		}
	}
}
