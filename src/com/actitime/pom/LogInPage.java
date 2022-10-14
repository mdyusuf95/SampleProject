package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	@FindBy(id="username")
	WebElement unbx;
	
	@FindBy(name="pwd")
	WebElement pwbx;
	
	@FindBy(id="loginButton")
	WebElement lgbtn;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  setLogIN(String username, String password)
	{
		unbx.sendKeys(username);
		pwbx.sendKeys(password);
		lgbtn.click();
	}
	
	

}
