package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();

	@Test
	public void doLogin() throws Exception {

		t1.driver =new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.id("pass")).sendKeys("abcbdsf");

		// pass wrong id so that test case will fail
		t1.driver.findElement(By.id("emails-wong")).sendKeys("abc@gmail.com");
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
		
	}

}
