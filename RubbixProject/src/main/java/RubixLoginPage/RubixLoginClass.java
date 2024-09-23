package RubixLoginPage;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RubixLoginClass {
	
	 public static WebDriver driver;
	
//	public RubixLoginClass(WebDriver driver) {
//        this.driver = driver; // Initialize driver through the constructor
//    }
	
	public void desiredPlatFormURL() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.com/");
		
	}
	
	public void lauchApplication() throws Exception {
		System.out.println("lauchApplication()");
	}
	
	public void applicationOpened() throws Exception {
	 Thread.sleep(2000);
	 driver.get("https://rubixe.com");
		System.out.println("open successfully on the respective platform");
	}
     
	public void applicationIsLaunched() throws Exception {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@href='https://rubixe.com/']"));
		System.out.println("applicationIsLaunched()");
		
	}
	
	public void theUserClicksOnAModules()  {
		List<WebElement> ele=driver.findElements(By.xpath("//li[contains(@class,'dropdown')]"));
		System.out.println("Total webelement : " + ele.size());
		
		String result="Blog";
		for(int i=0;i<ele.size();i++) {
			if(ele.get(i).getText().equalsIgnoreCase(result)) {
				System.out.println("blog");
				ele.get(i).click();
				System.out.println(result+"Clicked");
				
			}
		}
		
		}
	
	public void contentNames() {
		System.out.println("contest showed");
	}
	

}
