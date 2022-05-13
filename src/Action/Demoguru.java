package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver w = new ChromeDriver();
		
		w.get("https://demo.guru99.com/test/drag_drop.html");
		
		w.manage().window().maximize();
		
		Actions a=new Actions(w);

		WebElement act1 = w.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement ban = w.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(act1, ban).perform();
		
		
		WebElement amt1 = w.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement deb = w.findElement(By.xpath("//li[@class='placeholder']"));
		
		a.dragAndDrop(amt1, deb).perform();
		

		WebElement act2 = w.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement sal = w.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(act2, sal).perform();
		

		
		WebElement cred = w.findElement(By.xpath("//li[@class='placeholder']"));
		WebElement amt2 = w.findElement(By.xpath("//a[text()=' 5000']"));
		a.dragAndDrop(amt2, cred).perform();
		
		
		
	}

}
