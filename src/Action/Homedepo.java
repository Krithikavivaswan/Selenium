package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedepo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver w = new ChromeDriver();

		w.get("https://www.homedepot.com/");

		w.manage().window().maximize();

		Actions a = new Actions(w);

		a.moveToElement(w.findElement(By.xpath("//a[text()='All Departments']"))).perform();
		
		a.moveToElement(w.findElement(By.xpath("//a[text()='Heating & Cooling']"))).perform();
		
		a.moveToElement(w.findElement(By.xpath("//a[text()='Air Conditioners']"))).perform();
		a.click(w.findElement(By.xpath("//a[text()='Portable Air Conditioners']"))).perform();
	
		
		
	}

}
