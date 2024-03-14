package com.allianz.assignments;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2TabsCiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		driver.findElement(By.xpath("//img[@title='LOGIN NOW']")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		for(String tab : tabs) {
			driver.switchTo().window(tab);
			if(driver.getTitle().equals("Citibank India")){
				break;
			}
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@onClick='ForgotUserID();']")).click();
		
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
