package myTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
	
	
	SoftAssert softAssert=new SoftAssert();
	
	
	@Test
	public void test1() {
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);
		
		System.out.println("enter username");
		System.out.println("Enter password");
		System.out.println("click on sign in button");
		
		Assert.assertEquals(true, true);
		System.out.println("validate home Page");
		
		softAssert.assertEquals(true, false, "home page title is missing");
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		softAssert.assertEquals(true, false, " not able to create a deal");
		
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		softAssert.assertEquals(true, false, "not able to create a contact");
		
		softAssert.assertAll();
		
		
		
	}
	
	@Test
	public void test2() {
		System.out.println("logout");
		softAssert.assertEquals(true, false);
		softAssert.assertAll();
	}
	
	@AfterClass
	public void tearDown() {

	}
	

}
