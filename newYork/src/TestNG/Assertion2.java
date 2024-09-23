package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testCase2() {
		String actualText = "ab";
		String expText = "ab";

		int a = 10;
		int b = 20;

		// equal assertion
		// equal assertion
		Assert.assertEquals(actualText, expText, "Actual and Expected are nott matching");
		System.out.println("Equal assertion pass");

		// False assertion
		Assert.assertEquals(a > b, "a is greater than b");
		System.out.println("Equal assertion verified");

		// true assertion
		Assert.assertTrue(a > b, "a is lesser than b");
		// Assertion failed,Execution will stop here
		// Further line of code will not execute
		System.out.println("True assertion verified");
	}

	@Test
	public void testCase3() {
		// assertion is written in testCse2() method
		// hence the scope of assertion will be limited to testCase2() method only
		System.out.println("Hello Testcase3() method");
	}

}
