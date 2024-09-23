package StepDefinition;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Login.ActiTimeLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActiTimeStepD extends ActiTimeLogin{
	
	WebDriver driver;

	@Test
	@Given("user launch the browser")
	public void user_launch_the_browser() {
 
		UserLaunchWebBrowser();
	}
	
	@When("user enter the username")
	public void user_enter_the_username() throws Exception {
		enterUserName();
	}

	@When("user enter the password")
	public void user_enter_the_password() throws Exception {
		enterUserPassword();
	}

	@Then("user click on login but")
	public void user_click_on_login_but() throws Exception {
		clickOnLogin();
	}

}
