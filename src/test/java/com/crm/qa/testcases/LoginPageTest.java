package com.crm.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	public LandingPage landingPage;
	public LoginPage logingPage;
	Logger log = Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		log.info("************************ Initialization Process Completed ************************");
		landingPage = new LandingPage();		
	}
	
	
	@Test(priority = 1)
	public void loginPageTitleTest(){
		String title = landingPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud");
	}
	
	@Test(priority = 2)
	public void crmLogoTest(){
		
		boolean isLogoDisplayed = landingPage.validateCRMImage();
		Assert.assertTrue(isLogoDisplayed);
	}
	
	@Test(priority = 3)
	public void loginPageTest(){
		logingPage = landingPage.clickLogin();
		
	}
	
	@AfterMethod
	public void tearDown(){
		log.warn("************************ Hey this is just warning before closing ************************");
		log.fatal("************************ Hey this is just a fatal message ************************");
		log.debug("************************ Hey this is just a dbug message ************************");
		log.info("************************ Closing the Browser ************************");
		driver.quit();
	}
	
	
	
}
