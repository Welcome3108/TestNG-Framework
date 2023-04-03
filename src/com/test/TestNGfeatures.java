package com.test;

import org.testng.annotations.Test;

public class TestNGfeatures {
	
	
	@Test
    public void loginTest(){
    System.out.println("Login Test");
   
    }
    
    @Test(dependsOnMethods="loginTest")
    public void homeoageTest(){
    System.out.println("Home pAge Test");
    }
    
    
    @Test(dependsOnMethods="loginTest")
    public void Registerpage(){
    System.out.println("Registerpage Test");
    }
    
    @Test(dependsOnMethods="loginTest")
    public void Logout(){
    System.out.println("Logout Test");
    }
    
    
//    @Test
//    public void SearchPageTest() {
//    	System.out.println("Login Test");
//    }

}
