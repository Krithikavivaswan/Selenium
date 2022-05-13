package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver w = new ChromeDriver();

		w.get("http://greenstech.in/selenium-course-content.html");

	//w.get("http://www.greenstechnologys.com/");

//		w.manage().window().maximize();
//		
//		w.findElement(By.xpath("//div[@id='heading20']")).click();
//		
//		w.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
////		
//		w.findElement(By.id("heading201")).click();
//		
//		w.findElement(By.xpath("//a[text()='Resume Model-1 ']")).click();
//		

//		WebElement tex = w.findElement(By.xpath("//p[contains(text(),'We undertake ')]"));
//		System.out.println(tex.getText());

//		WebElement ady = w.findElement(By.xpath("(//div[@class='trainer-info'])[1]"));
//		System.out.println(ady.getText());

		WebElement adr4 = w.findElement(By.xpath("//span[text()='Chennai-600 020.']"));
	System.out.println(adr4.getText());
	
	
//	WebElement para = w.findElement(By.xpath("//p[contains(text(),'our practical approach ')]"));
//	System.out.println(para.getText());

	}

}
