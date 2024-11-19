package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    driver.manage().window().maximize();
	}
	@Test
	public void googlesearch()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
		if(logo.isDisplayed())
		{ 
			System.out.println("logo is present");
		}
		else
	{
			System.out.println("logo is  not presen");
		}
	}
}
