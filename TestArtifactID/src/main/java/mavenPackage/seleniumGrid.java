package mavenPackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.net.URL;
import java.net.MalformedURLException;


public class seleniumGrid {

//	@DataProvider(parallel=true)
//	public Object[][] sendData(){
//		
//		Object arr[][] = new Object[2][2];
//		
//		arr[0][0]="Email_1";
//		arr[0][1]="chrome";
//		
//		arr[1][0]="Email_2";
//		arr[1][1]="chrome";
//		return arr;
//		
//		
//	}

	@DataProvider(parallel = true)
	public Object[][] sendData() {

		Object arr[][] = new Object[2][2];

		arr[0][0] = "Email_1";
		arr[0][1] = "chrome";

		arr[1][0] = "Email_2";
		arr[1][1] = "chrome";
		return arr;

	}
//	@Test(dataProvider="sendData")
//	public void login(String userName, String browserName) {
//		
//		DesiredCapabilities cap=null;
//		if(browserName.equalsIgnoreCase("chrome")) {
//			cap = DesiredCapabilities.chrome();
//			cap.setBrowserName("chrome");
//			cap.setPlatform(Platform.ANY);
//			
//			RemoteWebDriver driver=new RemoteWebDriver(new URL("httpss://localhost:444/wd/hub"),cap);
//			driver.get("https://www.facebook.com/");
//			driver.findElement(By.id("email")).sendKeys(userName);
//			
//			
//		}
//	}
	@Test(dataProvider="sendData")
	public void login(String userName, String browserName) {
	    DesiredCapabilities cap = null;
	    if (browserName.equalsIgnoreCase("chrome")) {
	        cap = DesiredCapabilities.chrome();
	        cap.setBrowserName("chrome");
	        cap.setPlatform(Platform.ANY);

	        try {
	            RemoteWebDriver driver = new RemoteWebDriver(new URL("https://localhost:444/wd/hub"), cap);
	            driver.get("https://www.facebook.com/");
	            driver.findElement(By.id("email")).sendKeys(userName);
	            // Add any other actions here
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	    }
	}


}
