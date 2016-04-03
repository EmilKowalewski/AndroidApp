package de.main.sawa;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.example.testsawa.R;

import de.piramid.sawa.PyramidActivity;
import de.rec.sawa.RecipeList;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;
/**
 * Diese Klasse wird bei jedem Start des Programmes aufgerüfen
 * 
 * @author Emil Kowalewski
 *
 */

public class MainActivity extends Activity {

	private static final String LOG_TAG = "FTP Connetion";
	/**
	 * Diese Methode zeigt eine Nachricht an, die an diese Klasse gesendet wurde.
	 * 
	 */
	private BroadcastReceiver receiver = new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			Bundle bundle = intent.getExtras();
			if (bundle != null) {
				String resultCode = bundle.getString(AsyncDownloader.RESULT);
				if (resultCode == "result") {
					Toast.makeText(MainActivity.this,
							"Download complete. Download URI: ",
							Toast.LENGTH_LONG).show();
				} else {
					Toast.makeText(MainActivity.this, "Download failed",
							Toast.LENGTH_LONG).show();
				}
			}
		}
	};
	/**
	 * Beim Aufrufen diese Klasse wird als erstes diese Methode ausgefürt 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Verzeichniss Sawa wird hier erstellt
		File directory = new File(Environment.getExternalStorageDirectory()
				+ "/" + "Sawa");
		InputStream in = null;
		OutputStream out = null;
		AssetManager aManager = getAssets();
		String[] localFiles = null;
		String[] enFiles = null;
		//Eine Datei die eine Datenbank repräsentiert wird hier erstellt
		File localFile = new File(Environment.getExternalStorageDirectory()
				+ "/" + "Sawa" + "/" + "rec.xml");
		// wenn der Verzeichnis mit dem jeweilgen Pfad nicht exsistiert 
		//erzeuge einen
		if (!directory.exists()) {
			directory.mkdir();
		}
		//Wenn eine Datei mit dem jeweiligen Phad nicht exsiestiert
		//erzeige ienen
		if (!localFile.exists()) {
			try {
				//localFiles bekommen alle Dateien die sich im assets Ordner befinden
				//die Dateien befinden sich in keine unterordner
				//daher der Parameter der Methode list() bekommt einene leeren Pfad
				localFiles = aManager.list("");
			} catch (IOException e) {
				e.printStackTrace();
			}
			//wenn es welche Dateien gibt schreibe sie auf dem mobilen Gerät
			if (localFiles != null) {
				for (String file : localFiles) {
					if (file.equals("db_version.txt") || file.equals("rec.xml")) {
						try {
							in = aManager.open(file);
							File outFile = new File(
									Environment.getExternalStorageDirectory()
											+ "/" + "Sawa" + "/", file);
							out = new FileOutputStream(outFile);

							byte[] buffer = new byte[1024];
							int read;
							while ((read = in.read(buffer)) != -1) {
								out.write(buffer, 0, read);
							}

						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						continue;
					}
				}
				try {
					in.close();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	/**
	 * Diese Methode wird ausgeführt nach dem eine Komponente eine Aktion regestriert hat 
	 * und als Attribut onClick den gleichen Namen wie die methode hat.
	 * @param view - der jeweilge Komponente, die eine Aktion regestriert hat
	 * @throws IOException
	 */
	public void menuClick(View view) throws IOException {
		Intent intent;
		//Hier werden die Komponente unterschieden und entsprechende
		//Funktion wird ausgeführt
		switch (view.getId()) {
		case R.id.v_rezepte:
			intent = new Intent(this, RecipeList.class);
			startActivity(intent);
			break;
		case R.id.pyramid:
			intent = new Intent(this, PyramidActivity.class);
			startActivity(intent);
			break;
		case R.id.db:
			intent = new Intent(this, AsyncDownloader.class);
			startService(intent);
		default:
			break;
		}

	}
}
