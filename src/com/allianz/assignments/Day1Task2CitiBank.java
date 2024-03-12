package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1Task2CitiBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");
		driver.findElement(By.id("cvvnumber")).sendKeys("100");
		driver.findElement(By.id("bill-date-long")).click();
		
		Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByValue("2022");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByValue("3");
		
		driver.findElement(By.xpath("//a[@class='ui-state-default' and @href='#'][text()='14']")).click();
		driver.findElement(By.xpath("//input[@value='PROCEED' and @class = 'ctaBlue minWidth' ]")).click();

		String textMessage = driver.findElement(By.id("ui-id-1")).getText();		
		System.out.println(textMessage);
		
		driver.quit();
	}

}


/*
 * 
Task 2 
1.  Navigate onto https://www.citibank.co.in/ssjsps/forgetuserid.jsp
2.  Choose Credit Card
3.  Enter credit card number as 4545 5656 8887 9998 
4.  Enter cvv number 
5.  Enter date as “14/04/2022”
6.  Click on Proceed 
7.   Get the text and print it “Please accept Terms and Conditions”
*/