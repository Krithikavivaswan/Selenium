package com.winhand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

//		driver.findElement(By.name("keyword")).sendKeys("iphones 7");
		driver.findElement(By.name("keyword")).sendKeys("hand sanitizer");

		driver.findElement(By.xpath("//span[text()='Search']")).click();

//		driver.findElement(By.xpath("//img[@title='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Black']")).click();

		driver.findElement(By.xpath("(//p[@class='product-title'])[2]")).click();

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for (String id : child) {

			if (!id.equals(parent)) {
				driver.switchTo().window(id);

			}

		}

		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
//		WebElement price = driver.findElement(By.xpath("//div[text()='You Pay: ']"));
//		System.out.println(price.getText());
//		
	}

}
