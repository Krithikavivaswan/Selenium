package com.winhand;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenscont {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@id='heading304']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' JUNIT']")).click();
		
//		driver.findElement(By.xpath("//div[@id='heading302']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Day4')]")).click();
		
		Set<String> child = driver.getWindowHandles();
List<String> l=new ArrayList<String>(child);
driver.switchTo().window(l.get(1));

WebElement quest = driver.findElement(By.xpath("//*[contains(text(),'QUESTIONS(Practical)')]"));
String t = quest.getText();
String st = t.substring(t.indexOf("QUESTION 1"),t.indexOf("QUESTION 2"));
System.out.println(st);


		

		
		
		
	}

}
