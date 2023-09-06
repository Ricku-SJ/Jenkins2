package com.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyExecution {

	WebDriver driver;
	@BeforeClass
	public void open()
	{
		Reporter.log("Open",true);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
		driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
		
	}
	@AfterClass
	public void close()
	{
		Reporter.log("Close");
	}
}
