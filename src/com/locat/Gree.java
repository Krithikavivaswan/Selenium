package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gree {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe" );
		
WebDriver w=new ChromeDriver();

w.get("https://www.google.com/");

w.manage().window().maximize();


WebElement ft = w.findElement(By.name("q"));
ft.sendKeys("Greens technology");
WebElement fe = w.findElement(By.name("btnK"));

fe.click();

	
		
	}
	
}
