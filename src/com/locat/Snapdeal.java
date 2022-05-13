package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.snapdeal.com/login");
		
		d.manage().window().maximize();
		
//		d.findElement(By.className("col-xs-24")).sendKeys("9962156307");
//		
//		d.findElement(By.className("btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30")).click();;
//		
		
		d.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		d.findElement(By.xpath("//span[text()='Register']")).click();
		
		d.findElement(By.id("userName")).sendKeys("12345667");
		
		d.findElement(By.xpath("//button[text()='continue']")).click();
		
				
	}

}
