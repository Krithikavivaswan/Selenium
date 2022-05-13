package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.cleartrip.com/trains");
		
		d.findElement(By.id("from_station")).sendKeys("Chennai");
		
		d.findElement(By.id("to_station")).sendKeys("Mumbai");
		
		d.findElement(By.id("trainFormButton")).click();
		
		
		
		
	}

}
