package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user launched naukari website")
	public void user_launched_naukari_website() {
		System.out.println("inside user launched naukari website ");
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		System.out.println("inside User click on the login button");
	}

	@And("User enter valid username")
	public void user_enter_valid_username() {
		System.out.println("inside User enter valid username");
	}

	@When("User enter valid password")
	public void user_enter_valid_password() {
		System.out.println("inside User enter valid password");
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		System.out.println("inside ");
	}


}
