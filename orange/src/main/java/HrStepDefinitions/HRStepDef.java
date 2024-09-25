package HrStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import HrUtilityies.HR1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRStepDef implements HR1{
	
	
	
	WebDriver driver;
	//HRLoginPage page;
	
	
	@Given("user launch browser")
	public void user_launch_browser() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password(String username,String password) {
		driver.findElement(user_name).sendKeys("Admin");
		driver.findElement(user_password).sendKeys("admin123");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(button).click();

	}

}
