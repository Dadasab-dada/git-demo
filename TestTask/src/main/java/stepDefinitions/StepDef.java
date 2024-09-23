package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import loginPage.LoginClass;

public class StepDef {
	LoginClass logi;
	
	@Given("user launched naukari website")
	public void user_launched_naukari_website() {
	logi.userLaunchWebsite();
	}
	@When("User click on the login button")
	public void user_click_on_the_login_button() {
	    logi.userclickLoginButton();
	}
	@When("User enter valid username")
	public void user_enter_valid_username() {
	   logi.enterUserName();
	}
	@When("User enter valid password")
	public void user_enter_valid_password() {
	   logi.enterUserPassword();
	}
	@Then("User click on login button")
	public void user_click_on_login_button() {
	    logi.clickLogin();
	}






}
