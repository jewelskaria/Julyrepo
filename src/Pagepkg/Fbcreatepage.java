package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbcreatepage;
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement sighup;
	
	
	
	public void fbcreatepage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void process()
	{
		
		
		String src=driver.getPageSource();
		if(src.contains("about"))
		{
			System.out.println("it contains");
		}
		else
		{
			System.out.println(" not contains");
		}}
		public void click()
		{
			
		
		sighup.click();
		
	}
	
	
	
	
	
	
	

}
