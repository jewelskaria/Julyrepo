package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drangandrop {
	ChromeDriver driver;

	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforetest()
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}

	@Test
	public void test() 
	{
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
		WebElement dest1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(bank,dest1).perform();
		WebElement rs=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dest2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(rs,dest2).perform();
		WebElement Acc=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement dest3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(Acc,dest3).perform();
		WebElement Amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dest4=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		act.dragAndDrop(Amount,dest4).perform();
	

        WebElement perfectLogo = driver.findElement(By.xpath("//*[text()='Perfect!']"));
        if (perfectLogo.isDisplayed()) {
            System.out.println("\"Perfect\" logo is present.");
        } else {
            System.out.println("\"Perfect\" logo is not present.");
        }
    }
	}

