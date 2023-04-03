package com.testNGPackage;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGProgram {
	
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup() {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();                                                           
		driver.manage().window().maximize();
		driver.get("https://www.dcentmass.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    }
	@Test
	public void titleTest() {
		WebDriver driver = null;
		String title=driver.getTitle();
		System.out.println("The tile of the page is:  "+title);
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.close();
		
	}

}
