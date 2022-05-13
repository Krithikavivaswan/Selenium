package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://netbanking.hdfcbank.com/");
		
		d.manage().window().maximize();
		
		WebElement fe = d.findElement(By.className("form-control text-muted"));
		fe.sendKeys("123456");
		
		
	}

}
