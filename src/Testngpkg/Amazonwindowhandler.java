package Testngpkg;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindowhandler {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new  ChromeDriver();
		driver.get("https://amazon.in");
	}
	@Test
	public void test()
	{
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.click();
		search.sendKeys("phones",Keys.ENTER);
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		link.click();
		ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowdetails.get(1));
		
		WebElement addtocart=driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input"));
		addtocart.click();
	}


}
