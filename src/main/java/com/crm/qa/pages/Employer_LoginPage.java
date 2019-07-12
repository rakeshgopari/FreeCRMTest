package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Employer_LoginPage extends TestBase{

	// Page Factory or Object Repository
	
	@FindBy(id = "loginusername_txt_id__input")
	WebElement field_Username;
	
	@FindBy(id = "loginpassWord_pass_id__input")
	WebElement field_Password;
	
	@FindBy(id = "login_btn_id")
	WebElement button_Login;
	
	// Initialize the Page Objects
	public Employer_LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validate_Title(){
		
		return driver.getTitle();
	}
	
	public Employer_MenuOfResourcesPage validate_Login(){
		
		field_Username.sendKeys(prop.getProperty("employer_username"));
		field_Password.sendKeys(prop.getProperty("employer_password"));
		System.out.println("*********************************************************************");
		button_Login.click();
		
		return new Employer_MenuOfResourcesPage();
	}
}
