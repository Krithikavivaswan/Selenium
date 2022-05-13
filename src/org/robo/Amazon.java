package org.robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get(" https://www.amazon.in");
		
		d.manage().window().maximize();
		
		Actions a=new Actions(d);
		
		WebElement login = d.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		a.moveToElement(login).perform();
		
		WebElement sign = d.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		sign.click();
		
		WebElement email = d.findElement(By.name("email"));
		a.sendKeys(email, "krithikaganesh");
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
