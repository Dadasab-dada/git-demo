package HRMStepDef;

import HRMLogin.AdminClass;
import HRMLogin.LoginPage;
import Utility.HRMConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;
     LoginPage login;
     AdminClass admin;

    @Given("user launch browser")
    public void user_launch_browser() {
//      //  driver = DriverFactory.getDriver();
//        login = new LoginPage(driver);
//      // driver.get(HRMConstants.LOGIN_URL);
       driver=new ChromeDriver();
       driver.get(HRMConstants.LOGIN_URL);
        System.out.println("Navigated to OrangeHRM login page: " + HRMConstants.LOGIN_URL);
    }

    @Given("user enter valid username {string} and password {string}")
    public void user_enter_valid_username_and_password(String username, String password) {
        System.out.println("Entering valid username and password...");
        login = new LoginPage(driver);
        login.enterValidUsernameAndPassword(username, password);
    }

    @Then("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("Clicking on the login button...");
        login.clickLoginButton();
        System.out.println("User is on admin dashboard");
    }

    @Given("user click on admin")
    public void user_click_on_admin() {
        System.out.println("Clicking on the Admin tab...");
        admin = new AdminClass(driver);
        admin.clickAdminTab();
        System.out.println("Clicked on the Admin tab.");
    }

    @Given("click on add button")
    public void click_on_add_button() {
        System.out.println("Clicking on the Add button...");
        admin.clickAddButton();
    }
}
