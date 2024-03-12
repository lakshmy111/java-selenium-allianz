package com.allianz.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1Salesforce {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		Select title = new Select(driver.findElement(By.name("UserTitle")));
		title.selectByValue("IT_Manager_AP");
		
		Select employees = new Select(driver.findElement(By.name("CompanyEmployees")));
		employees.selectByVisibleText("201 - 500 employees");
		
		Select country = new Select(driver.findElement(By.name("CompanyCountry")));
		country.selectByVisibleText("United Kingdom");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox' and @id='SubscriptionAgreement']/following-sibling::div"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", checkBox);
		
		driver.findElement(By.name("start my free trial")).click();
		String errorMessage = driver.findElement(By.xpath("//span[contains(@id,'agree_to_all-')]")).getText();		
		System.out.println(errorMessage);
		
		driver.quit();
	}
}

/*
 Task 1 (Important) 
1.  Navigate onto https://www.salesforce.com/in/form/signup/freetrial-sales/
2.  Enter first name as “John”
3.  Enter last name as “wick”
4.  Enter work email as “john@gmail.com”
5.  Select Job title as “IT Manager”
6.  Select Employees as “101-500 employees”
7.  Select country as “United Kingdom”
8.  Do not fill the phone number
9.  Click on check box 
10. Click on start my free trial 
11. Get the error message displayed “Enter a valid phone number”
*/
