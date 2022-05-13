package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webpag {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();

		d.get("https://www.redbus.in/");
		
		d.findElement(By.id("sign-in-icon-down")).click();
		
		d.findElement(By.id("signInLink")).click();
		
		WebElement findele = d.findElement(By.id("mobileNoInp"));
		findele.sendKeys("9962156307");
		
		d.findElement(By.id("social FC DIB")).click();
		
		
//		d.manage().window().maximize();
//		
//		WebElement fe = d.findElement(By.id("src"));
//		fe.sendKeys("Chennai");
//		
//		WebElement ft = d.findElement(By.id("dest"));
//		ft.sendKeys("Thoothukudi");
//		
		
	
		
		
		

	}

}
