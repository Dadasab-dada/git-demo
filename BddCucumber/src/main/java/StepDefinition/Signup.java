package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Signup {
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.out.println("browser");
	}

	@Given("user enter the url")
	public void user_enter_the_url() {
		System.out.println("url");

	}

	@Then("user enter the username")
	public void user_enter_the_username() {
		System.out.println("username");

	}

	@Then("user enter the password")
	public void user_enter_the_password() {
		System.out.println("password");

	}

	@Then("user click on signup button")
	public void user_click_on_signup_button() {
		System.out.println("signup");

	}
}
