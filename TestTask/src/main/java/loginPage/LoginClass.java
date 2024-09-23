package loginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class LoginClass {
	
	WebDriver driver;
	
//	public void desiredURL() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		driver.get("https://www.google.com/");
//	}
	
	public void userLaunchWebsite() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.com/");
//		WebElement enterSite= driver.findElement(By.xpath("//*[@id=\"input\"]"));
//		enterSite.sendKeys("https://www.naukri.com/");
//		enterSite.click();
		
	}
	
	public void userclickLoginButton() {
		WebElement loginButton=driver.findElement(By.xpath("//a[@id='login_Layer']"));
		loginButton.click();
	}
	public void enterUserName() {
		WebElement userName=driver.findElement(By.xpath("//input[@id='usernameField']"));
		userName.sendKeys("dada@gmail.com");
	}
	
	public void enterUserPassword() {
		WebElement pass=driver.findElement(By.id("//input[@id='passwordField']"));
		pass.sendKeys("1212");
	}
	
	public void clickLogin() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	

}
