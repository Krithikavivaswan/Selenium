package org.robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		d.manage().window().maximize();
		
		WebElement name = d.findElement(By.name("q"));
		
		Actions a=new Actions(d);
		
		a.sendKeys(name, "VelMurugan").perform();
		a.doubleClick(name).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

		
		
		
		
	}

}
