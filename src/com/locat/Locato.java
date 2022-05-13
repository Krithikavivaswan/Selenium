package com.locat;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locato {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Krishna\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.facebook.com/"); 
		
		w.manage().window().maximize();
		
		
		//Email field
		WebElement fe = w.findElement(By.id("email"));
		// To pass the values
		fe.sendKeys("krithikaganesh@ymail.com");
		
		
		//Password field
		WebElement f = w.findElement(By.name("pass"));
	    f.sendKeys("123456");
		
	    
	    //Login button
//	    
//	    WebElement ft = w.findElement(By.name("login"));
//	    ft.click();
//	    
	    
	    // By Xpath 
	    
	    WebElement btn = w.findElement(By.xpath("//button[text()= 'Log In']"));
	    
	    btn.click();
		
		
	}

}
