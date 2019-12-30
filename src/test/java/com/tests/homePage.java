package com.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import pageObjects.LoginPageObjects;
import resources.base;

public class homePage extends base{

	@BeforeTest
	public void Initializedriver() throws IOException {
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password, String text){
		
		LandingPageObjects Landing=new LandingPageObjects(driver);
		Landing.getLogin().click();
		
		LoginPageObjects Login=new LoginPageObjects(driver);
		Login.getEmail().sendKeys(Username);
		Login.getPassword().sendKeys(Password);
		Login.getLogin().click();
		System.out.println(text);
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
	
	@DataProvider
	
	public Object[][] getData(){
		
		//Row stands for how many different types of data
		//Columns stands for how many values
		Object[][] data=new Object[2][3];
		
		data[0][0]="non_restricted_data@gmail.com";
		data[0][1]="1234567";
		data[0][2]="Non Restricted User";
		
		data[1][0]="restricted_data@gmail.com";
		data[1][1]="1234567";
		data[1][2]="Restricted User";
		
		return data;
		
	}
	
}
