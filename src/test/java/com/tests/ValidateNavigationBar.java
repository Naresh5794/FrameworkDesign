package com.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPageObjects;
import resources.base;

public class ValidateNavigationBar extends base {

	@BeforeTest
	public void Initializedriver() throws IOException {
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test	
	public void validateNavBar(){
		    
		LandingPageObjects Landing=new LandingPageObjects(driver);
		Assert.assertTrue(Landing.getNavBar().isDisplayed());
		System.out.println("Navigation bar is present");
    }
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
