package com.crm.qa.pages;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.testdata.EmployeeInformationTestData;

public class Employer_EmployeeInformationPage extends TestBase {

	@FindBy(id = "en-sub-fName__input")
	WebElement field_FirstName;
	@FindBy(id = "en-sub-mi__input")
	WebElement field_MiddleInitial;
	@FindBy(id = "en-sub-lname__input")
	WebElement field_LastName;
	@FindBy(id = "en-sub-add1__input")
	WebElement field_StreetAddress;
	@FindBy(id = "en-sub-add2__input")
	WebElement field_AddressLine2;
	@FindBy(id = "en-sub-zip__input")
	WebElement field_ZipCode;
	@FindBy(id = "en-sub-phone__input")
	WebElement field_PhoneNumber;
	@FindBy(id = "en-sub-email__input")
	WebElement field_EmailID;
	
	@FindBy(id = "psActiveOptiongen")
	WebElement label_Gender;
	@FindBy(xpath = "//*[contains(text(),'Gender')]//following::label")
	WebElement dropdown_GenderOptions;
	@FindBy(id = "en-sub-dob__input")
	WebElement field_DOB;
	@FindBy(id = "en-sub-ssn__input")
	WebElement field_SSN;
	
	@FindBy(id = "en-sub-signDate__input")
	WebElement field_DateApplicationSigned;
	@FindBy(id = "en-sub-hireDate__input")
	WebElement field_HireDate;
	
	@FindBy(id = "psActiveOptionenrReasonSelect")
	WebElement label_EnrollmentReason;
	@FindBy(xpath = "//*[contains(text(),'Enrollment Reason')]//following::label")
	WebElement dropdown_EnrollmentReasonOptions;
	@FindBy(id = "psActiveOptionprobTypeSelect")
	WebElement label_WaitingPeriod;
	@FindBy(xpath = "//*[contains(text(),'Waiting period')]//following::label")
	WebElement dropdown_WaitingPeriodOptions;
	
	@FindBy(id = "psActiveOptioncoverage_id")
	WebElement label_CoverageType;
	@FindBy(xpath = "//*[contains(text(),'Coverage Type')]//following::label")
	WebElement dropdown_CoverageTypeOptions;
	@FindBy(id = "psActiveOptionlifeClassSelect")
	WebElement label_LifeClass;
	@FindBy(xpath = "//*[contains(text(),'Life Class')]//following::label")
	WebElement dropdown_LifeClassOptions;
	
	@FindBy(xpath = "//*[contains(text(),'Continue')]")
	WebElement button_Continue;
	
	public Employer_EmployeeInformationPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter_EmployeeInformation(HashMap<String,String> hashMapValue){
		
		System.out.println("***************** First Name **************"+hashMapValue.get("firstName"));
		field_FirstName.sendKeys(hashMapValue.get("firstName"));
		field_LastName.sendKeys(hashMapValue.get("lastName"));
		
	}
}
