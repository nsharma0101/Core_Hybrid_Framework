package com.selenium.hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class GenericKeywords {

	public WebDriver driver;
	public Properties prop;
	
	public GenericKeywords() {
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//project.properties");
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public  void openBrowser(String browserType){
		
	
		
		if (browserType.equals("Iexplorer")){
			System.setProperty("webdriver.ie.driver", "C:\\Neeraj Sharma\\Java Selenium Pratice\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		} else if(browserType.equals("Chrome")) {  
			System.setProperty("webdriver.chrome.driver", "C:\\Neeraj Sharma\\Java Selenium Pratice\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserType.equals("Mozilla")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Neeraj Sharma\\Java Selenium Pratice\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	public void navigate(String urlkey){
		
		System.out.println("navigating to"+prop.getProperty(urlkey));
		driver.get(urlkey);
		
		
	}
	
	public void click(String locatorkey){
		System.out.println("Clicking on"+prop.getProperty(locatorkey));
		
		if(locatorkey.endsWith("_xpath")){
			driver.findElement(By.xpath(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("_id")){
			driver.findElement(By.id(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("_name")){
			driver.findElement(By.name(prop.getProperty(locatorkey))).click();
		} 
		
	}
	
	public void input(String locatorkey, String data){
		
		System.out.println("Writing on"+prop.getProperty(locatorkey));
		
		if(locatorkey.endsWith("_xpath")){
			driver.findElement(By.xpath(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("_id")){
			driver.findElement(By.id(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("_name")){
			driver.findElement(By.name(prop.getProperty(locatorkey))).click();
		} 
		
	}
	
	public void verifyText(String locatorkey, String expectedText){
		
		if(locatorkey.endsWith("_xpath")){
			driver.findElement(By.xpath(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("_id")){
			driver.findElement(By.id(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("_name")){
			driver.findElement(By.name(prop.getProperty(locatorkey))).click();
		} 
		
	}
	
}
