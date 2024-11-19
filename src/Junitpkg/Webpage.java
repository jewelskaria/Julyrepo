package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ajay%20Skaria/OneDrive/Desktop/jewel/Jewel/Alertpgm.html");
	}
	@Test
	public void weblogin()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String alert=a.getText();
		System.out.println("alert text"+alert);
		a.accept();
		//a.dismiss();
		
		driver.findElement(By.name("firstname")).sendKeys("jewel");
		driver.findElement(By.name("lastname")).sendKeys("skaria");
		driver.findElement(By.xpath("//input[@value='submit']")).click();

	}

}
