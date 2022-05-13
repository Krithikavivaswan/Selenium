package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver w = new ChromeDriver();

		w.get("https://www.snapdeal.com/");

		w.manage().window().maximize();

		Actions a = new Actions(w);

		
//		a.moveToElement(w.findElement(By.xpath("//span[text()='Mobile & Accessories']"))).perform();
//		w.findElement(By.xpath("//span[text()='Printed Back Covers']")).click();

		a.moveToElement(w.findElement(By.xpath("(//span[@class='catText'])[2]"))).perform();
		
		a.moveToElement(w.findElement(By.xpath("//span[text()='Footwear']"))).perform();
		
		
		
		
		
		
	}
	

}
