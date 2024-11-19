package Testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileupload {

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\\\Users\\\\Ajay Skaria\\\\OneDrive\\\\Desktop\\\\Selenium\\\\jewel.docx");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		String buttontxt=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
		
		 if(buttontxt.equals("submit"))
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail"); 
		 }
	}
}

