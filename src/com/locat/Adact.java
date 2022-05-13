package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adact {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		w.get("http://adactinhotelapp.com/");
		
		w.manage().window().maximize();
		
		WebElement findname = w.findElement(By.xpath("//input[@name='username']"));
		findname.sendKeys("krithika");
		
		WebElement findpass = w.findElement(By.name("password"));
		findpass.sendKeys("123456");
		
		w.findElement(By.name("login")).click();
		
		String title = w.getTitle();
		System.out.println("Title is: "+title);
		
		String url = w.getCurrentUrl();
		System.out.println("Current url is:" +url);
		
		
		w.close();
		
		
		
	}

}
