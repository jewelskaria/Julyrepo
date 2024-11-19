package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Samplesite {
	
    static String baseurl="https://www.Gmail.com";
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Gmail.com");
		String actualtitle=driver.getTitle();
		String expected="Gmail";
		driver.get(baseurl);
		String src=driver.getPageSource();

		if(actualtitle.equals (expected)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");

		}
		
		if(src.contains(expected)){
			System.out.println("present");
			
		}
		else {
			System.out.println(" not present");

		}		
		driver.quit();
		



	}

}
