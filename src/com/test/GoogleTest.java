package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver_win32");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		
	}
	
	@Test(priority=1,groups="Title")
	public void googletitletest(){
		String title=driver.getTitle();
		System.out.println("title");
	}
	
	@Test(priority=2,groups="Logo")
	public void googlelogotest() {
		boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority=3,groups="LinkTest")
	public void linktest(){
	boolean b=driver.findElement(By.xpath("//a[@target='_top']")).isDisplayed();
;	}
	
	@Test(priority=4,groups="Test")
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=4,groups="Test")
	public void Test2() {
	System.out.println("Test 2");
    }
	
	@Test(priority=5,groups="Test")
	  public void Test3() {
		System.out.println("Test 3");
	}
	
	
	
	@AfterMethod
	public void tearUp(){
		driver.quit();
		
	}
	
	
	

}
