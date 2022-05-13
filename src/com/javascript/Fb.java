package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	//Downcasting
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	//Locating webelements
	
	WebElement email = driver.findElement(By.id("email"));
	
	// Use executescript()
	
	js.executeScript("arguments[0].setAttribute('value','krithika')", email);
	
	Object o1 = js.executeScript("return arguments[0].getAttribute('value')", email);
	System.out.println(o1);

	
	WebElement pass = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','krish')", pass);
	

	Object o2 = js.executeScript("return arguments[0].getAttribute('value')", pass);
	System.out.println(o2);
	

	WebElement login = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click()", login);
	
	
	
	// Object (super class) = String (child)
	
//	String s1=(String)o1;
//	System.out.println(o1);
//	
//	
//	String s2=(String)o2;
//	System.out.println(o2);
//	
	
	
	
	
	
	
	
	}

}
