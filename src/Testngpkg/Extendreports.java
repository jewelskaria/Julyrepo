package Testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class Extendreports {
	WebDriver driver;
	String baseurl="https://wwww.facebook.com";;
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
		reporter=new ExtentSparkReporter("./Reports/myreport1.html");
	    reporter.config().setDocumentTitle("Automationreport");
	    reporter.config().setReportName("functional test");
	    reporter.config().setTheme(Theme.DARK);
	    extent=new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("hostname","localhost");
	    extent.setSystemInfo("os","windows11");
	    extent.setSystemInfo("testername","abc");
	    extent.setSystemInfo("Browser Name","chrome");
	    driver=new ChromeDriver();
	       
	    }
	@BeforeMethod
	public void setop()
	{
		driver.get(baseurl);
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
	}
	
	@AfterTest
	public void teardown() {
		extent.flush();
		
	}
	@AfterMethod
	public void browserclass(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test case failed is"+result.getHost());
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());
			String screenshotpath=screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skipped is"+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
		
	}
	
	public  String screenshotMethod(WebDriver driver, String screenshotname)throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		String destination="./Screenshot/"+screenshotname +".png";
		File finaldestination=new File(destination);
		FileHandler.copy(src, finaldestination);
		FileHandler.copy(src, new File(destination));

		return destination;
	}

}
