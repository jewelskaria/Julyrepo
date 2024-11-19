package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobutton {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void redifflogin()
	{
	  WebElement radiobutton=driver.findElement(By.xpath("//input[1][contains(@name,'gender')]"));
	  if(radiobutton.isSelected())
	  {
		  System.out.println("radiobutton is selected");
	  }
	  else 
	  {
		  System.out.println("rediobutton is not selected");
	  }
	}

}
