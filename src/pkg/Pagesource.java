package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {
	
    static String baseurl="https://www.google.com";
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		String expected="About";
		if(src.contains(expected)){
			System.out.println("present");
			
		}
		else {
			System.out.println(" not present");

		}
		
		

	}

}
