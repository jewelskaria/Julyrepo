package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responecodefb {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void fblogin()
	{
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total bo of links="+li.size());
		for (WebElement link : li) {
            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");

            System.out.println("Link Text: " + linkText + " | Link URL: " + linkUrl);
         
            
        }
		
	}
	private void verify(String link)  
	{
		try
		{
			URI ob= new URI(link);
			HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("suuccess rrespone code is 200------------"+link);
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("broken link respone code is 404----------"+link);
			}
		}
		catch(Exception e) 
		{
			System.out.println("e.getMessage");
		}
	}

	

}
