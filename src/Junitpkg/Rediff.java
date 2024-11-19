package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rediff.com");
		
	}
	@Test
	public void linkcount()
	{
		
		List<WebElement>li=driver.findElements(By.tagName("a"));
		int linkcount=li.size();
		if(linkcount==30)
		{
			System.out.println("linkcount=30");
			
		}
		else
		{
			System.out.println("linkcount is actually"+linkcount);
		}
	}
	@Test
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
