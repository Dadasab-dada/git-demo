package runnerandstep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.AdminAddUserClass;
import pom.AdminClass;
import pom.LoginPage;

public class IntegrationStepDef {

	WebDriver driver;
	LoginPage login;
	AdminClass adminPage;
	AdminAddUserClass addUser;

	@Given("user launch browser")
	public void user_launch_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@And("^user enter(.*) and(.*)$")
	public void user_enter_valid_username_and_password(String username, String password) throws InterruptedException {
		login = new LoginPage(driver);
		login.enterValidaCredentilas(username, password);

	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		login.clickloginButton();

	}

	@Then("user navigate to dashboard")
	public void user_navigate_to_dashboard() {

		System.out.println("---------Admin is on DashBoard----------");

	}

	// Second admin scenario

	@Given("user click on Admin Element")
	public void user_click_on_admin_element() throws InterruptedException {
		adminPage = new AdminClass(driver);
		Thread.sleep(2000);
		adminPage.userclickonAdminElement();

	}

	@And("user click on add button")
	public void user_click_on_add_button() throws InterruptedException {
		adminPage.userclickonADDButton();

	}

	@Then("user should navigate to admin page")
	public void user_should_navigate_to_admin_page() {
		System.err.println(" User is on Amin Page");
	}
	
	//Third scenario admin page 
	
	@Given("click on user role dropdown")
	public void click_on_user_role_dropdown() throws InterruptedException {
	   addUser=new AdminAddUserClass(driver);
	   addUser.clickonuserroledropdown();
	}

	@When("select dropdown list for role")
	public void select_dropdown_list_for_role() throws InterruptedException {
		addUser.selectdropdownlistforrole();
	  
	 
	}

	@When("enter employe name")
	public void enter_employe_name() throws InterruptedException {
		addUser.enteremployename();
	   
	}

	@When("click on status dropdown")
	public void click_on_status_dropdown() throws InterruptedException {
		addUser.clickonstatusdropdown();
	    
	}

	@When("select dropdown list for status")
	public void select_dropdown_list_for_status() throws InterruptedException {
	  addUser.selectdropdownlistforstatus();
	}

	@When("enter user name")
	public void enter_user_name() throws InterruptedException {
	    addUser.enterusername();
	}

	@When("enter newpassword and confirmpassword")
	public void enter_newpassword_and_confirmpassword() throws InterruptedException {
	    addUser.enternewpasswordandconfpassword();
	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {
	   addUser.clickonsavebutton();
	}




}
