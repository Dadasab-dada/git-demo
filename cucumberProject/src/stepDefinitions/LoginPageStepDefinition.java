package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageClass.LoginPage;

public class LoginPageStepDefinition {
	
	LoginPage lp=new LoginPage();
	
	@Given("^I Am the user of an application$")
	public void i_Am_the_user_of_an_application() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		lp.openURL();
	}

	@When("^User enter valid username$")
	public void user_enter_valid_username() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		lp.enterUserName();
	}

	@When("^User enter valid password$")
	public void user_enter_valid_password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		lp.enterPassword();
	}

	@When("^User click on login hutton$")
	public void user_click_on_login_hutton() throws Throwable {
		lp.clickloginButton();

	}

	@Then("^User should not be able to login successfullyp$")
	public void user_should_not_be_able_to_login_successfullyp() throws Throwable {

		lp.verifyLogin();

	}	
	
	
	@When("^User enter invalid username$")
	public void user_enter_invalid_username() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		lp.enterUserName();
	}

	@When("^User enter invalid password$")
	public void user_enter_invalid_password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		lp.enterPassword();
	}

	@Then("^User should not be able to login successfully$")
	public void user_should_not_be_able_to_login_successfully() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		lp.verifyLogin();
	}

}
