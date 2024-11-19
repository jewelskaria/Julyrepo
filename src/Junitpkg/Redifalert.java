package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redifalert {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void googleearch() 
	{
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,DOB_Year')]"));
		Select ob=new Select(day);
		Select ob=new Select(month);
		Select ob=new Select(year);
		ob.selectByValue("02");
		ob.selectByValue("02");
		ob.selectByValue("2003");
		
	}

}
