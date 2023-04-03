package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
//  Output:	
//	Setup system property for chrome
//	lauch the chrome browser
//	Login to App
//	Enter the URL
//	Google Title Test
//	Logout from the App
//	Close the Browser
//	delete all cookies
//	PASSED: googleTitleTest

	
	
	//Pre-Condition annotations  --Starting  with @Before 
	/*--------------------------------------------------*/	
	@BeforeSuite//1
	public void setup() {
		System.out.println("@BeforeSuite--->Setup system property for chrome");
	}
	
	@BeforeTest//2
	 public void launchbrowser(){
		 System.out.println("@BeforeTest---->lauch the chrome browser");
		 
	 }
	
	@BeforeClass//3
	 public void login() {
		 System.out.println("@BeforeClass--->Login to App");
	 }
	
	
	 @BeforeMethod//4
	 public void enterURL() {
		 System.out.println("@BeforeMethod--->Enter the URL");
	 }
	 
//	 Setup system property for chrome
//	 lauch the chrome browser
//	 Login to App
//	 Enter the URL--------->@BeforeMethod
//	 Google Title Test----->@Test-1
//	 Logout from the App--->@AfterMethod
//	 Enter the URL--------->@BeforeMethod
//	 Google Title---------->@Test-2
//	 Logout from the App--->@AfterMethod
//	 Close the Browser
//	 delete all cookies
//	 PASSED: googletitle
//	 PASSED: googleTitleTest
	
	 //Test Case--Starting with @Test
	 @Test//5
	 public void  googleTitleTest() {
		 System.out.println("@Test---->Google Title Test");
	 }
	 
	 @Test
	 public void googletitle() {
		 System.out.println("@Test----->Google Title");
	 }
	 
	 @Test
	 public void serchtext() {
		 System.out.println("@Test---->Search Text");
	 }
	 
	 //Post condition--Starting with @After
	 @AfterMethod//6
	 public void logout() {
		 System.out.println(" @AfterMethod---->Logout from the App");
		 
	 }
	 
	 @AfterClass//7
	 public void closeBrowser() {
		 System.out.println("@AfterClass---->Close the Browser");
	 }
	 
	 @AfterTest//8
	 public void deleteallcookies() {
		 System.out.println("@AfterTest----->delete all cookies");
	 }
	 
	 //Final Output:
//	 @BeforeSuite--->Setup system property for chrome
//	 @BeforeTest---->lauch the chrome browser
//	 @BeforeClass--->Login to App
	 
//	 @BeforeMethod--->Enter the URL
//	 @Test---->Google Title Test
//	 @AfterMethod---->Logout from the App
	 
//	 @BeforeMethod--->Enter the URL
//	 @Test----->Google Title
//	 @AfterMethod---->Logout from the App
	 
//	 @BeforeMethod--->Enter the URL
//	 @Test---->Search Text
//	 @AfterMethod---->Logout from the App
	 
//	 @AfterClass---->Close the Browser
//	 @AfterTest----->delete all cookies
//	 PASSED: googletitle
//	 PASSED: serchtext
//	 PASSED: googleTitleTest
	 	 
	 
}
