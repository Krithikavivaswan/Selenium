package org.scrollscreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contentselen {
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		TakesScreenshot t=(TakesScreenshot)driver;
		
//		driver.findElement(By.xpath("//div[@id='heading20']")).click();
		
		WebElement core = driver.findElement(By.xpath("//div[@id='heading302']"));
		js.executeScript("arguments[0].scrollIntoView()", core);
		
//		WebElement trend = driver.findElement(By.xpath("//span[text()='6258']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", trend);
//		
//		File s = t.getScreenshotAs(OutputType.FILE);
//		
//		File d=new File("C:\\Users\\Krishna\\eclipse-workspace\\Selenium\\Screenshots\\Java.png");
//		
//		FileUtils.copyFile(s, d);
//		
		
		
		

	}

}
