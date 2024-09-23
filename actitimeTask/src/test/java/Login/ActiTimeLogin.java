package Login;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;


public class ActiTimeLogin {

	WebDriver driver;
	
	
	public void UserLaunchWebBrowser() {
		driver=new ChromeDriver();
		driver.get("https://online.actitime.com/na14/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
	}
	
	public void enterUserName() throws Exception {
		driver.findElement(By.name("username")).sendKeys("nimbalakar.dadasab@gmail.com");
		Thread.sleep(2000);
	}
	
	public void enterUserPassword() throws Exception {
		driver.findElement(By.name("pwd")).sendKeys("amjp#mZ#");;
		Thread.sleep(2000);
	}
	
	public void clickOnLogin() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(2000);
	}
	
}
