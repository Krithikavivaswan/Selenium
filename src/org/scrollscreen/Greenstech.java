package org.scrollscreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.get("http://www.greenstechnologys.com/");
			driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		
		WebElement online = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)", online);
		
		
//		WebElement job = driver.findElement(By.xpath("//div[@id='heading20']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", job);
//		
//		WebElement perum = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", perum);
//		
//		File s = ts.getScreenshotAs(OutputType.FILE);
//		
//		File d=new File("C:\\Users\\Krishna\\eclipse-workspace\\Selenium\\Screenshots\\Job.png");
//		
//		FileUtils.copyFile(s, d);
//		

//		WebElement addr = driver.findElement(By.xpath("(//div[@class='trainer-info'])[4]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", addr);
//
//		WebElement porur = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
//		System.out.println(porur.getText());
		

//		WebElement test = driver.findElement(By.id("heading303"));
//		js.executeScript("arguments[0].scrollIntoView(true)", test);
//				

	}
}
