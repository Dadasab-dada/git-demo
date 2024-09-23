package naukariLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageNaukari  {

	WebDriver driver;

	public void userLaunchWebSite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.naukri.com/");
	}

	public void userclicklogin() throws Exception {
		Thread.sleep(2000);
		WebElement log = driver.findElement(By.xpath("//a[@id='login_Layer']"));
		log.click();

	}
	
	public void enteruserName() throws Exception {
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		name.sendKeys("Dada@mail.com");
	}
	public void enteruserPass() throws Exception {
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		pass.sendKeys("Dada@mail.com");
	}
	
	public void clickLoginButton() throws Exception {
		Thread.sleep(2000);
		WebElement but= driver.findElement(By.xpath("//button[@type='submit']"));
	    but.click();	
	}

}
