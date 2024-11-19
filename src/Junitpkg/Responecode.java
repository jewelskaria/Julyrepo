package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responecode {
	String link="https://www.google.com";
	@Test
	public void setup() throws Exception 
	{
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		int code=con.getResponseCode();
		System.out.println("responese code"+code);
	}
	

}
