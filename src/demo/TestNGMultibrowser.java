package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultibrowser {

	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeTest
	public void setup (String browsername) {
		System.out.print("Browser name is :"+browsername);
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\DriverMS\\chromedriver");
			driver=new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("MS Edge")) {
			System.setProperty("","C:\\DriverMS\\msedgedriver" );
		
		}
		
		
		
		}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.google.com/"); 
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
