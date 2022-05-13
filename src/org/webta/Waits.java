package org.webta;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("krithika");*/
		
		//WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		/*w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		w.until(ExpectedConditions.titleContains("log in"));
		System.out.println("Its clickable");*/
		
	/*	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create New Account']")));
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btn.click();*/
		
		
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		
		f.until(ExpectedConditions.alertIsPresent());
	
		Alert a=driver.switchTo().alert();
		
		a.accept();
		
		
		
		
		
		
	}

}
