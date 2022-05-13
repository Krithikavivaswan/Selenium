package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotest {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://demo.automationtesting.in/Alerts.html");
		
		d.manage().window().maximize();
		
		//simple alert to switch and accept
d.findElement(By.xpath("//a[text()='Alert with OK ']")).click();

d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

Alert al = d.switchTo().alert();

System.out.println(al.getText());

al.accept();



d.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

Alert a = d.switchTo().alert();

System.out.println(a.getText());
a.dismiss();


d.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();

d.findElement(By.xpath("//button[@class='btn btn-info']")).click();


Alert at = d.switchTo().alert();

System.out.println(at.getText());

at.sendKeys("Krithika");

at.accept();














		
		
	}

}
