package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fruits {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);

		s.selectByIndex(3);
		s.selectByValue("banana");
		s.selectByVisibleText("Apple");

		List<WebElement> allopt = s.getOptions();
		System.out.println("Total no of options:" + allopt.size());
		
		//To find the position of particular value
		
//		for (int i = 0; i < allopt.size(); i++) {
//			WebElement eachopt = allopt.get(i);
//			String partfruit = eachopt.getText();
//			
//			if (partfruit.equals("Orange")) {
//				System.out.println("Position of orange is:"+i);
//				break;
//				
//			}
//		}
//		
		
		

List<WebElement> allfruits = s.getAllSelectedOptions();
	
		System.out.println("No.of selected options:" + allfruits.size());
		System.out.println("No.of non selected option is:" + (allopt.size() - allfruits.size()));
System.out.println(allopt.removeAll(allfruits));
for (WebElement each : allopt) {
System.out.println("Non selected fruits is:"+each.getText());	
}
		
		
		
//		System.out.println("Even fruits are:");
//		for (int i = 0; i < allopt.size(); i=i+2) {
//			WebElement evenfruits = allopt.get(i);
//			System.out.println(evenfruits.getText());
//			
//		}
//		
//		System.out.println("Odd fruits are:");
//		for (int i = 1; i < allopt.size(); i=i+2) {
//			WebElement oddfruits = allopt.get(i);
//			System.out.println(oddfruits.getText());
//		
//		
//		}
//		
		
//		s.deselectByIndex(2);
//		s.deselectByValue("banana");
//		s.deselectByVisibleText("Apple");

//		
//		System.out.println("All selected fruits are:");
//
//		for (int i = 0; i < allfruits.size(); i++) {
//			WebElement eachfruit = allfruits.get(i);
//			System.out.println(eachfruit.getText());
//
//		}
		
		
//
//		WebElement first = s.getFirstSelectedOption();
//		System.out.println("First selected fruits is:" + first.getText());

	}

}
