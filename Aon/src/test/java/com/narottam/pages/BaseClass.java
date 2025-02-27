package com.narottam.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.narottam.utilities.BrowserFactory;

public class BaseClass {
	
public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.startApplication(driver, "chrome", "https://www.freecrm.com");
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

}
