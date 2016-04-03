package de.piramid.sawa;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.testsawa.R;
import com.example.testsawa.R.layout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;
/**
 * Diese Klasse ist für das Anzeigen von Obst und Gemüse 
 * zuständigt. 
 * @author Emil Kowalewski
 *
 */
public class PyramidFragmentA extends Fragment {
	private ArrayList<String> ingredientsList;	
	private ToggleButton tomate;
	private ToggleButton acerola;
	private ToggleButton ananas;
	private ToggleButton apfel;
	private ToggleButton apfelbeere;
	private ToggleButton aprikose;
	private ToggleButton aronia;
	private ToggleButton artischocke;
	private ToggleButton avocado;
	private ToggleButton banane;
	private ToggleButton birne;
	private ToggleButton blaubeeren;
	private ToggleButton blaukraut;
	private ToggleButton blumenkohl;
	private ToggleButton brokkoli;
	private ToggleButton bohnen;
	private ToggleButton cashewnuss;
	private ToggleButton chinakohl;
	private ToggleButton dattel;
	private ToggleButton drachenfrucht;
	private ToggleButton erdbeere;
	private ToggleButton erbsen;
	private ToggleButton feldsalat; 
	private ToggleButton grapefruit;
	private ToggleButton gruene_Bohnen;
	private ToggleButton gruenkohl;
	private ToggleButton gurke;
	private ToggleButton haselnuss;
	private ToggleButton himbeere;
	private ToggleButton honigmelone;
	private ToggleButton ingwer;
	private ToggleButton kartoffel;
	private ToggleButton kaktusfeige;
	private ToggleButton karotten;
	private ToggleButton kichererbsen;
	private ToggleButton kirschen;
	private ToggleButton knoblauch;
	private ToggleButton kohlrabi;
	private ToggleButton kohlruebe;
	private ToggleButton kokosnuss;
	private ToggleButton kiwi;
	private ToggleButton kopfsalat;
	private ToggleButton rosenkohl;
	private ToggleButton kuerbis;
	private ToggleButton lauch;
	private ToggleButton limette;
	private ToggleButton zucchini;
	private ToggleButton zuckererbsen;
	private ToggleButton zwiebel;
	private ToggleButton walnuss;
	private ToggleButton trauben;
	private ToggleButton schwarzwurzel;
	private ToggleButton sojabohnen;
	private ToggleButton spargel;
	private ToggleButton speierling;
	private ToggleButton spinat;
	private ToggleButton spitzkohl;
	private ToggleButton suesskartoffel;
	private ToggleButton radieschen;
	private ToggleButton rotkohl;
	private ToggleButton rucola;
	private ToggleButton romana_Salat;
	private ToggleButton paprika;
	private ToggleButton paranuss;
	private ToggleButton pistazie;
	private ToggleButton pfifferlinge;
	private ToggleButton pfirsich;
	private ToggleButton pflaume;
	private ToggleButton porree;
	private ToggleButton pastinake;
	private ToggleButton sternfrucht;
	private ToggleButton linsen;	
	private View view;
	private HashMap<String, Boolean> isPressed;
	
