package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	//ITestResult will provides us the case execution status and test name
	
	public void captureScreenshot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
		
		//create ref of TakeScreenshot Interface and type casting
		TakesScreenshot ts=(TakesScreenshot) driver;//Typecasting of 2 interface
		
		//use getScreenShotAs() to capture the screenshot in life format
		//getScreenshot() method return type=FILE
		File sourceFolder = ts.getScreenshotAs(OutputType.FILE);
		
		//copy the file to specific location
		File destFolder = new File("./screenshots/" + result.getName() + ".png");
		FileUtils.copyFile(sourceFolder, destFolder);
		System.out.println(result.getName() + "method() screnshot captured");
		
	}
	}

}
