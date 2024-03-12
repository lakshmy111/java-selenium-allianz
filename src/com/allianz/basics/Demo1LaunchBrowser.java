package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("ch")) {
			driver =new ChromeDriver();
		}
		else {
			driver =new EdgeDriver();
		}
 //run time polymorphism
		
		driver.get("https://www.facebook.com/");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.co.in");
		
		String title = driver1.getTitle();
		System.out.println("page source is - "+driver1.getPageSource());
		System.out.println("title is - "+title);
		System.out.println("url is -"+driver1.getCurrentUrl());
		
		System.out.println("title is - "+driver.getTitle());
		System.out.println("url is -"+driver.getCurrentUrl());
		
		driver1.quit();
		driver.quit();
	}

}