	/**
	 * Diese Methode fegt die ToggleButtons fest.
	 * Die Buttons werden in einer Hashmap gespeichert als key. 
	 * Der Value liegt fest ob der Button ankeglick wurde.
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_piramid_fragment_a,  container,false);
		ingredientsList = new ArrayList<String>();
		isPressed = new HashMap<String, Boolean>();
		
		 acerola  =(ToggleButton) view.findViewById(R.id.button_Acerola);
		 isPressed.put((String) acerola.getTextOn(), true);
		 
		 linsen  =(ToggleButton) view.findViewById(R.id.button_Linsen);
		 isPressed.put((String) linsen.getTextOn(), true);
		 
		 ananas =(ToggleButton) view.findViewById(R.id.button_Ananas);
		 isPressed.put((String) ananas.getTextOn(), true);
		 
		 apfel =(ToggleButton) view.findViewById(R.id.button_Apfel);
		 isPressed.put((String) apfel.getTextOn(), true);
		 
		 apfelbeere =(ToggleButton) view.findViewById(R.id.button_Apfelbeere);
		 isPressed.put((String) apfelbeere.getTextOn(), true);
		 
		 aprikose =(ToggleButton) view.findViewById(R.id.button_Aprikose);
		 isPressed.put((String) aprikose.getTextOn(), true);
		 
		 aronia =(ToggleButton) view.findViewById(R.id.button_Aronia);
		 isPressed.put((String) aronia.getTextOn(), true);
		 
		 artischocke =(ToggleButton) view.findViewById(R.id.button_Artischocke);
		 isPressed.put((String) artischocke.getTextOn(), true);
		 
		 avocado =(ToggleButton) view.findViewById(R.id.button_Avocado);
		 isPressed.put((String) avocado.getTextOn(), true);
		 
		 banane =(ToggleButton) view.findViewById(R.id.button_Banane);
		 isPressed.put((String) banane.getTextOn(), true);
		 
		 birne =(ToggleButton) view.findViewById(R.id.button_Birne);
		 isPressed.put((String) birne.getTextOn(), true);
		 
		 blaubeeren =(ToggleButton) view.findViewById(R.id.button_Blaubeeren);
		 isPressed.put((String) blaubeeren.getTextOn(), true);
		 
		 blaukraut =(ToggleButton) view.findViewById(R.id.button_Blaukraut);
		 isPressed.put((String) blaukraut.getTextOn(), true);
		 
		 blumenkohl =(ToggleButton) view.findViewById(R.id.button_Blumenkohl);
		 isPressed.put((String) blumenkohl.getTextOn(), true);
		 
		 brokkoli =(ToggleButton) view.findViewById(R.id.button_Brokkoli);
		 isPressed.put((String) brokkoli.getTextOn(), true);
		 
		 bohnen =(ToggleButton) view.findViewById(R.id.button_Bohnen);
		 isPressed.put((String) bohnen.getTextOn(), true);
		 
		 cashewnuss =(ToggleButton) view.findViewById(R.id.button_Cashewnuss);
		 isPressed.put((String) cashewnuss.getTextOn(), true);
		 
		 chinakohl =(ToggleButton) view.findViewById(R.id.button_Chinakohl);
		 isPressed.put((String) chinakohl.getTextOn(), true);
		 
		 dattel =(ToggleButton) view.findViewById(R.id.button_Dattel);
		 isPressed.put((String) dattel.getTextOn(), true);
		 
		 drachenfrucht =(ToggleButton) view.findViewById(R.id.button_Drachenfrucht);
		 isPressed.put((String) drachenfrucht.getTextOn(), true);
		 
		 erdbeere =(ToggleButton) view.findViewById(R.id.button_Erdbeere);
		 isPressed.put((String) erdbeere.getTextOn(), true);
		 
		 erbsen =(ToggleButton) view.findViewById(R.id.button_Erbsen);
		 isPressed.put((String) erbsen.getTextOn(), true);
		 
		 feldsalat =(ToggleButton) view.findViewById(R.id.button_Feldsalat); 
		 isPressed.put((String) feldsalat.getTextOn(), true);
		 
		 grapefruit =(ToggleButton) view.findViewById(R.id.button_Grapefruit);
		 isPressed.put((String) grapefruit.getTextOn(), true);
		 
		 gruene_Bohnen =(ToggleButton) view.findViewById(R.id.button_Gruene_Bohnen);
		 isPressed.put((String) gruene_Bohnen.getTextOn(), true);
		 
		 gruenkohl =(ToggleButton) view.findViewById(R.id.button_Gruenkohl);
		 isPressed.put((String) gruenkohl.getTextOn(), true);
		 
		 gurke =(ToggleButton) view.findViewById(R.id.button_Gurke);
		 isPressed.put((String) gurke.getTextOn(), true);
		 
		 haselnuss =(ToggleButton) view.findViewById(R.id.button_Haselnuss);
		 isPressed.put((String) haselnuss.getTextOn(), true);
		 
		 himbeere =(ToggleButton) view.findViewById(R.id.button_Himbeere);
		 isPressed.put((String) himbeere.getTextOn(), true);
		 
		 honigmelone =(ToggleButton) view.findViewById(R.id.button_Honigmelone);
		 isPressed.put((String) honigmelone.getTextOn(), true);
		 
		 ingwer =(ToggleButton) view.findViewById(R.id.button_Ingwer);
		 isPressed.put((String) ingwer.getTextOn(), true);
		 
		 kartoffel =(ToggleButton) view.findViewById(R.id.button_Kartoffel);
		 isPressed.put((String) kartoffel.getTextOn(), true);
		 
		 kaktusfeige =(ToggleButton) view.findViewById(R.id.button_Kaktusfeige);
		 isPressed.put((String) kaktusfeige.getTextOn(), true);
		 
		 karotten =(ToggleButton) view.findViewById(R.id.button_Karotten);
		 isPressed.put((String) karotten.getTextOn(), true);
		 
		 kichererbsen =(ToggleButton) view.findViewById(R.id.button_Kichererbsen);
		 isPressed.put((String) kichererbsen.getTextOn(), true);
		 
		 kirschen =(ToggleButton) view.findViewById(R.id.button_Kirschen);
		 isPressed.put((String) kirschen.getTextOn(), true);
		 
		 knoblauch =(ToggleButton) view.findViewById(R.id.button_Knoblauch);
		 isPressed.put((String) knoblauch.getTextOn(), true);
		 
		 kohlrabi =(ToggleButton) view.findViewById(R.id.button_Kohlrabi);
		 isPressed.put((String) kohlrabi.getTextOn(), true);
		 
		 kohlruebe =(ToggleButton) view.findViewById(R.id.button_Kohlruebe);
		 isPressed.put((String) kohlruebe.getTextOn(), true);
		 
		 kokosnuss =(ToggleButton) view.findViewById(R.id.button_Kokosnuss);
		 isPressed.put((String) kokosnuss.getTextOn(), true);
		 
		 kopfsalat =(ToggleButton) view.findViewById(R.id.button_Kopfsalat);
		 isPressed.put((String) kopfsalat.getTextOn(), true);
		 
		 kiwi =(ToggleButton) view.findViewById(R.id.button_Kiwi);
		 isPressed.put((String) kiwi.getTextOn(), true);
		 
		 kuerbis =(ToggleButton) view.findViewById(R.id.button_Kuerbis);
		 isPressed.put((String) kuerbis.getTextOn(), true);
		 
		 lauch =(ToggleButton) view.findViewById(R.id.button_Lauch);
		 isPressed.put((String) lauch.getTextOn(), true);
		 
		 limette =(ToggleButton) view.findViewById(R.id.button_Limette);
		 isPressed.put((String) limette.getTextOn(), true);
		 
		 zucchini =(ToggleButton) view.findViewById(R.id.button_Zucchini);
		 isPressed.put((String) zucchini.getTextOn(), true);
		 
		 zuckererbsen =(ToggleButton) view.findViewById(R.id.button_Zuckererbsen);
		 isPressed.put((String) zuckererbsen.getTextOn(), true);
		 
		 zwiebel =(ToggleButton) view.findViewById(R.id.button_Zwiebel);
		 isPressed.put((String) zwiebel.getTextOn(), true);
		 
		 walnuss =(ToggleButton) view.findViewById(R.id.button_Walnuss);
		 isPressed.put((String) walnuss.getTextOn(), true);
		 
		 trauben =(ToggleButton) view.findViewById(R.id.button_Trauben);
		 isPressed.put((String) trauben.getTextOn(), true);
		 
		 schwarzwurzel =(ToggleButton) view.findViewById(R.id.button_Schwarzwurzel);
		 isPressed.put((String) schwarzwurzel.getTextOn(), true);
		 
		 sojabohnen =(ToggleButton) view.findViewById(R.id.button_Sojabohnen);
		 isPressed.put((String) sojabohnen.getTextOn(), true);
		 
		 spargel =(ToggleButton) view.findViewById(R.id.button_Spargel);
		 isPressed.put((String) spargel.getTextOn(), true);
		 
		 speierling =(ToggleButton) view.findViewById(R.id.button_Speierling);
		 isPressed.put((String) speierling.getTextOn(), true);
		 
		 spinat =(ToggleButton) view.findViewById(R.id.button_Spinat);
		 isPressed.put((String) spinat.getTextOn(), true);
		 
		 spitzkohl =(ToggleButton) view.findViewById(R.id.button_Spitzkohl);
		 isPressed.put((String) spitzkohl.getTextOn(), true);
		 
		 suesskartoffel =(ToggleButton) view.findViewById(R.id.button_Suesskartoffel);
		 isPressed.put((String) suesskartoffel.getTextOn(), true);
		 
		 radieschen =(ToggleButton) view.findViewById(R.id.button_Radieschen);
		 isPressed.put((String) radieschen.getTextOn(), true);
		 
		 rotkohl =(ToggleButton) view.findViewById(R.id.button_Rotkohl);
		 isPressed.put((String) rotkohl.getTextOn(), true);
		 
		 rosenkohl =(ToggleButton) view.findViewById(R.id.button_Rosenkohl);
		 isPressed.put((String) rosenkohl.getTextOn(), true);
		 
		 rucola =(ToggleButton) view.findViewById(R.id.button_Rucola);
		 isPressed.put((String) rucola.getTextOn(), true);
		 
		 romana_Salat =(ToggleButton) view.findViewById(R.id.button_Romana_Salat);
		 isPressed.put((String) romana_Salat.getTextOn(), true);
		 
		 paprika =(ToggleButton) view.findViewById(R.id.button_Paprika);
		 isPressed.put((String) paprika.getTextOn(), true);
		 
		 paranuss =(ToggleButton) view.findViewById(R.id.button_Paranuss);
		 isPressed.put((String) paranuss.getTextOn(), true);
		 
		 pistazie =(ToggleButton) view.findViewById(R.id.button_Pistazie);
		 isPressed.put((String) pistazie.getTextOn(), true);
		 
		 pfifferlinge =(ToggleButton) view.findViewById(R.id.button_Pfifferlinge);
		 isPressed.put((String) pfifferlinge.getTextOn(), true);
		 
		 pfirsich =(ToggleButton) view.findViewById(R.id.button_Pfirsich);
		 isPressed.put((String) pfirsich.getTextOn(), true);
		 
		 pflaume =(ToggleButton) view.findViewById(R.id.button_Pflaume);
		 isPressed.put((String) pflaume.getTextOn(), true);
		 
		 porree =(ToggleButton) view.findViewById(R.id.button_Porree);
		 isPressed.put((String) porree.getTextOn(), true);
		 
		 pastinake =(ToggleButton) view.findViewById(R.id.button_Pastinake);
		 isPressed.put((String) pastinake.getTextOn(), true);
		 
		 sternfrucht =(ToggleButton) view.findViewById(R.id.button_Sternfrucht);
		 isPressed.put((String) sternfrucht.getTextOn(), true);
		
		 
		 tomate =(ToggleButton) view.findViewById(R.id.button_Tomate);
		 isPressed.put((String) tomate.getTextOn(), true);
		
		 
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
       
    }
    /**
     * Diese Methode löscht aus der List die angeklickte Zutat
     * @param ingredient - die Zutat, die weg geklickt war
     */
    public void deleteIngredient(String ingredient){
    	if (!ingredientsList.isEmpty()) {
			ingredientsList.remove(ingredient);
		}
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
	public void imageClick(View view) {
		
		switch (view.getId()) {
		case R.id.button_Acerola:
			if (isPressed.get(acerola.getTextOn())) {
				setIngredient((String) acerola.getTextOn());
				isPressed.put((String) acerola.getTextOn(), false);
			}else{
				deleteIngredient((String) acerola.getTextOn());
				isPressed.put((String) acerola.getTextOn(), true);
			}
			break;
			
		case R.id.button_Ananas:
			if (isPressed.get(ananas.getTextOn())) {
				setIngredient((String) ananas.getTextOn());
				isPressed.put((String) ananas.getTextOn(), false);
			}else{
				deleteIngredient((String) ananas.getTextOn());
				isPressed.put((String) ananas.getTextOn(), true);
			}
			break;
			
		case R.id.button_Apfel:
			if (isPressed.get(apfel.getTextOn())) {
				setIngredient((String) apfel.getTextOn());
				isPressed.put((String) apfel.getTextOn(), false);
			}else{
				deleteIngredient((String) apfel.getTextOn());
				isPressed.put((String) apfel.getTextOn(), true);
			}
			break;
			
		case R.id.button_Apfelbeere:
			if (isPressed.get(apfelbeere.getTextOn())) {
				setIngredient((String) apfelbeere.getTextOn());
				isPressed.put((String) apfelbeere.getTextOn(), false);
			}else{
				deleteIngredient((String) apfelbeere.getTextOn());
				isPressed.put((String) apfelbeere.getTextOn(), true);
			}
			break;
			
		case R.id.button_Aprikose:
			if (isPressed.get(aprikose.getTextOn())) {
				setIngredient((String) aprikose.getTextOn());
				isPressed.put((String) aprikose.getTextOn(), false);
			}else{
				deleteIngredient((String) aprikose.getTextOn());
				isPressed.put((String) aprikose.getTextOn(), true);
			}
			break;
			
		case R.id.button_Aronia:
			if (isPressed.get(aronia.getTextOn())) {
				setIngredient((String) aronia.getTextOn());
				isPressed.put((String) aronia.getTextOn(), false);
			}else{
				deleteIngredient((String) aronia.getTextOn());
				isPressed.put((String) aronia.getTextOn(), true);
			}
			break;
			
		case R.id.button_Artischocke:
			if (isPressed.get(artischocke.getTextOn())) {
				setIngredient((String) artischocke.getTextOn());
				isPressed.put((String) artischocke.getTextOn(), false);
			}else{
				deleteIngredient((String) artischocke.getTextOn());
				isPressed.put((String) artischocke.getTextOn(), true);
			}
			break;
			
		case R.id.button_Avocado:
			if (isPressed.get(avocado.getTextOn())) {
				setIngredient((String) avocado.getTextOn());
				isPressed.put((String) avocado.getTextOn(), false);
			}else{
				deleteIngredient((String) avocado.getTextOn());
				isPressed.put((String) avocado.getTextOn(), true);
			}
			break;
			
		case R.id.button_Banane:
			if (isPressed.get(banane.getTextOn())) {
				setIngredient((String) banane.getTextOn());
				isPressed.put((String) banane.getTextOn(), false);
			}else{
				deleteIngredient((String) banane.getTextOn());
				isPressed.put((String) banane.getTextOn(), true);
			}
			break;
			
		case R.id.button_Birne:
			if (isPressed.get(birne.getTextOn())) {
				setIngredient((String) birne.getTextOn());
				isPressed.put((String) birne.getTextOn(), false);
			}else{
				deleteIngredient((String) birne.getTextOn());
				isPressed.put((String) birne.getTextOn(), true);
			}
			break;
			
		case R.id.button_Blaubeeren:
			if (isPressed.get(blaubeeren.getTextOn())) {
				setIngredient((String) blaubeeren.getTextOn());
				isPressed.put((String) blaubeeren.getTextOn(), false);
			}else{
				deleteIngredient((String) blaubeeren.getTextOn());
				isPressed.put((String) blaubeeren.getTextOn(), true);
			}
			break;
			
		case R.id.button_Blaukraut:
			if (isPressed.get(blaukraut.getTextOn())) {
				setIngredient((String) blaukraut.getTextOn());
				isPressed.put((String) blaukraut.getTextOn(), false);
			}else{
				deleteIngredient((String) blaukraut.getTextOn());
				isPressed.put((String) blaukraut.getTextOn(), true);
			}
			break;
		case R.id.button_Blumenkohl:
			if (isPressed.get(blumenkohl.getTextOn())) {
				setIngredient((String) blumenkohl.getTextOn());
				isPressed.put((String) blumenkohl.getTextOn(), false);
				
			}else{
				deleteIngredient((String) blumenkohl.getTextOn());
				isPressed.put((String) blumenkohl.getTextOn(), true);
			}
			break;
			
		case R.id.button_Bohnen:
			if (isPressed.get(bohnen.getTextOn())) {
				setIngredient((String) bohnen.getTextOn());
				isPressed.put((String) bohnen.getTextOn(), false);
				
			}else{
				deleteIngredient((String) bohnen.getTextOn());
				isPressed.put((String) bohnen.getTextOn(), true);
			}
			break;
			
		case R.id.button_Brokkoli:
			if (isPressed.get(brokkoli.getTextOn())) {
				setIngredient((String) brokkoli.getTextOn());
				isPressed.put((String) brokkoli.getTextOn(), false);
				
			}else{
				deleteIngredient((String) brokkoli.getTextOn());
				isPressed.put((String) brokkoli.getTextOn(), true);
			}
			break;
		case R.id.button_Cashewnuss:
			if (isPressed.get(cashewnuss.getTextOn())) {
				setIngredient((String) cashewnuss.getTextOn());
				isPressed.put((String) cashewnuss.getTextOn(), false);
				
			}else{
				deleteIngredient((String) cashewnuss.getTextOn());
				isPressed.put((String) cashewnuss.getTextOn(), true);
			}
			break;
		case R.id.button_Chinakohl:
			if (isPressed.get(chinakohl.getTextOn())) {
				setIngredient((String) chinakohl.getTextOn());
				isPressed.put((String) chinakohl.getTextOn(), false);
				
			}else{
				deleteIngredient((String) chinakohl.getTextOn());
				isPressed.put((String) chinakohl.getTextOn(), true);
			}
			break;
		case R.id.button_Dattel:
			if (isPressed.get(dattel.getTextOn())) {
				setIngredient((String) dattel.getTextOn());
				isPressed.put((String) dattel.getTextOn(), false);
				
			}else{
				deleteIngredient((String) dattel.getTextOn());
				isPressed.put((String) dattel.getTextOn(), true);
			}
			break;
		case R.id.button_Drachenfrucht:
			if (isPressed.get(drachenfrucht.getTextOn())) {
				setIngredient((String) drachenfrucht.getTextOn());
				isPressed.put((String) drachenfrucht.getTextOn(), false);
				
			}else{
				deleteIngredient((String) drachenfrucht.getTextOn());
				isPressed.put((String) drachenfrucht.getTextOn(), true);
			}
			break;
		case R.id.button_Erbsen:
			if (isPressed.get(erbsen.getTextOn())) {
				setIngredient((String) erbsen.getTextOn());
				isPressed.put((String) erbsen.getTextOn(), false);
				
			}else{
				deleteIngredient((String) erbsen.getTextOn());
				isPressed.put((String) erbsen.getTextOn(), true);
			}
			break;
		case R.id.button_Erdbeere:
			if (isPressed.get(erdbeere.getTextOn())) {
				setIngredient((String) erdbeere.getTextOn());
				isPressed.put((String) erdbeere.getTextOn(), false);
				
			}else{
				deleteIngredient((String) erdbeere.getTextOn());
				isPressed.put((String) erdbeere.getTextOn(), true);
			}
			break;
		case R.id.button_Feldsalat:
			if (isPressed.get(feldsalat.getTextOn())) {
				setIngredient((String) feldsalat.getTextOn());
				isPressed.put((String) feldsalat.getTextOn(), false);
				
			}else{
				deleteIngredient((String) feldsalat.getTextOn());
				isPressed.put((String) feldsalat.getTextOn(), true);
			}
			break;
		case R.id.button_Grapefruit:
			if (isPressed.get(grapefruit.getTextOn())) {
				setIngredient((String) grapefruit.getTextOn());
				isPressed.put((String) grapefruit.getTextOn(), false);
				
			}else{
				deleteIngredient((String) grapefruit.getTextOn());
				isPressed.put((String) grapefruit.getTextOn(), true);
			}
			break;
		case R.id.button_Gruene_Bohnen://
			if (isPressed.get(acerola.getTextOn())) {
				setIngredient((String) acerola.getTextOn());
				isPressed.put((String) acerola.getTextOn(), false);
				
			}else{
				deleteIngredient((String) acerola.getTextOn());
				isPressed.put((String) acerola.getTextOn(), true);
			}
			break;
		case R.id.button_Gruenkohl:
			if (isPressed.get(gruenkohl.getTextOn())) {
				setIngredient((String) gruenkohl.getTextOn());
				isPressed.put((String) gruenkohl.getTextOn(), false);
				
			}else{
				deleteIngredient((String) gruenkohl.getTextOn());
				isPressed.put((String) gruenkohl.getTextOn(), true);
			}
			break;
		case R.id.button_Gurke:
			if (isPressed.get(gurke.getTextOn())) {
				setIngredient((String) gurke.getTextOn());
				isPressed.put((String) gurke.getTextOn(), false);
				
			}else{
				deleteIngredient((String) gurke.getTextOn());
				isPressed.put((String) gurke.getTextOn(), true);
			}
			break;
		case R.id.button_Haselnuss:
			if (isPressed.get(haselnuss.getTextOn())) {
				setIngredient((String) haselnuss.getTextOn());
				isPressed.put((String) haselnuss.getTextOn(), false);
				
			}else{
				deleteIngredient((String) haselnuss.getTextOn());
				isPressed.put((String) haselnuss.getTextOn(), true);
			}
			break;	
		case R.id.button_Himbeere:
			if (isPressed.get(himbeere.getTextOn())) {
				setIngredient((String) himbeere.getTextOn());
				isPressed.put((String) himbeere.getTextOn(), false);
				
			}else{
				deleteIngredient((String) himbeere.getTextOn());
				isPressed.put((String) himbeere.getTextOn(), true);
			}
			break;
		case R.id.button_Honigmelone:
			if (isPressed.get(honigmelone.getTextOn())) {
				setIngredient((String) honigmelone.getTextOn());
				isPressed.put((String) honigmelone.getTextOn(), false);
				
			}else{
				deleteIngredient((String) honigmelone.getTextOn());
				isPressed.put((String) honigmelone.getTextOn(), true);
			}
			break;
		case R.id.button_Ingwer:
			if (isPressed.get(ingwer.getTextOn())) {
				setIngredient((String) ingwer.getTextOn());
				isPressed.put((String) ingwer.getTextOn(), false);
				
			}else{
				deleteIngredient((String) ingwer.getTextOn());
				isPressed.put((String) ingwer.getTextOn(), true);
			}
			break;
		case R.id.button_Kaktusfeige:
			if (isPressed.get(kaktusfeige.getTextOn())) {
				setIngredient((String) kaktusfeige.getTextOn());
				isPressed.put((String) kaktusfeige.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kaktusfeige.getTextOn());
				isPressed.put((String) kaktusfeige.getTextOn(), true);
			}
			break;	
		case R.id.button_Karotten:
			if (isPressed.get(karotten.getTextOn())) {
				setIngredient((String) karotten.getTextOn());
				isPressed.put((String) karotten.getTextOn(), false);
				
			}else{
				deleteIngredient((String) karotten.getTextOn());
				isPressed.put((String) karotten.getTextOn(), true);
			}
			break;
		case R.id.button_Kartoffel:
			if (isPressed.get(kartoffel.getTextOn())) {
				setIngredient((String) kartoffel.getTextOn());
				isPressed.put((String) kartoffel.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kartoffel.getTextOn());
				isPressed.put((String) kartoffel.getTextOn(), true);
			}
			break;
		case R.id.button_Kichererbsen:
			if (isPressed.get(kichererbsen.getTextOn())) {
				setIngredient((String) kichererbsen.getTextOn());
				isPressed.put((String) kichererbsen.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kichererbsen.getTextOn());
				isPressed.put((String) kichererbsen.getTextOn(), true);
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
			
		case R.id.button_Kiwi:
			if (isPressed.get(kiwi.getTextOn())) {
				setIngredient((String) kiwi.getTextOn());
				isPressed.put((String) kiwi.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kiwi.getTextOn());
				isPressed.put((String) kiwi.getTextOn(), true);
			}
			break;
			
		case R.id.button_Knoblauch:
			if (isPressed.get(knoblauch.getTextOn())) {
				setIngredient((String) knoblauch.getTextOn());
				isPressed.put((String) knoblauch.getTextOn(), false);
				
			}else{
				deleteIngredient((String) knoblauch.getTextOn());
				isPressed.put((String) knoblauch.getTextOn(), true);
			}
			break;
		case R.id.button_Kohlrabi:
			if (isPressed.get(kohlrabi.getTextOn())) {
				setIngredient((String) kohlrabi.getTextOn());
				isPressed.put((String) kohlrabi.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kohlrabi.getTextOn());
				isPressed.put((String) kohlrabi.getTextOn(), true);
			}
			break;
		case R.id.button_Kohlruebe:
			if (isPressed.get(kohlruebe.getTextOn())) {
				setIngredient((String) kohlruebe.getTextOn());
				isPressed.put((String) kohlruebe.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kohlruebe.getTextOn());
				isPressed.put((String) kohlruebe.getTextOn(), true);
			}
			break;
		case R.id.button_Kokosnuss:
			if (isPressed.get(kokosnuss.getTextOn())) {
				setIngredient((String) kokosnuss.getTextOn());
				isPressed.put((String) kokosnuss.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kokosnuss.getTextOn());
				isPressed.put((String) kokosnuss.getTextOn(), true);
			}
			break;
		case R.id.button_Kopfsalat:
			if (isPressed.get(kopfsalat.getTextOn())) {
				setIngredient((String) kopfsalat.getTextOn());
				isPressed.put((String) kopfsalat.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kopfsalat.getTextOn());
				isPressed.put((String) kopfsalat.getTextOn(), true);
			}
			break;
		case R.id.button_Kuerbis:
			if (isPressed.get(kuerbis.getTextOn())) {
				setIngredient((String) kuerbis.getTextOn());
				isPressed.put((String) kuerbis.getTextOn(), false);
				
			}else{
				deleteIngredient((String) kuerbis.getTextOn());
				isPressed.put((String) kuerbis.getTextOn(), true);
			}
			break;
		case R.id.button_Lauch:
			if (isPressed.get(lauch.getTextOn())) {
				setIngredient((String) lauch.getTextOn());
				isPressed.put((String) lauch.getTextOn(), false);
				
			}else{
				deleteIngredient((String) lauch.getTextOn());
				isPressed.put((String) lauch.getTextOn(), true);
			}
			break;
			
		case R.id.button_Linsen:
			if (isPressed.get(linsen.getTextOn())) {
				setIngredient((String) linsen.getTextOn());
				isPressed.put((String) linsen.getTextOn(), false);
				
			}else{
				deleteIngredient((String) linsen.getTextOn());
				isPressed.put((String) linsen.getTextOn(), true);
			}
			
			break;
			
		case R.id.button_Limette:
			if (isPressed.get(limette.getTextOn())) {
				setIngredient((String) limette.getTextOn());
				isPressed.put((String) limette.getTextOn(), false);
				
			}else{
				deleteIngredient((String) limette.getTextOn());
				isPressed.put((String) limette.getTextOn(), true);
			}
			break;
		case R.id.button_Paprika:
			if (isPressed.get(paprika.getTextOn())) {
				setIngredient((String) paprika.getTextOn());
				isPressed.put((String) paprika.getTextOn(), false);
				
			}else{
				deleteIngredient((String) paprika.getTextOn());
				isPressed.put((String) paprika.getTextOn(), true);
			}
			break;	
		case R.id.button_Paranuss:
			if (isPressed.get(paranuss.getTextOn())) {
				setIngredient((String) paranuss.getTextOn());
				isPressed.put((String) paranuss.getTextOn(), false);
				
			}else{
				deleteIngredient((String) paranuss.getTextOn());
				isPressed.put((String) paranuss.getTextOn(), true);
			}
			break;
		case R.id.button_Pastinake:
			if (isPressed.get(pastinake.getTextOn())) {
				setIngredient((String) pastinake.getTextOn());
				isPressed.put((String) pastinake.getTextOn(), false);
				
			}else{
				deleteIngredient((String) pastinake.getTextOn());
				isPressed.put((String) pastinake.getTextOn(), true);
			}
			break;
		case R.id.button_Pfifferlinge:
			if (isPressed.get(pfifferlinge.getTextOn())) {
				setIngredient((String) pfifferlinge.getTextOn());
				isPressed.put((String) pfifferlinge.getTextOn(), false);
				
			}else{
				deleteIngredient((String) pfifferlinge.getTextOn());
				isPressed.put((String) pfifferlinge.getTextOn(), true);
			}
			break;
		case R.id.button_Pfirsich:
			if (isPressed.get(pfirsich.getTextOn())) {
				setIngredient((String) pfirsich.getTextOn());
				isPressed.put((String) pfirsich.getTextOn(), false);
				
			}else{
				deleteIngredient((String) pfirsich.getTextOn());
				isPressed.put((String) pfirsich.getTextOn(), true);
			}
			break;
		case R.id.button_Pflaume:
			if (isPressed.get(pflaume.getTextOn())) {
				setIngredient((String) pflaume.getTextOn());
				isPressed.put((String) pflaume.getTextOn(), false);
				
			}else{
				deleteIngredient((String) pflaume.getTextOn());
				isPressed.put((String) pflaume.getTextOn(), true);
			}
			break;
		case R.id.button_Pistazie:
			if (isPressed.get(pistazie.getTextOn())) {
				setIngredient((String) pistazie.getTextOn());
				isPressed.put((String) pistazie.getTextOn(), false);
				
			}else{
				deleteIngredient((String) pistazie.getTextOn());
				isPressed.put((String) pistazie.getTextOn(), true);
			}
			break;
		case R.id.button_Porree:
			if (isPressed.get(porree.getTextOn())) {
				setIngredient((String) porree.getTextOn());
				isPressed.put((String) porree.getTextOn(), false);
				
			}else{
				deleteIngredient((String) porree.getTextOn());
				isPressed.put((String) porree.getTextOn(), true);
			}
			break;
		case R.id.button_Radieschen:
			if (isPressed.get(radieschen.getTextOn())) {
				setIngredient((String) radieschen.getTextOn());
				isPressed.put((String) radieschen.getTextOn(), false);
				
			}else{
				deleteIngredient((String) radieschen.getTextOn());
				isPressed.put((String) radieschen.getTextOn(), true);
			}
			break;
		case R.id.button_Romana_Salat:
			if (isPressed.get(romana_Salat.getTextOn())) {
				setIngredient((String) romana_Salat.getTextOn());
				isPressed.put((String) romana_Salat.getTextOn(), false);
				
			}else{
				deleteIngredient((String) romana_Salat.getTextOn());
				isPressed.put((String) romana_Salat.getTextOn(), true);
			}
			break;
			
		case R.id.button_Rosenkohl:
			if (isPressed.get(rosenkohl.getTextOn())) {
				setIngredient((String) rosenkohl.getTextOn());
				isPressed.put((String) rosenkohl.getTextOn(), false);
				
			}else{
				deleteIngredient((String) rosenkohl.getTextOn());
				isPressed.put((String) rosenkohl.getTextOn(), true);
			}
			break;
		
		case R.id.button_Rotkohl:
			if (isPressed.get(rotkohl.getTextOn())) {
				setIngredient((String) rotkohl.getTextOn());
				isPressed.put((String) rotkohl.getTextOn(), false);
				
			}else{
				deleteIngredient((String) rotkohl.getTextOn());
				isPressed.put((String) rotkohl.getTextOn(), true);
			}
			break;
		case R.id.button_Walnuss:
			if (isPressed.get(walnuss.getTextOn())) {
				setIngredient((String) walnuss.getTextOn());
				isPressed.put((String) walnuss.getTextOn(), false);
				
			}else{
				deleteIngredient((String) walnuss.getTextOn());
				isPressed.put((String) walnuss.getTextOn(), true);
			}
			break;
			
		case R.id.button_Weisskohl://
			if (isPressed.get(acerola.getTextOn())) {
				setIngredient((String) acerola.getTextOn());
				isPressed.put((String) acerola.getTextOn(), false);
				
			}else{
				deleteIngredient((String) acerola.getTextOn());
				isPressed.put((String) acerola.getTextOn(), true);
			}
			break;
		
		case R.id.button_Zucchini:
			if (isPressed.get(zucchini.getTextOn())) {
				setIngredient((String) zucchini.getTextOn());
				isPressed.put((String) zucchini.getTextOn(), false);
				
			}else{
				deleteIngredient((String) zucchini.getTextOn());
				isPressed.put((String) zucchini.getTextOn(), true);
			}
			break;
		case R.id.button_Zuckererbsen:
			if (isPressed.get(zuckererbsen.getTextOn())) {
				setIngredient((String) zuckererbsen.getTextOn());
				isPressed.put((String) zuckererbsen.getTextOn(), false);
				
			}else{
				deleteIngredient((String) zuckererbsen.getTextOn());
				isPressed.put((String) zuckererbsen.getTextOn(), true);
			}
			break;
		case R.id.button_Zwiebel:
			if (isPressed.get(zwiebel.getTextOn())) {
				setIngredient((String) zwiebel.getTextOn());
				isPressed.put((String) zwiebel.getTextOn(), false);
				
			}else{
				deleteIngredient((String) zwiebel.getTextOn());
				isPressed.put((String) zwiebel.getTextOn(), true);
			}
			break;
		case R.id.button_Schwarzwurzel:
			if (isPressed.get(schwarzwurzel.getTextOn())) {
				setIngredient((String) schwarzwurzel.getTextOn());
				isPressed.put((String) schwarzwurzel.getTextOn(), false);
				
			}else{
				deleteIngredient((String) schwarzwurzel.getTextOn());
				isPressed.put((String) schwarzwurzel.getTextOn(), true);
			}
			break;
		case R.id.button_Sojabohnen:
			if (isPressed.get(sojabohnen.getTextOn())) {
				setIngredient((String) sojabohnen.getTextOn());
				isPressed.put((String) sojabohnen.getTextOn(), false);
				
			}else{
				deleteIngredient((String) sojabohnen.getTextOn());
				isPressed.put((String) sojabohnen.getTextOn(), true);
			}
			break;	
		case R.id.button_Spargel:
			if (isPressed.get(spargel.getTextOn())) {
				setIngredient((String) spargel.getTextOn());
				isPressed.put((String) spargel.getTextOn(), false);
				
			}else{
				deleteIngredient((String) spargel.getTextOn());
				isPressed.put((String) spargel.getTextOn(), true);
			}
			break;
		case R.id.button_Speierling:
			if (isPressed.get(speierling.getTextOn())) {
				setIngredient((String) speierling.getTextOn());
				isPressed.put((String) speierling.getTextOn(), false);
				
			}else{
				deleteIngredient((String) speierling.getTextOn());
				isPressed.put((String) speierling.getTextOn(), true);
			}
			break;
		case R.id.button_Spinat:
			if (isPressed.get(spinat.getTextOn())) {
				setIngredient((String) spinat.getTextOn());
				isPressed.put((String) spinat.getTextOn(), false);
				
			}else{
				deleteIngredient((String) spinat.getTextOn());
				isPressed.put((String) spinat.getTextOn(), true);
			}
			break;
		case R.id.button_Spitzkohl:
			if (isPressed.get(spitzkohl.getTextOn())) {
				setIngredient((String) spitzkohl.getTextOn());
				isPressed.put((String) spitzkohl.getTextOn(), false);
				
			}else{
				deleteIngredient((String) spitzkohl.getTextOn());
				isPressed.put((String) spitzkohl.getTextOn(), true);
			}
			break;
		case R.id.button_Sternfrucht:
			if (isPressed.get(sternfrucht.getTextOn())) {
				setIngredient((String) sternfrucht.getTextOn());
				isPressed.put((String) sternfrucht.getTextOn(), false);
				
			}else{
				deleteIngredient((String) sternfrucht.getTextOn());
				isPressed.put((String) sternfrucht.getTextOn(), true);
			}
			break;
		case R.id.button_Suesskartoffel:
			if (isPressed.get(suesskartoffel.getTextOn())) {
				setIngredient((String) suesskartoffel.getTextOn());
				isPressed.put((String) suesskartoffel.getTextOn(), false);
				
			}else{
				deleteIngredient((String) suesskartoffel.getTextOn());
				isPressed.put((String) suesskartoffel.getTextOn(), true);
			}
			break;
		case R.id.button_Tomate:
			if (isPressed.get(tomate.getTextOn())) {
				setIngredient((String) tomate.getTextOn());
				isPressed.put((String) tomate.getTextOn(), false);
				
			}else{
				deleteIngredient((String) tomate.getTextOn());
				isPressed.put((String) tomate.getTextOn(), true);
			}
			break;
		case R.id.button_Trauben:
			if (isPressed.get(trauben.getTextOn())) {
				setIngredient((String) trauben.getTextOn());
				isPressed.put((String) trauben.getTextOn(), false);
				
			}else{
				deleteIngredient((String) trauben.getTextOn());
				isPressed.put((String) trauben.getTextOn(), true);
			}
	
			break;
		default:
			break;
		}
		
}

}