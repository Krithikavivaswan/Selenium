package com.winhand;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ceiling fan");
		driver.findElement(By.xpath("//*[@class='SearchBox__buttonIcon']")).click();
		driver.findElement(By.xpath("(//div[@class='product-pod__title product-pod__title__product'])[4]")).click();

		driver.findElement(By.xpath("//button[text()='Smart Remote Control Included']")).click();

		
	}

}
