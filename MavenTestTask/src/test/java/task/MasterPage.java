package task;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.I1;

public class MasterPage implements I1 {

	WebDriver driver;
	boolean status;

	@BeforeTest
	void Load_URL() {
		driver = new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));

	}
	@Test
	void Check_Status() throws Exception {
		status = driver.getPageSource().contains("Returns");
		System.out.println(status);
		if(status==true) {
			
			driver.findElement(id_signin).click();
		}
		Thread.sleep(2000);
	}
	@Test
	void register_Page() throws Exception {
		
		RegisterPage obj=new RegisterPage(driver);
		obj.Create_your_Amazon_account();
		System.out.println("Create_your_Amazon_account");
		Thread.sleep(2000);
		//obj.Add_Name();
		obj.Creat_Account();
		Thread.sleep(2000);
		//obj.Creat_Account();
		//obj.Add_Mob();
	}

}
