package com.selenium.selenium_testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxBinary;

public class SampleSelTest {
	
	
	WebDriver driver;
	
		@Test
	public void TestMethod() {
		 //Launch firefox browser 
			System.setProperty("webdriver.gecko.driver", "/Usr/local/bin/geckodriver");
			driver = new FirefoxDriver();  
			//driver.get("https://google.com");
			//FirefoxBinary firefoxBinary = new FirefoxBinary();
			//firefoxBinary.addCommandLineOptions("--headless");
			//firefoxBinary.addCommandLineOptions("--no-sandbox");
			//FirefoxOptions firefoxOptions = new FirefoxOptions();
			//firefoxOptions.setBinary(firefoxBinary);
			//FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
			 
			driver.get("https://google.com");
			 if (driver.getPageSource().contains("nothiing")) {
			 System.out.println("Pass");
			 } else {
			 System.out.println("Fail");
			 }
			 driver.quit();
		}
	
		 
		

}

