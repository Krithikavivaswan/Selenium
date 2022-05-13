package com.winhand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greentech {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/python-training.html");
//		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
//a.moveToElement(driver.findElement(By.xpath("//a[text()='COURSES']"))).perform();
		Robot r = new Robot();
//a.click(driver.findElement(By.xpath("(//span[text()='Python'])[1]"))).perform();
		JavascriptExecutor j = (JavascriptExecutor) driver;
//j.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h3[text()='Why are companies laying emphasis on Python?']")));
//a.contextClick(driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"))).perform();
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_ENTER);

		WebElement sel = driver.findElement(By.xpath("//h2[text()=' Selenium Test Papers']"));
		j.executeScript("arguments[0].scrollIntoView(true)", sel);

		driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();

		WebElement task = driver.findElement(By.xpath("//h3[text()='Selenium Day 9 Task']"));
		j.executeScript("arguments[0].scrollIntoView(true)", task);
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();

		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for (String eachId : child) {

			if (eachId != parent) {

				driver.switchTo().window(eachId);

			}

		}

		WebElement quest = driver.findElement(By.xpath("//*[contains(text(),'QUESTIONS')]"));
		String t = quest.getText();
		String st = t.substring(t.indexOf("QUESTION 1"), t.indexOf("QUESTION 2"));
		System.out.println(st);
		
		
		

	}
}
