package de.piramid.sawa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.example.testsawa.R;
import com.example.testsawa.R.id;
import com.example.testsawa.R.layout;
import com.example.testsawa.R.menu;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.ActionBar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.os.Build;
/**
 * Diese Methode fegt die Buttons und TextViews fest.
 * 
 */
public class PyramidFragmentF extends Fragment {

	private View view;
	private ArrayList<String> ingredientsList;
	private Button buttonAdd1_invisible;
	private Button buttonAdd2_invisible;
	private Button buttonAdd3_invisible;
	private Button buttonAdd4_invisible;
	private Button buttonAdd5_invisible;
	private Button buttonAdd6_invisible;
	private Button buttonAdd7_invisible;
	private AutoCompleteTextView text1_invisible;
	private AutoCompleteTextView text2_invisible;
	private AutoCompleteTextView text3_invisible;
	private AutoCompleteTextView text4_invisible;
	private AutoCompleteTextView text5_invisible;
	private AutoCompleteTextView text6_invisible;
	private AutoCompleteTextView text7_invisible;
	private HashMap<Integer, Boolean> isPressed;
	private Button buttonAddOne;
	private Button buttonDellOne;
	
	private static final int Visible = 1;
	private static final int InVisible = 2;
	private List<AutoCompleteTextView> textList = new ArrayList<AutoCompleteTextView>();
	private List<Button> buttonList = new ArrayList<Button>();
	int buttomOrder = 0;
	

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			view = inflater.inflate(R.layout.fragment_piramid_fragment_f,
				container, false);
			ingredientsList = new ArrayList<String>();
			isPressed = new HashMap<Integer, Boolean>();
			
			buttonAdd1_invisible  =(Button) view.findViewById(R.id.button_Add1);
			isPressed.put(buttonAdd1_invisible.getId(), true);
			buttonList.add(buttonAdd1_invisible);
			
			buttonAdd2_invisible  =(Button) view.findViewById(R.id.button_Add2);
			isPressed.put(buttonAdd2_invisible.getId(), true);
			buttonList.add(buttonAdd2_invisible);
			
			buttonAdd3_invisible  =(Button) view.findViewById(R.id.button_Add3);
			isPressed.put(buttonAdd3_invisible.getId(), true);
			buttonList.add(buttonAdd3_invisible);
			
			buttonAdd4_invisible  =(Button) view.findViewById(R.id.button_Add4);
			isPressed.put(buttonAdd4_invisible.getId(), true);
			buttonList.add(buttonAdd4_invisible);
			
			buttonAdd5_invisible  =(Button) view.findViewById(R.id.button_Add5);
			isPressed.put(buttonAdd5_invisible.getId(), true);
			buttonList.add(buttonAdd5_invisible);
			
			buttonAdd6_invisible  =(Button) view.findViewById(R.id.button_Add6);
			isPressed.put(buttonAdd6_invisible.getId(), true);
			buttonList.add(buttonAdd6_invisible);
			
			buttonAdd7_invisible  =(Button) view.findViewById(R.id.button_Add7);
			isPressed.put(buttonAdd7_invisible.getId(), true);
			buttonList.add(buttonAdd7_invisible);
			
			buttonAddOne  =(Button) view.findViewById(R.id.button_AddOne);
			buttonDellOne  =(Button) view.findViewById(R.id.button_AddDel);
			
			
			text1_invisible  =(AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView1);
			textList.add(text1_invisible);
			
			text2_invisible  =(AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView2);
			textList.add(text2_invisible);
			
			text3_invisible  =(AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView3);		
			textList.add(text3_invisible);
			
			text4_invisible  =(AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView4);			
			textList.add(text4_invisible);
			
			text5_invisible  =(AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView5);
			textList.add(text5_invisible);
			
			text6_invisible  =(AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView6);
			textList.add(text6_invisible);
			
			text7_invisible  =(AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView7);
			textList.add(text7_invisible);
			
			
			
