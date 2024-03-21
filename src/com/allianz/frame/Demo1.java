package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));   //using xpath
		//driver.switchTo().frame("login_page");  //using name/id;
		//driver.switchTo.frame(0); //using index
		driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123test333");
		driver.findElement(By.linkText("CONTINUE")).click();
		driver.switchTo().defaultContent();
	}

}
