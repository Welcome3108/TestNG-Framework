package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
	
		Webdriver driver;
	
	@Test
	@Parameters({"url","username"})
	public void yahoologinTest(String url,String username) {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		
	}

}
