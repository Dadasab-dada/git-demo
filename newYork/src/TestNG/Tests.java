package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {

	@Test
	public void a() {
		System.out.println("Hello");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("Hello b method");
	}
}
