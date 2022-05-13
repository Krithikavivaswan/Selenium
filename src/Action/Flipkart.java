package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver w = new ChromeDriver();

		w.get("http://www.flipkart.com");

		w.manage().window().maximize();

		Actions a = new Actions(w);
		
		w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

        a.moveToElement(w.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"))).perform();		
		

		
	}

}
