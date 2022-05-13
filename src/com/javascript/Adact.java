package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adact {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workworkspace(1)space\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','krithika')", driver.findElement(By.name("username")));
		
		js.executeScript("arguments[0].setAttribute('value','krish')", driver.findElement(By.name("password"))); 
				
		js.executeScript("arguments[0].click()", driver.findElement(By.id("login")));
		
	}
	
	
}
