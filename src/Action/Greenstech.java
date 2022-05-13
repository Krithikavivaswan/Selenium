package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstech {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://greenstech.in/selenium-course-content.html");
		
	driver.manage().window().maximize();
	
	Actions a=new Actions(driver);
	
a.moveToElement(driver.findElement(By.xpath("//div[text()='Courses ']"))).perform();

//a.moveToElement(driver.findElement(By.xpath("//span[text()='Software Testing (12)']"))).perform();
//
//a.moveToElement(driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"))).click();

//a.moveToElement(driver.findElement(By.xpath("//span[text()='Oracle (48)']"))).perform();
//
//a.moveToElement(driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"))).click();

		a.moveToElement(driver.findElement(By.xpath("//span[text()='RPA (6)']"))).perform();
		driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']")).click();

		



		
	}
	
	
	
	

}