			return view;
	}
	

	/**
	 * Diese Methode Ein und Ausblendet die Text Views und zu diesen Texview dazugehörige
	 * Add / Dell button. 
	 * Die Methode stellt sicher, dass nur die letzte View Ausgeblendet wird.
	 * Die Buttons werden in einer Hashmap gespeichert als key. 
	 * Der Value liegt fest ob der Button ankeglick wurde.
	 */
	public void imageClickAdd(View view) {
		
		String cTextView = "";
		switch (view.getId()) {
		
		case R.id.button_AddOne:
			//hier wird sicher gestellt, dass es nicht mehr als 7 
			//TexView eingebeldnet werden
			if (buttomOrder < 7) {
				textList.get(buttomOrder).setVisibility(view.VISIBLE);
				buttonList.get(buttomOrder).setVisibility(view.VISIBLE);
				buttomOrder++;
			}		
			break;
		
		case R.id.button_AddDel:
			//hier wird sicher gestellt, dass es nicht weniger als 0 
			//TexView ausgebeldnet werden
			if (buttomOrder > 0) {
				buttomOrder--;
				textList.get(buttomOrder).setText("");
				textList.get(buttomOrder).setVisibility(view.INVISIBLE);
				isPressed.put(buttonList.get(buttomOrder).getId(), true);
				buttonList.get(buttomOrder).setVisibility(view.INVISIBLE);
				isPressed.put(buttonList.get(buttomOrder).getId(), true);
			}
			
			break;	
		case R.id.button_Add1:
			if (isPressed.get(buttonAdd1_invisible.getId())) {
				cTextView  = text1_invisible.getText().toString();
				if (!cTextView.equals("")) {
					isPressed.put(buttonAdd1_invisible.getId(), false);
					setIngredient(cTextView);
					buttonAdd1_invisible.setText("Del");		
				}			
			}else{
			
				deleteIngredient(text1_invisible.getText().toString());
				text1_invisible.setText("");
				isPressed.put(buttonAdd1_invisible.getId(), true);
				buttonAdd1_invisible.setText("Add");
				
			}
			break;
			
		case R.id.button_Add2:
			if (isPressed.get(buttonAdd2_invisible.getId())) {
				cTextView  = text2_invisible.getText().toString();
				if (!cTextView.equals("")) {
					
					setIngredient(cTextView);
					isPressed.put(buttonAdd2_invisible.getId(), false);
					buttonAdd2_invisible.setText("Del");		
				}			
			}else{
				
				deleteIngredient(text2_invisible.getText().toString());
				text2_invisible.setText("");
				isPressed.put(buttonAdd2_invisible.getId(), true);
				buttonAdd2_invisible.setText("Add");
				
			}
			break;
			
		case R.id.button_Add3:
			if (isPressed.get(buttonAdd3_invisible.getId())) {
				cTextView  = text3_invisible.getText().toString();
				if (!cTextView.equals("")) {
					
					setIngredient(cTextView);
					isPressed.put(buttonAdd3_invisible.getId(), false);
					buttonAdd3_invisible.setText("Del");		
				}			
			}else{
				
				deleteIngredient(text3_invisible.getText().toString());
				text3_invisible.setText("");
				isPressed.put(buttonAdd3_invisible.getId(), true);
				buttonAdd3_invisible.setText("Add");
				
			}
			break;
			
		case R.id.button_Add4:
			if (isPressed.get(buttonAdd4_invisible.getId())) {
				cTextView  = text4_invisible.getText().toString();
				if (!cTextView.equals("")) {
					
					setIngredient(cTextView);
					isPressed.put(buttonAdd4_invisible.getId(), false);
					buttonAdd4_invisible.setText("Del");		
				}			
			}else{
			
				deleteIngredient(text4_invisible.getText().toString());
				text4_invisible.setText("");
				isPressed.put(buttonAdd4_invisible.getId(), true);
				buttonAdd4_invisible.setText("Add");
				
			}
			break;
			
		case R.id.button_Add5:
			if (isPressed.get(buttonAdd5_invisible.getId())) {
				cTextView  = text5_invisible.getText().toString();
				if (!cTextView.equals("")) {
					
					setIngredient(cTextView);
					isPressed.put(buttonAdd5_invisible.getId(), false);
					buttonAdd5_invisible.setText("Del");		
				}			
			}else{
				
				deleteIngredient(text5_invisible.getText().toString());
				text5_invisible.setText("");
				isPressed.put(buttonAdd5_invisible.getId(), true);
				buttonAdd5_invisible.setText("Add");
				
			}
			break;
			
		case R.id.button_Add6:
			if (isPressed.get(buttonAdd6_invisible.getId())) {
				cTextView  = text6_invisible.getText().toString();
				if (!cTextView.equals("")) {
					
					setIngredient(cTextView);
					isPressed.put(buttonAdd6_invisible.getId(), false);
					buttonAdd6_invisible.setText("Del");		
				}			
			}else{
				
				deleteIngredient(text6_invisible.getText().toString());
				text6_invisible.setText("");
				isPressed.put(buttonAdd6_invisible.getId(), true);
				buttonAdd6_invisible.setText("Add");
				
			}
			break;
			
		case R.id.button_Add7:
			if (isPressed.get(buttonAdd7_invisible.getId())) {
				cTextView  = text7_invisible.getText().toString();
				if (!cTextView.equals("")) {
				
					setIngredient(cTextView);
					isPressed.put(buttonAdd7_invisible.getId(), false);
					buttonAdd7_invisible.setText("Del");		
				}			
			}else{
				
				deleteIngredient(text7_invisible.getText().toString());
				text7_invisible.setText("");
				isPressed.put(buttonAdd7_invisible.getId(), true);
				buttonAdd7_invisible.setText("Add");
				
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
