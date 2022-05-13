package org.scrollscreen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//		WebElement search = driver.findElement(By.xpath("//h1[text()='Search - \"share this page\"']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", search);
//		
//		WebElement art = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
//		js.executeScript("arguments[0].scrollIntoView(false)", art);
//		
		WebElement select = driver.findElement(By.xpath("//div[contains(text(),'Have any')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", select);
		
		WebElement txt = driver.findElement(By.xpath("//div[text()='SITE LINKS']"));
		System.out.println(txt.getText());
		
		
		
	}

}
