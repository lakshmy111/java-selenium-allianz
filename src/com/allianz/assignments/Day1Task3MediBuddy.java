package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Task3MediBuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.medibuddy.in/");
		driver.switchTo().frame(driver.findElement(By.id("wiz-iframe")));
		driver.findElement(By.xpath("//a[@class = 'wzrkClose' ]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//div[@ng-click='linkAccount()'][text()='I have a Corporate Account']")).click();
		driver.findElement(By.linkText("Learn More")).click();
		driver.findElement(By.linkText("skip")).click();
		driver.findElement(By.xpath("//a[@ng-click='openUsernameScreen()']")).click();
		driver.findElement(By.id("username")).sendKeys("john");
		driver.findElement(By.xpath("//button[@type='submit'][text()='Proceed']")).click();
		driver.findElement(By.id("password")).sendKeys("john123");
		driver.findElement(By.xpath("//img[@ng-click='toggleShowPassword(true)']")).click();
		driver.findElement(By.xpath("//button[@type='submit'][text()='Sign In']")).click();
		
		String errorText = driver.findElement(By.xpath("//div[@ng-if ='isPasswordWrong']")).getText();
		System.out.println(errorText);
		
		driver.quit();
	}

}
/*
1.  Navigate onto https://www.medibuddy.in/
2.  Close if any popup and Click on Login
3.  Click on I have Corporate Account 
4.  Click on Learn More
5.  Click on Skip
6.  Click on Login using Username & Password
7.  Enter username as john 
8.  Enter password as john123 
9.  Click on show password 
10. Click log in 
11.  Get the error message shown and print it in terminal
*/