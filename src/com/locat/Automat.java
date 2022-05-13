package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automat {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driv=new ChromeDriver();
		
		driv.get("http://demo.automationtesting.in/Register.html");
		
		driv.manage().window().maximize();
		
		
		WebElement findel = driv.findElement(By.className("form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched"));
				findel.sendKeys("Krithika");
		
		
		
		
	}

}
