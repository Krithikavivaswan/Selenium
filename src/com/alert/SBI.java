package com.alert;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBI {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
driver.get("https://retail.onlinesbi.com/retail/login.htm");
		

driver.manage().window().maximize();

Actions a = new Actions(driver);

driver.findElement(By.xpath("//button[@id='details-button']")).click();

driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

a.contextClick().perform();

driver.switchTo().alert().accept();

Robot r=new Robot();

for (int i = 0; i < 13; i++) {

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
	
}

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);


for (int i = 0; i < 4; i++) {

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
	
}

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);







		
	}
}
