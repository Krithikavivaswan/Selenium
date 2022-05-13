package org.scrollscreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.flipkart.com/");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				
//				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
				
				Actions a=new Actions(driver);
				a.moveToElement(driver.findElement(By.xpath("//img[@alt='Fashion']"))).perform();
				
				driver.findElement(By.xpath("//a[text()='All']")).click();
				
//				a.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).perform();
				
				a.moveToElement(driver.findElement(By.xpath("//span[text()='Baby & Kids']"))).perform();
	
				TakesScreenshot t=(TakesScreenshot)driver;
				
				File s = t.getScreenshotAs(OutputType.FILE);
				
				File d = new File("C:\\Users\\Krishna\\eclipse-workspace\\Selenium\\Screenshots\\Baby.png");
				
				FileUtils.copyFile(s, d);
				
				
				

		
		
	}

}
