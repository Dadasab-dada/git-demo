package HrUtilityies;

import org.openqa.selenium.By;

public interface HR1 {
	
	
	String base_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	By user_name= By.name("username");
	By user_password = By.name("password");
	By button = By.xpath("//button[@type='submit']");

}