package de.main.sawa;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Diese Klasse ist für update zuständig. Sie verbindet sich mit einem
 * FTP-Server und läd die Datenbank herunter
 * 
 * @author Emil Kowalewski
 * 
 */
public class AsyncDownloader extends IntentService {
	public static final String RESULT = "result";
	private final String FILENAME = "rec.xml";
	private final String DIRNAME = "Sawa";
	private FTPClient ftp;
	private String message;
	private String user = "user";
	private String password = "user";

	public AsyncDownloader() {
		super("DownloadService");
	}

	/**
	 * Die Methode startet einen neunen Service Es startet außerhalb der UI
	 * Thread
	 */
	@Override
	protected void onHandleIntent(Intent intent) {
		// Hier wird die Verbinndung zum server hergestellt
		try {
			ftp = new FTPClient();
			ftp.setConnectTimeout(5 * 10000);
			ftp.connect("172.31.61.127", 21);
			ftp.login(user, password);
			// wenn der server eine willkomensnachricht zurück sendet
			// heißt die Verbingung wurd aufgebaut
			// als nächste wird eine Download Mehtode aufgerufen
			if (ftp.getReplyString() != null) {
				// hier wird der TYPE der Date auf Binary gesetzt
				ftp.setFileType(FTP.BINARY_FILE_TYPE);
				ftp.enterLocalPassiveMode();
				downloadFile();
			} else {
				// Wenn die Verbindung wurd nich aufgebat gib eine Nachricht aus
				message = "Server nicht erreichtbar";
				publishResults(message, 1);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ftp != null) {
				try {
					ftp.logout();
					ftp.disconnect();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 
	 * @param massage
	 *            - Die Nachricht ob die Verbindung mit dem Server aufgebaut
	 *            wurde
	 * @param result
	 */
	private void publishResults(String massage, int result) {
		Intent intent = new Intent("de.main.testsawa");
		intent.putExtra("result", result);
		sendBroadcast(intent);
	}

	/**
	 * Diese Methode läd die Deiten herunter
	 */
	private void downloadFile() {
		FTPFile[] ftpFiles = null;
		try {
			// Aus dem FTP Server wird eine Liste der Vorhandene Dateien
			// gespeichert
			ftpFiles = ftp.listFiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream outputStream = null;
		if (ftpFiles != null && ftpFiles.length > 0) {

			// Die abrage überprüft ob es eine neue Version der Datenbank
			// existiert
			// Es ist sicher gestellt dass die erste Dateie in der List eine
			// "db_veriosn.txt" ist
			if (newRecVersion(ftpFiles[0])) {
				for (FTPFile file : ftpFiles) {
					try {
						// Hier wird der outputStream erstellt um auf dem Gerät
						// schreiben zu können
						outputStream = new FileOutputStream(
								Environment.getExternalStorageDirectory() + "/"
										+ DIRNAME + "/" + file.getName());
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					try {
						// Hier läd das Programm die Datei herunter mit dem
						// Jeweiligen outputStram
						ftp.retrieveFile(file.getName(), outputStream);
						outputStream.close();
						message = "Donwload war erfolgreich";
						publishResults(message, 3);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				message = "Datenbank ist auf dem aktuellen Stand";
				publishResults(message, 2);
			}
		}
	}

	/**
	 * Diese Methode Überprüft anhand von Timestamp ob die Datei auf dem Server
	 * und auf dem mobilen Gerät gleich sind. Wenn die Timestamps der Datei, die auf dem
	 * mobilen Gerät älter ist, ist eine neue Version der Datenbank vorhanden
	 * @param file - Datenbank version. 
	 * @return
	 */
	private boolean newRecVersion(FTPFile file) {
		boolean newVersion = false;
		File environmentVersion = new File(
				Environment.getExternalStorageDirectory() + "/" + DIRNAME,
				"db_version.txt");
		//Timestamps der Datei die auf dem mobilen Gerät liegt
		Date lastLocalModi = new Date(environmentVersion.lastModified());
		//Timestamps der Datei die auf dem Server liegt
		Date lastServerModi = new Date(file.getTimestamp().getTimeInMillis());
		if (lastServerModi.compareTo(lastLocalModi) == 0
				|| lastServerModi.compareTo(lastLocalModi) < 0) {
			newVersion = false;
		} else {
			newVersion = true;
		}
		
		return newVersion;
	}

}