package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {

	//Page Factory or Object Repository
	
	@FindBy(xpath = "//*[contains(text(),'Log In')]")
	WebElement button_Login;

	@FindBy(className = "mdi-chart-bar icon icon-md")
	WebElement button_SignUp;
	
	@FindBy(tagName = "image")
	WebElement logo_CRM;
	
	
	//Initialize the page Objects
	public LandingPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return logo_CRM.isDisplayed();
	}
	
	public LoginPage clickLogin(){
		button_Login.click();
		
		return new LoginPage();
	}
}
