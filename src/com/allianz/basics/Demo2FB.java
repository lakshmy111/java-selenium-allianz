package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("title is - "+driver.getTitle());
		System.out.println("url is -"+driver.getCurrentUrl());
		System.out.println("page source is - "+driver.getPageSource());
		driver.quit();
	}

}
