package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Edge {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", 
"C:\\Users\\Krishna\\eclipse-workspace(1)\\Selenium\\drivers\\IEDriverServer.exe");		
		
		WebDriver w=new InternetExplorerDriver();
		
		w.get("http://demo.automationtesting.in/Register.html");
		
		w.manage().window().minimize();
		
		String title = w.getTitle();
		System.out.println("Title is:"+title);
		
		w.close();
		
		
		
	}

}
