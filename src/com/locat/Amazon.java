package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get(" https://www.amazon.in");
		
		Actions a=new Actions(d);
		
//		WebElement findel = d.findElement(By.id("twotabsearchtextbox"));
//		findel.sendKeys("iphone");
//		
//		WebElement btn = d.findElement(By.id("nav-search-submit-button"));
//		btn.click();
//		
		
//		d.findElement(By.xpath("//img[@alt='Gaming Laptops & Desktops; Grand Gaming Days']")).click();
		
		WebElement prim = d.findElement(By.xpath("//span[text()='Prime']"));
		a.moveToElement(prim).perform();

		WebElement del = d.findElement(By.id("prime-ms3-nav-metadata"));
		a.moveToElement(del).perform();
		
		
		
	}

}
