package com.alert;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ICICI {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=DEPOSIT&ITM=nli_cms_FD_Primer_FDTaxSaverFD_INVESTINATAXS");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='details-button']")).click();

		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

		Actions a = new Actions(driver);

		a.contextClick().perform();

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Krithika");

		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("Password");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
	}

}
