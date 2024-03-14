package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.db4free.net/");
		driver.findElement(By.linkText("phpMyAdmin »")).click();
		ArrayList <String> windowtabs = new ArrayList<String>(driver.getWindowHandles());
		for(String tab :windowtabs) {
			driver.switchTo().window(tab);
			if(driver.getTitle().equalsIgnoreCase("phpMyAdmin")) {
				
				break;
			}
		}
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin");
//		driver.close();
//		driver.switchTo().window(windowtabs.get(0));
System.out.println(driver.getTitle());
		driver.quit();
	}

}
