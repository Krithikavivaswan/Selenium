package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.swiggy.com/");
		
		w.manage().window().maximize();
		
//		WebElement fe = w.findElement(By.id("location"));
//		
//		fe.sendKeys("Kolathur");

		w.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		w.findElement(By.name("mobile")).sendKeys("23456789");
		
		w.findElement(By.name("name")).sendKeys("Krithika");
		
		w.findElement(By.name("email")).sendKeys("krithikaganesh@ymail.com");
		
		w.findElement(By.id("password")).sendKeys("123456");
		
		w.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		
		
		
		
		
		
		
	}

}
