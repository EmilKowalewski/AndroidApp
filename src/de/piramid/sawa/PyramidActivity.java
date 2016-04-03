package de.piramid.sawa;

import java.util.ArrayList;
import java.util.Locale;

import org.apache.commons.net.ftp.parser.MVSFTPEntryParser;


import com.example.testsawa.R;
import com.example.testsawa.R.menu;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentPagerAdapter;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.support.v4.app.Fragment;

/**
 * Diese Klasse ist zuständig für das Anzeigen aller Fragemnte 
 * sie sendet ein View  an diese Fragmente weiter und bekommt die Gewählt  Zutaten
 * @author Emil Kowalewski
 *
 */

public class PyramidActivity extends FragmentActivity  {

	MyPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	ActionBar mActionBar = null;
	PyramidFragmentA pirFraA = new PyramidFragmentA();
	PyramidFragmentB pirFraB = new PyramidFragmentB();
	PyramidFragmentC pirFraC = new PyramidFragmentC();
	PyramidFragmentD pirFraD = new PyramidFragmentD();
	PyramidFragmentF pirFraF = new PyramidFragmentF();
	ArrayList<String> zutaten;
	MyPageChangeListener mPageChangeListener;
	boolean isPressed=false;
	
	/**
	 * Diese Methode erzeugt einen AtionBar der für Anzeigen der Tags zuständigt  
	 * sowie ViewPager der für Anzeige der Fragmente Zuständig ist
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pyramid);
		
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mSectionsPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mSectionsPagerAdapter);
		mViewPager.setOnPageChangeListener(new MyPageChangeListener());
		
		mActionBar = getActionBar();
		mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		//Hier werden die Überschriffen an der ActionBar festgelegt
		mActionBar.addTab(mActionBar.newTab()
	            .setText("Obst & Gemüse")
	            .setTabListener(new MyTabListener()));
		mActionBar.addTab(mActionBar.newTab()
	            .setText("Kohlenhydrate")
	            .setTabListener(new MyTabListener()));
		mActionBar.addTab(mActionBar.newTab()
	            .setText("Eiweiß")
	            .setTabListener(new MyTabListener()));
		mActionBar.addTab(mActionBar.newTab()
	            .setText("Öle / Fette / Salz")
	            .setTabListener(new MyTabListener()));
		mActionBar.addTab(mActionBar.newTab()
	            .setText("Zusatz")
	            .setTabListener(new MyTabListener()));
		
			
		mViewPager.setOnPageChangeListener( new MyPageChangeListener());
		zutaten = new ArrayList<String>();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.pyramid, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	/**
	 * Diese Methode sammelt alle Zutaten von allen Fragmenten nach dem Suche Starten geklickt wurde
	 * in einer Liste und sendet sie an ShowMatch.class weiter
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_search:
	        	if (pirFraA.getIngredient() != null) {
	        		zutaten.addAll(pirFraA.getIngredient());
				}
	        	if (pirFraB.getIngredient() != null) {
	        		zutaten.addAll(pirFraB.getIngredient());
				}
	        	if (pirFraC.getIngredient() != null) {
	        		
	        		zutaten.addAll(pirFraC.getIngredient());
				}
	        	if (pirFraD.getIngredient() != null) {
	        		zutaten.addAll(pirFraD.getIngredient());
				}
	        	if (pirFraF.getIngredient() != null) {
	        		zutaten.addAll(pirFraF.getIngredient());
				}
	            
	            Intent intent = new Intent(PyramidActivity.this, ShowMatch.class);
	            intent.putStringArrayListExtra("data", (ArrayList<String>) zutaten);
	            startActivity(intent);
	            return true; 
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	
	
	// Diese Methide schickt ein View an die FragmentA Klasse weiter
	public void imageClick(View view) {
		pirFraA.imageClick(view);
	}
	// Diese Methide schickt ein View an die FragmentB Klasse weiter
	public void imageClickRate(View view) {
		pirFraB.imageClickRate(view);
	}
	// Diese Methide schickt ein View an die FragmentC Klasse weiter
	public void imageClickEiweiss(View view) {
		pirFraC.imageClickEiweiss(view);	
	}
	// Diese Methide schickt ein View an die FragmentD Klasse weiter
	public void imageClickFett(View view){
		pirFraD.imageClickFett(view);
	}
	// Diese Methide schickt ein View an die FragmentF Klasse weiter
	public void imageClickAdd(View view){
		pirFraF.imageClickAdd(view);
	}
//--------------------------------- First SubClass ------------------------------------------------------------------
	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class MyPagerAdapter extends FragmentPagerAdapter {
		public MyPagerAdapter(android.support.v4.app.FragmentManager fm) {
			super(fm);
		}
		/**
		 * Diese Methode bestimmt die Reihenfolge in der Fragmente anzegeigt werden
		 * 
		 */
		@Override
		public android.support.v4.app.Fragment getItem(int position) {
			if (position == 0) {
				return pirFraA; 
			}
			if (position == 1) {
				
				return pirFraB; 
			}
			if (position == 2) {
				
				return pirFraC; 
			}
			if (position == 3) {
				
				return pirFraD; 
			}
			if (position == 4) {
				
				return pirFraF; 
			}
				return null;	
		}

		@Override
		public int getCount() {
			// Show 5 total pages.
			return 5;
		}
		//Diese Methode sollte Titel eine Fragmente Klasse liefern 
		//Es werden aber die Tabs benutzt daher die Methode wird nicht benutzt
		@Override
		public CharSequence getPageTitle(int position) {

			return null;
		}
		
	}
//-------------------- Secend SubClass (PageListener) --------------------------------------------------
	
	public class MyPageChangeListener implements OnPageChangeListener  {

		@Override
		public void onPageScrollStateChanged(int arg0) {
			
			
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			
			
		}
		//Hier wird die Akktuele Postion der Seite in viewPager dem Actionbar übergeben
		//damit wird ischergestellt dass Der Actuionbar immer auf der Akktuele Seite sich befindet
		@Override
		public void onPageSelected(int arg0) {
			 mActionBar.setSelectedNavigationItem(arg0);
			
		}
		
	}
	
//-------------------------- Third Class -------------------------
	public class MyTabListener implements TabListener {
		
		//Hier wird die Akktuele Postion der Seite in Actionbar dem viewPager übergeben
		//damit wird ischergestellt dass Der viewPager immer auf der Akktuele Seite sich befindet
		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			mViewPager.setCurrentItem(tab.getPosition());
			
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			
			
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			
			
		}

	 

	}
}
