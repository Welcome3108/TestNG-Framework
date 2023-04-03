package com.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletitleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		}
	
	@Test
	public void googletitletest(){
		String title=driver.getTitle();
		System.out.println("title");
		
		Assert.assertEquals(title, "Google");
		driver.quit();
	}
	
	@Test
	public void googlelogoTest() {
		boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assert
	   }
	
	 @AfterMethod
	 public void tearUp(){
	 driver.quit();
		
	}
	

}
