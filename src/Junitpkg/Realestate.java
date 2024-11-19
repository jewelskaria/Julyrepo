package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realestate {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void relogin()
	{
		driver.findElement(By.id("ulogin")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("1234");
		driver.findElement(By.id("sub_logbtn")).click();
	}
}

