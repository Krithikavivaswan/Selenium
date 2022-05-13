package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Sample {

	public static void main(String[] args) {
		
		//Browser configuration
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
	
		//Browser instantiation
		WebDriver g =new ChromeDriver();
		
		//URL launch
		  g.get("https://www.facebook.com/");
		
		
		//Maximize
		g.manage().window().minimize();
		
		// To fetch the title
		String title = g.getTitle();
		System.out.println("Page title" +title);
		
		
		//close browser
		g.close();
		
	}	
}
