package task;

import org.openqa.selenium.WebDriver;

import utility.I1;

public class RegisterPage implements I1 {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {

		this.driver=driver;
	}
	
	void Create_your_Amazon_account() {
		driver.findElement(Create_account).click();
	}
	
	void Creat_Account() throws Exception {
		driver.findElement(Create_a).sendKeys("Dada Nimbalakar");
		Thread.sleep(2000);
		driver.findElement(Create_b).sendKeys("8088161113");
		Thread.sleep(2000);
		driver.findElement(Enter_p).sendKeys("Gogo@1212");
		Thread.sleep(2000);
		driver.findElement(Enter_C).click();
	}
	
//	void Add_Name() {
//		driver.findElement(Create_a).sendKeys("Dada Nimbalakar");
//	}
//	void Add_Mob() {
//		driver.findElement(Create_b).sendKeys("8088161113");
//	}

}
