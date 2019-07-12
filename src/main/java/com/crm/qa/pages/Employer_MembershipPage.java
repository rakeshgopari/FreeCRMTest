package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Employer_MembershipPage extends TestBase{

	@FindBy(id = "en-name-id__input")
	WebElement field_SubscriberID;
	
	@FindBy(xpath = "//*[contains(text(),'Continue')]")
	WebElement button_Continue;
	
	public Employer_MembershipPage(){
		PageFactory.initElements(driver, this);
	}
	
	public Employer_EmployeeInformationPage click_Continue(){
		
		field_SubscriberID.sendKeys("458796958");
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		button_Continue.click();
		
		return new Employer_EmployeeInformationPage();
	}
}
