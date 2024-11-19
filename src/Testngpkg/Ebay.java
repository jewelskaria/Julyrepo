package Testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		
	}
	@Test
	public void ebay()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		Actions act=new Actions(driver);

		WebElement electroinc=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		act.moveToElement(electroinc);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		act.perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	
	}
}
