package com.allianz.alertdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.alertIsPresent());
		Alert alert =  driver.switchTo().alert();
		String text = driver.switchTo().alert().getText();
	    System.out.println(text);
	    alert.dismiss();
	    driver.quit();
	
		//driver.switchTo().frame(1);
		//System.out.println(driver.getTitle());
		

	}

}
