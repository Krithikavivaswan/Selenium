package Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class HDFC {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
				
				driver.manage().window().maximize();
				
				
				driver.switchTo().frame("login_page");
				
				driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("59318227");

		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("pavi13232");
		driver.findElement(By.xpath("//input[@name='chkrsastu']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();	
		
		
	}

}
