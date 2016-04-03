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
 * Diese Klasse ist für das Anzeigen von Kohlenhydraten 
 * zuständigt. 
 * @author Emil Kowalewski 
 */
public class PyramidFragmentB extends Fragment {
	
	private ToggleButton brot;
	private ToggleButton nudeln;
	private ToggleButton weissmehl;
	private ToggleButton vollkornprodukte;
	private ToggleButton broetchen;
	private ToggleButton reis;
	private ToggleButton meis;
	private ToggleButton bulgur;
	private ToggleButton amaranth;
	private ToggleButton hirse;
	private ToggleButton haferflocken;
	private ToggleButton weizenmehl;
	private ToggleButton weizenvollkornmehl;
	private ToggleButton gnocci;
	private ToggleButton zucker;
	private ToggleButton hartweizen;
	private ToggleButton kirschen;
	
	
	View view;
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
	
		view = inflater.inflate(R.layout.fragment_piramid_fragment_b,  container,false);
		ingredientsList = new ArrayList<String>();
		isPressed = new HashMap<String, Boolean>();
		
		brot  =(ToggleButton) view.findViewById(R.id.button_Brot);
		isPressed.put((String) brot.getTextOn(), true);
		
		gnocci  =(ToggleButton) view.findViewById(R.id.button_Gnocci);
		isPressed.put((String) gnocci.getTextOn(), true);
		
		nudeln  =(ToggleButton) view.findViewById(R.id.button_Nudeln);
		isPressed.put((String) nudeln.getTextOn(), true);
		
		weissmehl  =(ToggleButton) view.findViewById(R.id.button_Weissmehl);
		isPressed.put((String) weissmehl.getTextOn(), true);

		vollkornprodukte  =(ToggleButton) view.findViewById(R.id.button_Vollkornprodukte);
		isPressed.put((String) vollkornprodukte.getTextOn(), true);
		
		kirschen = (ToggleButton) view.findViewById(R.id.button_Kirschen);
		isPressed.put((String) kirschen.getTextOn(), true);
		
		broetchen =(ToggleButton) view.findViewById(R.id.button_Broetchen);
		isPressed.put((String) broetchen.getTextOn(), true);
		
		reis  =(ToggleButton) view.findViewById(R.id.button_Reis);
		isPressed.put((String) reis.getTextOn(), true);
		
		meis  =(ToggleButton) view.findViewById(R.id.button_Meis);
		isPressed.put((String) meis.getTextOn(), true);
		
		bulgur  =(ToggleButton) view.findViewById(R.id.button_Bulgur);
		isPressed.put((String) bulgur.getTextOn(), true);
		
		amaranth  =(ToggleButton) view.findViewById(R.id.button_Amaranth);
		isPressed.put((String) amaranth.getTextOn(), true);
		
		hirse  =(ToggleButton) view.findViewById(R.id.button_Hirse);
		isPressed.put((String) hirse.getTextOn(), true);
		
		haferflocken  =(ToggleButton) view.findViewById(R.id.button_Haferflocken);
		isPressed.put((String) haferflocken.getTextOn(), true);
		
		weizenmehl  =(ToggleButton) view.findViewById(R.id.button_Weizenmehl);
		isPressed.put((String) weizenmehl.getTextOn(), true);
		
		weizenvollkornmehl  =(ToggleButton) view.findViewById(R.id.button_Weizenvollkornmehl);
		isPressed.put((String) weizenvollkornmehl.getTextOn(), true);
		
		zucker  =(ToggleButton) view.findViewById(R.id.button_Zucker);
		isPressed.put((String) zucker.getTextOn(), true);
		
		hartweizen  =(ToggleButton) view.findViewById(R.id.button_Hartweizen);
		isPressed.put((String) hartweizen.getTextOn(), true);
		
	
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
	
