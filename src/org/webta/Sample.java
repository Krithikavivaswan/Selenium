package org.webta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();

//		List<WebElement> tables = driver.findElements(By.tagName("table"));
//		System.out.println("Total no of tables:"+tables.size());
//		
//		WebElement we = tables.get(0);
//		System.out.println(we.getText());

		// To locate all rows in a table
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));

		// 1. To fetch only 4th row part data
//WebElement row = allrows.get(4);

		// List<WebElement> alldatas = row.findElements(By.tagName("td"));
//		WebElement data = alldatas.get(1);
//		System.out.println(data.getText());

		// 2. To fetch all data from 4th row
//		for (int i = 0; i < alldatas.size(); i++) {
//			
//			WebElement data = alldatas.get(i);
//			System.out.println(data.getText());
//			
//		}
//		
		// Assume 10 data are there in 4th row, in which we have to print only 0,4, 7th
		// data
		// need to give if loop

//          for (int i = 0; i < alldatas.size(); i++) {
//			
//			if (i==0||i==4||i==7) {
//				WebElement data = alldatas.get(i);
//				System.out.println(data.getText());
//			
//			}
//		}
//		

		// 4. To print 2nd column

//		for (int i = 1; i < allrows.size(); i++) {
//			
//			WebElement rows = allrows.get(i);
//			List<WebElement> alldata = rows.findElements(By.tagName("td"));
//			WebElement coluinfo = alldata.get(2);
//			System.out.println(coluinfo.getText());
//			
//		}

		// 5.To print all datas without heading

//		for (int i = 1; i < allrows.size(); i++) {
//			
//			WebElement row = allrows.get(i);
//			List<WebElement> alldata = row.findElements(By.tagName("td"));
//			for (int j = 0; j < alldata.size(); j++) {
//				WebElement data = alldata.get(j);
//				String name = data.getText();
//				// 6.To fetch part data, row , cell no
//				if (name.startsWith("Helen")) {
//System.out.println("Name:"+name+"\nRow no:"+i+"\nCell no:"+j);
//break;
//				
//				}
//				
//			}
//		}
//	

		// 7. To print only headings

//		WebElement heading= allrows.get(0);
//		List<WebElement> headings = driver.findElements(By.tagName("th"));
//		for (int i = 0; i < headings.size(); i++) {
//			
//			WebElement data = headings.get(i);
//			System.out.println(data.getText());
//		}

		// 8.To print all data with heading using normal for loop

//		WebElement headings = allrows.get(0);
//		List<WebElement> heading = headings.findElements(By.tagName("th"));
//		for (int i = 0; i < heading.size(); i++) {
//
//			WebElement data = heading.get(i);
//			System.out.println(data.getText());
//		}
//
//		for (int i = 1; i < allrows.size(); i++) {
//			WebElement row = allrows.get(i);
//			List<WebElement> rdata = row.findElements(By.tagName("td"));
//			for (int j = 0; j < rdata.size(); j++) {
//
//				WebElement datas = rdata.get(j);
//				System.out.println(datas.getText());
//
//			}
//
//		}

		//9. To print using enhanced for loop
		
		for (WebElement eachrow : allrows) {
			List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
for (WebElement data : alldata) {
	
	System.out.println(data.getText());
	
}			
				
			}
			
		}
		
		
	}
	
	

