package org.scrollscreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		//Downcasting

		TakesScreenshot t=(TakesScreenshot)driver;
		
		//Calling the method
		File s = t.getScreenshotAs(OutputType.FILE);
		
		// File location by creating the new folder and give name with ext
		File d=new File("C:\\Users\\Krishna\\eclipse-workspace\\Selenium\\Screenshots\\Gr.png");
		
		
		// Copy file from s to d, download commons jar file
		
		FileUtils.copyFile(s, d);
		
		
		
		
		
		
	}
}
