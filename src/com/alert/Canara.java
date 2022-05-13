package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Canara {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		

driver.manage().window().maximize();

Actions a = new Actions(driver);

driver.findElement(By.xpath("//button[@id='details-button']")).click();

driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

Alert al = driver.switchTo().alert();		
		System.out.println(al.getText());
		al.accept();
		
	}

}
