package com.actitime.genric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.actitime.genric.Base;

public class Listner extends Base implements ITestListener {

	

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot t= (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dsc= new File("./Screenshot/"+result.getName()+".png");
		try {
			FileUtils.copyFile(src, dsc);
		} catch (IOException e) {
			
		}
	}

	
}
