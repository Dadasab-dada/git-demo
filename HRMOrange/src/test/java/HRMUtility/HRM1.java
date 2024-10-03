package HRMUtility;

import org.openqa.selenium.By;

public interface HRM1 {
	
	
	//String base_URL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	By enter_username=By.xpath("//input[@name='username']");
	By enter_password=By.xpath("//input[@name='password']");
	By click_login=By.xpath("//button[@type='submit']");
	//By admi_click=By.xpath("//ul[@class='oxd-main-menu']/li");
	//By dash_click=By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[8]");
//	By Syuser_click=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
//	By dropdown_click=By.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
//	By employe_click=By.xpath("//*[@placeholder='Type for hints...']");
//	By emdrop_click=By.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
//	By emDrop_click=By.xpath("(//*[@class='oxd-select-text-input'])[2]");
//    By user_click=By.xpath("//*[@type='submit']");
    
    
	By admin_click=By.xpath("//li[1]//a[1]//span[1]");

    By system_User=By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]");
    By click_Dropd=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    By select_role=By.xpath("(//div[@role='option'])[2]");
    By employe_name=By.xpath("//input[@placeholder='Type for hints...']");
    By click_status=By.name("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    By select_status=By.id("(//div[@role='option'])[2]");
    By search_on=By.id("//button[@type='submit']");
}
