package modulTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import android.os.Environment;
import android.test.*;
import junit.framework.TestCase;
import junit.framework.TestResult;


public class Test_FTP extends TestCase {
	
	private FTPClient ftp;
	private String server;
	private int port;
	private String user;
	private String password;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		ftp = new FTPClient();
		server = "192.168.178.40";
		port = 21;
		user = "user";
		password = "user";
		ftp.connect(server, port);
		ftp.login(user, password);
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		ftp.logout();
		ftp.disconnect();
		server = null;
		user = null;
		password = null;
	}
	
	public void testFtpResponse(){
		boolean responseCheack = false;
		String responseStatus = ftp.getReplyString();
		if (responseStatus != null) {
			responseCheack = true;
		}
		assertEquals(responseCheack, true);
	}

	public void testFtpConnected(){
		
		assertEquals(ftp.isConnected(), true);
	}
	
	public void testFtpAvailable(){
		
		assertEquals(ftp.isAvailable(), true);
	}
	
	public void testFtpDownload() throws IOException{
		
		File directory = new File(Environment.getExternalStorageDirectory()
				+ "/" + "testSawa");
		directory.mkdir();
		FTPFile[] files = ftp.listFiles();
		FileOutputStream outputStream = new FileOutputStream(
				Environment.getExternalStorageDirectory() + "/"
						+ "testSawa" +"/"+ files[1].getName() );
		ftp.retrieveFile("rec.xml", outputStream);
		
		assertNotNull(Environment.getExternalStorageDirectory() + "/"
						+ "testSawa" +"/"+ "rec.xml");
	}

	
}
