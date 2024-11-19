package Testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void keralalogin() throws InterruptedException, IOException
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\Ajay Skaria\\Downloads\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int r=sh.getLastRowNum();
		for(int i=1;i<=r;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
		     //Thread.sleep(3000);
			
			driver.findElement(By.id("ulogin")).sendKeys(username);
			driver.findElement(By.id("upass")).sendKeys(password);
			driver.findElement(By.id("sub_logbtn")).click();
			driver.navigate().refresh();
			System.out.println("Username="+username);
			System.out.println("Password="+password);
	}

	}
}
