package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
	w.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	
	w.manage().window().maximize();
	
	
	w.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("9875424567");
		
	w.findElement(By.className("submitBottomOption")).click();
	
		
	}
	
	

}
