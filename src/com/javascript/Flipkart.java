package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		

		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//a[text()='Login']")));
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute('value', 'Krithika')",email );
		
		Object userName = js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(userName);
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value', 'password')",pass);
		
		Object passWord = js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(passWord);
		
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("(//span[text()='Login'])[2]")));
		
		
		
		
	}

}
