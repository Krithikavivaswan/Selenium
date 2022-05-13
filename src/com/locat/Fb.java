package com.locat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\geckodriver.exe");

		WebDriver d = new FirefoxDriver();

		d.get("https://www.facebook.com/");
		
		
		

		String title = d.getTitle();
		System.out.println("Title is:" + title);

		//get the value in the attribute
		WebElement text = d.findElement(
				By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String att = text.getAttribute("class");
		System.out.println(att);

		String text2 = text.getText();
		System.out.println(text2);

		//getting text with partial text
		WebElement finpar = d.findElement(By.xpath("//h2[contains(text(),'the people in your life.')]"));
		String text3 = finpar.getText();
		System.out.println(text3);

		//To find the passed msg /password
		WebElement findele = d.findElement(By.id("email"));
		findele.sendKeys("krithika@ymail.com");
		String valu = findele.getAttribute("value");
		System.out.println(valu);

		
		
	}

}
