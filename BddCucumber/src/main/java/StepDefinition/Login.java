package StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.LoginPage;

public class Login extends LoginPage {
	@Given("user launched browser")
	public void user_launched_browser() {
	    openURL();
	}

	@When("User enter valid username")
	public void user_enter_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
enterUserName();	   
	}

	@When("User enter valid password")
	public void user_enter_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
enterPassword();	    
	}

	@When("teer click on login button")
	public void teer_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
clickloginButton();
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
verifyLogin();
	}

	@When("User enter invalid username")
	public void user_enter_invalid_username() {
	    // Write code here that turns the phrase above into concrete actions
	  
enterUserName();
	}

	@When("User enter invalid password")
	public void user_enter_invalid_password() {

	enterPassword();}

	@When("User click on login hutton")
	public void user_click_on_login_hutton() {
clickloginButton();
	}

	@Then("User should not be able to login successfullyp")
	public void user_should_not_be_able_to_login_successfullyp() {
verifyLogin();
	}




	
}