package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		
		
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("Ammu12345@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("0987654321");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		
		String act=driver.getCurrentUrl();
		String current=("https://keralaproperty.in/member/login/");
		if(act.equals(current))
		{
			System.out.println("login pass");
		}
		else
		{
			System.out.println("login failed");
		}
	}


}
