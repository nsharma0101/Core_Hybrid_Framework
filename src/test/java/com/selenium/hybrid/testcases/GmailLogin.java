package com.selenium.hybrid.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.selenium.hybrid.GenericKeywords;



public class GmailLogin {

	
	@Test
	public void doLogin(){
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gmail.com");	
		driver.findElement(By.id("Email")).sendKeys("neerajvsharma@gmail.com");
		driver.findElement(By.id("next")).click();
		
		

		
		
	}
		
		
		
		
		
		
		
	}


