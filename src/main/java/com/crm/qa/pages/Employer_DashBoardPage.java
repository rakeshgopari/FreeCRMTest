package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Employer_DashBoardPage extends TestBase{

	
	@FindBy(xpath = "//*[contains(text(),'Online Enrollment Options')]//following::a[contains(text(),'Enroll an Employee')]")
	WebElement link_EnrollAnEmployee;
	
	public Employer_DashBoardPage(){
		PageFactory.initElements(driver, this);
	}
	
	public Employer_MembershipPage click_EnrollAnEmployee(){
		link_EnrollAnEmployee.click();
		return new Employer_MembershipPage();
	}
}
