package com.winhand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigat {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("krithika");
		
		driver.navigate().refresh();
		
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
		
	}

}
