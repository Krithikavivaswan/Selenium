package org.robo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
a.moveToElement(driver.findElement(By.xpath("(//span[@class='catText'])[1]"))).perform();

driver.findElement(By.xpath("//span[text()='Belts']")).click();

		
	}
}
