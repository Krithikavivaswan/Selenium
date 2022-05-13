package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\geckodriver.exe");

		WebDriver d = new FirefoxDriver();

		d.get("http://www.greenstechnologys.com");

		d.manage().window().maximize();

		String title = d.getTitle();
		System.out.println(title);

		d.get("https://www.amazon.in");

		d.manage().window().maximize();

		String tittle = d.getTitle();
		System.out.println(tittle);
		
		
		
	}

}
