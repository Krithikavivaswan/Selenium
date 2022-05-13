package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		//d.manage().window().maximize();
		
		WebElement txtele = d.findElement(By.name("username"));
		
		txtele.sendKeys("9962156307");
		
		WebElement txtpass = d.findElement(By.name("password"));
		txtpass.sendKeys("123456");
		
		
		
		
	//	d.close();
		
	}
	
}
