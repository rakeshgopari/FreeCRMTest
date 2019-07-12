package com.crm.qa.testcases;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.RetryRule;

public class RetryRuleTest {

	static WebDriver driver;
	final private String URL = "https://employer-portal.sit1.va.anthem.com/eea/public/login";
	@BeforeClass
	public static void setupTest(){
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//set retry count argument
	@Rule
	public RetryRule retryRule = new RetryRule(3);
	
	@Test
	public void getURLExpample(){
		//Go to  www.swtestacademy.com
		driver.get(URL);
		
		//Check title is correct
		//assertThat(driver.getTitle(),"");
		Assert.assertTrue(false);
		//Assert.assertThat(driver.getTitle(), is("WRONG TITLE"));
	}
	
}
