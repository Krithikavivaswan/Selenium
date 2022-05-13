package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		w.get("http://demo.automationtesting.in/Register.html");
		
		w.manage().window().maximize();
		
		WebElement frstNam = w.findElement(By.xpath("//input[@type='text']"));
		frstNam.sendKeys("Krithika");
		
		w.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ganesh");
		
		w.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Kolathur");
		
		w.findElement(By.xpath("//input[@type='email']")).sendKeys("krithikaganesh@ymail.com");
		
		w.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234568");
		
		w.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		w.findElement(By.id("checkbox2")).click();
		
		
		
	}

}
