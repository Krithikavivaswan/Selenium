package org.robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
				
				WebDriver d=new ChromeDriver();
				
				d.get("https://www.flipkart.com/");
				
				
				d.manage().window().maximize();
			
		Actions a=new Actions(d);
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement chair = d.findElement(By.xpath("//div[text()='Livingroom Chairs']"));
		a.contextClick(chair).perform();
		
		Robot r= new Robot();
		
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
	
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
//		WebElement email = d.findElement(By.xpath("(//input[@type='text'])[2]"));
//		a.sendKeys(email,"Krithika").perform();
//		a.doubleClick(email).perform();
//		a.contextClick(email).perform();
//		
//		Robot r= new Robot();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);

		
	//	r.keyRelease(KeyEvent.VK_CONTROL);
	 //   r.keyRelease(KeyEvent.VK_V);
		
				
	}

}
