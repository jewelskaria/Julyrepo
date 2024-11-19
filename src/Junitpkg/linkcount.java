package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void facebooklogin()
	{
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total bo of links="+li.size());
		for (WebElement link : li) {
            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");

            System.out.println("Link Text: " + linkText + " | Link URL: " + linkUrl);
        }
    }
	}

