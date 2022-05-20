package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class FB {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\eclipse-workspace(1)\\\\Selenium\\\\drivers\\\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.facebook.com/");

		d.manage().window().maximize();

		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(10000);

//				WebElement mon = d.findElement(By.id("month"));
//		WebElement years = d.findElement(By.id("year"));
		WebElement days = d.findElement(By.id("day"));
		Select s = new Select(days);

//	if (s.isMultiple()) {
//		System.out.println("Multiple options can be selected");
//		
//	}
//	else {
//		System.out.println("Single options can be selected");
//	}

//		s.selectByVisibleText("Dec");
//		s.selectByIndex(3);
//		s.selectByValue("5");
//
		// To get all options

		List<WebElement> allOpt = s.getOptions();
		System.out.println("No.of options in dropdown: " + allOpt.size());

//	for (WebElement eachopt : allOpt) {
//		
//		System.out.println(eachopt.getText());
//		
//	}

		// Normal for loop
//		System.out.println("All options are:");
//
//		for (int i = 0; i < allOpt.size(); i++) {
//
//			WebElement eachopt = allOpt.get(i);
//			System.out.println(eachopt.getAttribute("value"));
//			
//		}

		System.out.println("Even dates are:");
		
for (int i = 2; i < allOpt.size(); i++) {
	
	if (i%2==0) {
	
		System.out.println(i);
	}
	
}
		
		
		
		
	}

}
