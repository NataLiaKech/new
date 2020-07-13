package myTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTestClass extends Base {
	@BeforeMethod
	public void setUp() {
		initialization();
			
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		
	}
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false, true);
		
	}

}
