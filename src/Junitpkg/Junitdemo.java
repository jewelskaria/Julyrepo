package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setup();
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String act=driver.getTitle();
		String exp="google";
		if(act.equals(exp))
		{
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	

}
