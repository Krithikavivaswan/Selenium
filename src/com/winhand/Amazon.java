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

public class Amazon {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone X");

		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

		Actions a = new Actions(driver);

		a.contextClick(driver.findElement(By.className("s-image"))).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for (String id : child) {

			if (!id.equals(parent)) {
				driver.switchTo().window(id);

			}

		}

		WebElement cost = driver.findElement(By.xpath("(//span[text()='$324.99'])[4]"));
		System.out.println(cost.getText());

	}
}
