package myTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	
	public void failed () {
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File("\\AssertionsTestNG\\screenshot\\"+"failshot_"+ this.getClass().getName()+"_"+".jpg"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
