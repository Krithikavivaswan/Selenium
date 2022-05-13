package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("http://demo.guru99.com/test/newtours/register.php");

		d.manage().window().maximize();
		
		WebElement country = d.findElement(By.xpath("//*[@name='country']"));
		Select s=new Select(country);
		
		List<WebElement> alloptn = s.getOptions();
		System.out.println("No.of countries are: "+alloptn.size());
		
		for (WebElement eachcount : alloptn) {
			System.out.println(eachcount.getText());
			System.out.println(eachcount.getAttribute("value"));
		}
		

	}

}
