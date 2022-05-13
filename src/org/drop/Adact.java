package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adact {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("krithikaganesh");
		driver.findElement(By.name("password")).sendKeys("kb10316*");
		driver.findElement(By.name("login")).click();

		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s2 = new Select(adult);
		s2.selectByIndex(2);
//		List<WebElement> adultroom = s2.getOptions();
//		for (WebElement totaroom : adultroom) {
//			
//			System.out.println(totaroom.getText());
//		}
//		

		WebElement loc = driver.findElement(By.name("location"));
		Select s1 = new Select(loc);
		s1.selectByVisibleText("Sydney");
//		List<WebElement> location = s1.getOptions();
//		for (int i = 1; i< location.size(); i++) {
//			WebElement totloc = location.get(i);
//			System.out.println(totloc.getText());
//		}

		WebElement room = driver.findElement(By.name("room_type"));
		Select s = new Select(room);
		s.selectByVisibleText("Deluxe");
//		List<WebElement> roomtyp = s.getOptions();
//		for (WebElement totroom : roomtyp) {
//			
//			System.out.println(totroom.getText());
//		}

		
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select s3=new Select(hotels);
		s3.selectByValue("Hotel Sunshine");
		
		WebElement noofrooms = driver.findElement(By.id("room_nos"));
		Select s4=new Select(noofrooms);
		s4.selectByIndex(1);
		
		WebElement childroom = driver.findElement(By.name("child_room"));
		Select s5=new Select(childroom);
		s5.selectByValue("3");
		
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Krithika");
		driver.findElement(By.name("last_name")).sendKeys("Ganesh");
		driver.findElement(By.name("address")).sendKeys("Chennai");
		driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
		
		WebElement cardtyp = driver.findElement(By.name("cc_type"));
		Select s6=new Select(cardtyp);
		s6.selectByIndex(2);
		
		WebElement exp = driver.findElement(By.name("cc_exp_month"));
		Select s7=new Select(exp);
		s7.selectByVisibleText("January");
		
		WebElement eyr = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(eyr);
		s8.selectByValue("2022");
		
		driver.findElement(By.name("cc_cvv")).sendKeys("234");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(6000);
		WebElement bookno = driver.findElement(By.name("order_no"));
		System.out.println("You room has been booked & order no is:"+bookno.getAttribute("value"));
		
		
		
		
		
		
		
		
		
		
	}

}
