package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1Task4Nasscom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://nasscom.in/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//li[@data_get='register-app'][text()='register']")).click();
		driver.findElement(By.id("edit-field-fname-reg-0-value")).sendKeys("admin");
		driver.findElement(By.id("edit-field-lname-0-value")).sendKeys("pass");
		driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("edit-field-company-name-registration-0-value")).sendKeys("Google");
		Select dropdown = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		dropdown.selectByValue("51");
		driver.findElement(By.id("edit-submit--2")).click();
		
		System.out.println(driver.findElement(By.id("email_error")).getText());
		
		driver.quit();
		

	}

}

/*
1.   Navigate onto https://nasscom.in/
2.  Click on Login and then click on register 
3.  Enter First name as admin
4.  Enter Last name as pass
5.  Enter email address as admin@gmail.com
6.  Enter company name as Google
7.  Select IT Consulting from dropdown
8.  No need to automate CAPTCHA
9.  Click on Register
*/