package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//click on create a new account
		// enter firstname as John
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.linkText("Create new account")).click();
	//	driver.findElement(By.linkText("Sign up for Facebook")).click();
	    
	    WebElement firstName = driver.findElement(By.name("firstname"));
	    //Thread.sleep(8000);
	    firstName.sendKeys("John");
	    //lastname as wick, ss as test123, lick on custom radio button
	    driver.findElement(By.name("lastname")).sendKeys("wick");
	    driver.findElement(By.id("password_step_input")).sendKeys("test123");
	    driver.findElement(By.xpath("//input[@name='sex' and @value='-1']")).click();
	    
	    Select day = new Select(driver.findElement(By.id("day")));
	    day.selectByValue("14");
	    Select month = new Select(driver.findElement(By.id("month")));
	    month.selectByIndex(3);
	    Select year = new Select(driver.findElement(By.id("year")));
	   year.selectByVisibleText("1970");
	    
	   driver.findElement(By.xpath("//button[@name='websubmit'][text()='Sign Up']")).click();
	    
	    
	}

}
