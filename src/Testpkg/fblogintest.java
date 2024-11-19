package Testpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fbloginpage;

public class fblogintest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
	}
	@Test
public void testlogin() 
	{
		
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("jewel@gmail.com", "ammu12");
		ob.fblogin();
		
		
		
	}
	


}