	public void imageClickRate(View view) {
		switch (view.getId()) {
		case R.id.button_Brot:
			if (isPressed.get(brot.getTextOn())) {
				setIngredient((String) brot.getTextOn());
				isPressed.put((String) brot.getTextOn(), false);
			}else{
				deleteIngredient((String) brot.getTextOn());
				isPressed.put((String) brot.getTextOn(), true);
			}
			break;
			
		case R.id.button_Nudeln:
			if (isPressed.get(nudeln.getTextOn())) {
				setIngredient((String) nudeln.getTextOn());
				isPressed.put((String) nudeln.getTextOn(), false);
			}else{
				deleteIngredient((String) nudeln.getTextOn());
				isPressed.put((String) nudeln.getTextOn(), true);
			}
			break;
			
		case R.id.button_Weissmehl:
			if (isPressed.get(weissmehl.getTextOn())) {
				setIngredient((String) weissmehl.getTextOn());
				isPressed.put((String) weissmehl.getTextOn(), false);
			}else{
				deleteIngredient((String) weissmehl.getTextOn());
				isPressed.put((String) weissmehl.getTextOn(), true);
			}
			break;
			
		case R.id.button_Vollkornprodukte:
			if (isPressed.get(vollkornprodukte.getTextOn())) {
				setIngredient((String) vollkornprodukte.getTextOn());
				isPressed.put((String) vollkornprodukte.getTextOn(), false);
			}else{
				deleteIngredient((String) vollkornprodukte.getTextOn());
				isPressed.put((String) vollkornprodukte.getTextOn(), true);
			}
			break;
			
		case R.id.button_Kirschen:
			if (isPressed.get(kirschen.getTextOn())) {
				setIngredient((String) kirschen.getTextOn());
				isPressed.put((String) kirschen.getTextOn(), false);
			}else{
				deleteIngredient((String) kirschen.getTextOn());
				isPressed.put((String) kirschen.getTextOn(), true);
			}
			break;
			
		case R.id.button_Broetchen:
			if (isPressed.get(broetchen.getTextOn())) {
				setIngredient((String) broetchen.getTextOn());
				isPressed.put((String) broetchen.getTextOn(), false);
			}else{
				deleteIngredient((String) broetchen.getTextOn());
				isPressed.put((String) broetchen.getTextOn(), true);
			}
			break;
			
		case R.id.button_Reis:
			if (isPressed.get(reis.getTextOn())) {
				setIngredient((String) reis.getTextOn());
				isPressed.put((String) reis.getTextOn(), false);
			}else{
				deleteIngredient((String) reis.getTextOn());
				isPressed.put((String) reis.getTextOn(), true);
			}
			break;
			
		case R.id.button_Meis:
			if (isPressed.get(meis.getTextOn())) {
				setIngredient((String) meis.getTextOn());
				isPressed.put((String) meis.getTextOn(), false);
			}else{
				deleteIngredient((String) meis.getTextOn());
				isPressed.put((String) meis.getTextOn(), true);
			}
			break;
			
		case R.id.button_Bulgur:
			if (isPressed.get(bulgur.getTextOn())) {
				setIngredient((String) bulgur.getTextOn());
				isPressed.put((String) bulgur.getTextOn(), false);
			}else{
				deleteIngredient((String) bulgur.getTextOn());
				isPressed.put((String) bulgur.getTextOn(), true);
			}
			break;
			
		case R.id.button_Amaranth:
			if (isPressed.get(amaranth.getTextOn())) {
				setIngredient((String) amaranth.getTextOn());
				isPressed.put((String) amaranth.getTextOn(), false);
			}else{
				deleteIngredient((String) amaranth.getTextOn());
				isPressed.put((String) amaranth.getTextOn(), true);
			}
			break;
			
		case R.id.button_Hirse:
			if (isPressed.get(hirse.getTextOn())) {
				setIngredient((String) hirse.getTextOn());
				isPressed.put((String) hirse.getTextOn(), false);
			}else{
				deleteIngredient((String) hirse.getTextOn());
				isPressed.put((String) hirse.getTextOn(), true);
			}
			break;
			
		case R.id.button_Haferflocken:
			if (isPressed.get(haferflocken.getTextOn())) {
				setIngredient((String) haferflocken.getTextOn());
				isPressed.put((String) haferflocken.getTextOn(), false);
			}else{
				deleteIngredient((String) haferflocken.getTextOn());
				isPressed.put((String) haferflocken.getTextOn(), true);
			}
			break;
			
		case R.id.button_Weizenmehl:
			if (isPressed.get(weizenmehl.getTextOn())) {
				setIngredient((String) weizenmehl.getTextOn());
				isPressed.put((String) weizenmehl.getTextOn(), false);
			}else{
				deleteIngredient((String) weizenmehl.getTextOn());
				isPressed.put((String) weizenmehl.getTextOn(), true);
			}
			break;
			
		case R.id.button_Weizenvollkornmehl:
			if (isPressed.get(weizenvollkornmehl.getTextOn())) {
				setIngredient((String) weizenvollkornmehl.getTextOn());
				isPressed.put((String) weizenvollkornmehl.getTextOn(), false);
			}else{
				deleteIngredient((String) weizenvollkornmehl.getTextOn());
				isPressed.put((String) weizenvollkornmehl.getTextOn(), true);
			}
			break;
			
		case R.id.button_Gnocci:
			if (isPressed.get(gnocci.getTextOn())) {
				setIngredient((String) gnocci.getTextOn());
				isPressed.put((String) gnocci.getTextOn(), false);
			}else{
				deleteIngredient((String) gnocci.getTextOn());
				isPressed.put((String) gnocci.getTextOn(), true);
			}
			break;
			
		case R.id.button_Zucker:
			if (isPressed.get(zucker.getTextOn())) {
				setIngredient((String) zucker.getTextOn());
				isPressed.put((String) zucker.getTextOn(), false);
			}else{
				deleteIngredient((String) zucker.getTextOn());
				isPressed.put((String) zucker.getTextOn(), true);
			}
			break;
			
		case R.id.button_Hartweizen:
			if (isPressed.get(hartweizen.getTextOn())) {
				setIngredient((String) hartweizen.getTextOn());
				isPressed.put((String) hartweizen.getTextOn(), false);
			}else{
				deleteIngredient((String) hartweizen.getTextOn());
				isPressed.put((String) hartweizen.getTextOn(), true);
			}
			break;
			
			
		default:
			break;
		}
		
	}

}
