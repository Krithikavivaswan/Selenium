package org.webta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoguru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		driver.manage().window().maximize();

		WebElement tables = driver.findElement(By.tagName("table"));
		
//		System.out.println("All the content in the table are:\n"+tables.getText());
		
		List<WebElement> allrows = tables.findElements(By.tagName("tr"));
		System.out.println("No.of rows are:"+allrows.size());
//		WebElement row = allrows.get(0);
//		System.out.println("values in first row:\n"+row.getText());
//		List<WebElement> data = row.findElements(By.tagName("td"));
		
		
		
		
	}
	
}
