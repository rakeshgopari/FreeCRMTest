package com.crm.qa.testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.record.aggregates.DataValidityTable;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Employer_DashBoardPage;
import com.crm.qa.pages.Employer_EmployeeInformationPage;
import com.crm.qa.pages.Employer_LoginPage;
import com.crm.qa.pages.Employer_MembershipPage;
import com.crm.qa.pages.Employer_MenuOfResourcesPage;
import com.crm.qa.testdata.EmployeeInformationTestData;
import com.crm.qa.util.TestUtil;

public class Employer_LoginPageTest extends TestBase {

	public Employer_LoginPage  employer_LoginPage;
	public Employer_MenuOfResourcesPage employer_MenuOfResourcesPage ;
	public Employer_DashBoardPage employer_DashBoardPage;
	public Employer_MembershipPage employer_MembershipPage;
	public Employer_EmployeeInformationPage employer_EmployeeInformationPage ;
	
	String sheetName = "EmployeeInformation";
	
	public Employer_LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		employer_LoginPage = new Employer_LoginPage();
		
	}
	
	
	
	/*@Test(priority = 1)
	public void loginPageTitleTest(){
		String title = employer_LoginPage.validate_Title();
		Assert.assertEquals(title, "Employer Portal");
	}*/
	
	
	@DataProvider
	public Object[][] getCRMTestData(){
		//Object[][] data = TestUtil.getTestData(sheetName);
		//return data;
		//return TestUtil.getTestData(sheetName);
		
		
	    List<HashMap<String, String>> arrayMapList = new ArrayList<HashMap<String, String>>();
	    HashMap<String, String> hashMapItems = new HashMap<String, String>();

	    //use a loop to fill in all the parameter name and value pairs
	    hashMapItems.put("firstName", "rakesh");
	    hashMapItems.put("middleInitial", "g");
	    hashMapItems.put("lastName", "gopari");
	    hashMapItems.put("streetAddress", "addressone");
	    hashMapItems.put("addressLine2", "addresstwo");
	    hashMapItems.put("zipCode", "94105");
	    //--------------More put statements here------
	    //finally add hash map to the list
	    arrayMapList.add(hashMapItems);

	    //Iterate the array list and store each HashMap object in an object array. First dimension is the iterator value.
	    Object [][] hashMapObj = new Object [arrayMapList.size()][1];

	    for(int i=0; i<arrayMapList.size() ; i++) {
	        hashMapObj[i][0] = arrayMapList.get(i);
	    }

	    return hashMapObj;

	}
	
	@Test(priority = 1, dataProvider = "getCRMTestData", enabled = true)
	public void loginTest(HashMap<String,String> hashMapValue){
		System.out.println("***************** First Name **************"+hashMapValue.get("firstName"));  //parameter 1
	    System.out.println("***************** last Name ***************"+hashMapValue.get("lastName"));  //parameter 2
		employer_MenuOfResourcesPage = employer_LoginPage.validate_Login();
		employer_DashBoardPage = employer_MenuOfResourcesPage.selectAnApplication("CA EmployerAccess LG","EAT005");
		employer_MembershipPage = employer_DashBoardPage.click_EnrollAnEmployee();
		employer_EmployeeInformationPage = employer_MembershipPage.click_Continue();
		employer_EmployeeInformationPage.enter_EmployeeInformation(hashMapValue);
	}
	
	
	@AfterMethod
	public void tearDown(){
	//	driver.quit();
	}
}
