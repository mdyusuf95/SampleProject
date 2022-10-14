package com.actitime.genric;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LogInPage;

public class Base {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	public  WebDriver driver;
	
	@BeforeTest
	public void openBrrowser()
	{   
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrrowser()
	{
		driver.close();
	}
	@BeforeMethod
	public void logIn() throws IOException
	{   
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String username = f.getPropertyData("usr");
		String password = f.getPropertyData("pwd");
		driver.get(url);
		LogInPage l= new LogInPage(driver);
		l.setLogIN(username,password);
		
	}
	@AfterMethod
	public void logOut()
	{
		
	}
	}


