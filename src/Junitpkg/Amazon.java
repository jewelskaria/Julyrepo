package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://amazon.in");
	}
	@Test
	public void amazonlogin()
	{
		driver.findElement(By.xpath("//input[@placeholder=\'Search Amazon.in']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.navigate().back();
	    driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	}
	
}
