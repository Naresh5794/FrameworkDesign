package com.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPageObjects;
import resources.base;

public class ValidateTitle extends base{

	@BeforeTest
	public void Initializedriver() throws IOException {
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
	}
    @Test	
	public void validateTitle(){
		LandingPageObjects Landing=new LandingPageObjects(driver);
		//compare the text from the browser with actual text
		Assert.assertEquals("FEATURED COURSES", Landing.getTitle().getText());
		System.out.println("Title is correct");
		
    }
    @AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
