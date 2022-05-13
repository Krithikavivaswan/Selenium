package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouhov {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver w = new ChromeDriver();

		w.get("http://greenstech.in/selenium-course-content.html");

		w.manage().window().maximize();

		Actions a = new Actions(w);
		
		
		WebElement courselist = w.findElement(By.xpath("//div[text()='Courses ']"));
a.moveToElement(courselist).perform();

WebElement datasci = w.findElement(By.xpath("//div[@title='Data Science']"));
a.moveToElement(datasci).perform();

		
		
		
	}

}
