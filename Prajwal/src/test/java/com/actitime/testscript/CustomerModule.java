package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	
@Test
public void createCust() {
	Reporter.log("ashdsadj",true);
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com");
}
}
