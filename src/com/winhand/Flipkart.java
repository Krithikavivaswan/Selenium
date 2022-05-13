package com.winhand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
public static void main(String[] args) throws AWTException, InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			d.get("https://www.flipkart.com/");
			d.manage().window().maximize();
			d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			d.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mask");
			d.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//a[text()='Romsons 3 Ply Blue Mask Dispo Guard 3 Ply Mask With Sof...']")).click();
//			d.findElement(By.xpath("//div[text()='HP Pentium Quad Core - (8 GB/256 GB SSD/Windows 11 Home) 14s-dq3033tu Thin and Light Laptop']")).click();		
			
//		d.findElement(By.xpath("//div[text()='REDMI 9i Sport (Metallic Blue, 64 GB)']")).click();
//			d.findElement(By.xpath("//a[text()='osiris Surgical Mask with Melt Blown Layer Certified by...']")).click();

			Set<String> allwin = d.getWindowHandles();
			System.out.println(allwin);
			List l=new ArrayList<>(allwin);
			d.switchTo().window((String) l.get(1));
			d.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("600099");
			
//		WebElement mobpri = d.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
//		System.out.println(mobpri.getText());
//	WebElement rate = d.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
//			System.out.println(rate.getText());
}
	

}
