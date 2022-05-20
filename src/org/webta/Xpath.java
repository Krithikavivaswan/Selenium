package org.webta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().window().maximize();
		
		
		
		
		
		
	}
	

}
