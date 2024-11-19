package Testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class booking {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://booking.com");
	}
	@Test
	public void datepicker() throws Exception
	{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div/div[2]/div/div/button[1]/span")).click();
		datepickermethod("November 2024","25");
		datepickermethod("November 2024","30");
		
		
	}
		private void datepickermethod(String expmonth,String expdate)
		{
			while(true) {
				String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
				System.out.println("current month="+month);
		if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			}
			
			}
			List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[4]/td[2]/span"));
			for(WebElement d:dates)
			{
				String datetext=d.getText();
				if(datetext.equals(expdate))
				{
					d.click();
					break;
				}
			}

	}
}	

