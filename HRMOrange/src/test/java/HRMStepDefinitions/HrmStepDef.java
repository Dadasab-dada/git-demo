package HRMStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import HRMLogin.HrmLoginClass;
import HRMLogin.SearchAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmStepDef  {

//	WebDriver driver;
//	HrmLoginClass login;
//	SearchAdmin admin;
////
//	@Before
//	public void setUp() {
//		login = new HrmLoginClass(driver);
//	     admin = new SearchAdmin(driver);
//
//	}
	WebDriver driver; 
    HrmLoginClass login;
    SearchAdmin searchAdmin;

    // Cucumber will automatically inject these dependencies using DI
    public HrmStepDef(HrmLoginClass login, SearchAdmin searchAdmin) {
        this.login = login;
        this.searchAdmin = searchAdmin;
    }

//    @Before
//    public void setUp() {
//       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//        login.setDriver(driver);  // Manually set the driver in the HrmLoginClass
//        searchAdmin.setDriver(driver);  // Manually set the driver in the SearchAdmin
//    }

	@Given("user launch browser")
	public void user_launch_browser() throws Exception {
		// login = new HrmLoginClass();
		
		 //login = new HrmLoginClass(driver);
	     //admin = new SearchAdmin(driver);
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	       // login.setDriver(driver);  // Manually set the driver in the HrmLoginClass
	        //searchAdmin.setDriver(driver);  // Manually set the driver in the SearchAdmin
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) throws Exception {
		// login = new HrmLoginClass();
		login.enterValidCredentials(username, password);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws Exception {
		// By click_login = By.xpath("//button[@type='submit']");
		// login = new HrmLoginClass();

		login.clickLogin();

	}

	//@Given("user click on admin")
	//public void user_click_on_admin() throws Exception {
//		if (login != null) {
//			login.userclickonAdmin();
//		} else {
//			throw new NullPointerException("HrmLoginClass not initialized.");
//		}
	//	 login.userclickonAdmin();

		// login.userclickonAdmin();
	//}

	//@Then("user navigate to dashboard")
	//public void user_navigate_to_dashboard() throws Exception {
	//	login.userreturnBackToDashBoard();
	//}

	@Given("user click admin element")
	public void user_click_admin_element() throws Exception {
//		if(admin != null) {
//		admin.clickAdminElement();
//		}else {
//			throw new NullPointerException("SearchAdmin not initialized.");
//	
//		}
		searchAdmin=new SearchAdmin(driver);
		
		searchAdmin.clickAdminElement();

	}

	@When("enter system username")
	public void enter_system_username() throws Exception {
 
		searchAdmin.systemUsername();
	}

	@When("click userrole dropdown")
	public void click_userrole_dropdown() throws Exception {
		searchAdmin.userRoleDropdClick();
	}

	@Then("select the role from dropdwon")
	public void select_the_role_from_dropdwon() throws Exception {
		searchAdmin.selectRoleFromDropd();
	
	}

	@Then("enter employe name")
	public void enter_employe_name() throws Exception {
		searchAdmin.employeNameEnter();
	}

	@Then("click status dropdown")
	public void click_status_dropdown() throws Exception {
		searchAdmin.clickStatus();
	}

	@Then("select status from dropdown")
	public void select_status_from_dropdown() throws Exception {
		searchAdmin.selectStatus();
	}

	@Then("click on search button")
	public void click_on_search_button() throws Exception {
		searchAdmin.searchButton();
	}

}
