package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Employer_MenuOfResourcesPage extends TestBase{
	
	@FindBy(id = "psActiveOptiongroupSelect")
	WebElement label_SelectAnApplication;
	
	@FindBy(xpath = "//*[@id='psActiveOptiongroupSelect']//following::label")
	List<WebElement> options_SelectAnApplicatoin;

	@FindBy(id = "sel-emp-group-groupNumberInput__input")
	WebElement field_GroupNumber;
	
	@FindBy(xpath = "//button[contains(text(),'Let')]")
	WebElement button_LetsGO;
	
	public Employer_MenuOfResourcesPage(){
		PageFactory.initElements(driver, this);
	}
	public Employer_DashBoardPage selectAnApplication(String application, String groupNumber){
		label_SelectAnApplication.click();
		for(WebElement element:options_SelectAnApplicatoin){
			if(element.getText().equalsIgnoreCase(application))
				element.click();
		}
		
		field_GroupNumber.sendKeys(groupNumber);
		button_LetsGO.click();
		return new Employer_DashBoardPage();
	}
	
	/*public void selectAnApplication(String application){
		Select menuOfResources = new Select(options_SelectAnApplicatoin);
		menuOfResources.selectByVisibleText(application);
	}*/
	
}
