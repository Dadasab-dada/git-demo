package utility;

import org.openqa.selenium.By;

public interface I1 {

	String base_url = "https://www.amazon.in/";

	// Locaters
	By id_signin = By.id("nav-link-accountList-nav-line-1");
	By Create_account = By.linkText("Create your Amazon account");
	By Create_a =By.xpath("//input[@id='ap_customer_name']");
	By Create_b=By.xpath("//input[@type='tel']");
	By Enter_p=By.id("ap_password");
	By Enter_C=By.id("continue");
}