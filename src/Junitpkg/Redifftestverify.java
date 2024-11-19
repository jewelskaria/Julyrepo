package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftestverify {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void buttontest()
	{
		String buttontest=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		if(buttontest.equals("Check avail6ability"))
		{
		
			System.out.println("pass");
			
		}
		else 
		{
			System.out.println("fail");

		}
		
	}
	

}
