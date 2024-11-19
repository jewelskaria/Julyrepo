package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Redifftestng {
	ChromeDriver driver;
@BeforeTest(alwaysRun=true)
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    driver.manage().window().maximize();
}
@Test(groups= {"sanity"})
public void logo()
{

	WebElement logo = driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	if(logo.isDisplayed())
	{ 
		System.out.println("logo is present");
	}
	else
{
		System.out.println("logo is  not presen");
	}

}
@Test(groups= {"smoke"})
public void redifflogin()
{
  WebElement radiobutton=driver.findElement(By.xpath("//input[1][contains(@name,'gender')]"));
  if(radiobutton.isSelected())
  {
	  System.out.println("radiobutton is selected");
  }
  else 
  {
	  System.out.println("rediobutton is not selected");
  }
}
@Test(groups= {"sanity"})
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
@Test(groups= {"regression"})
public void checktest()
{
	String  rtest="create a rediffmail account";
	String src=driver.getPageSource();
	if(src.contains(rtest))
	{
		System.out.println("contains test");
		
	}
	else
	{
		System.out.println("not contains");
		
	}
}



}
