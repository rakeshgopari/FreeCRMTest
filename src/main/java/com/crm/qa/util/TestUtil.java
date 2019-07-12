package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.qa.testdata.EmployeeInformationTestData;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;
	
	public static String TESTDATA_SHEET_PATH = "C:/Users/AF44976/EclipseWorkspace/FreeCRMTest/src/main/java/com/crm/qa/testdata/EmployeeInformationExcellFile.xlsx";
	public static Workbook book;
	public static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public static Object[][] getTestData(String sheetName){
		
		FileInputStream file = null;
		//Object[][] data = null;
		try{
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}catch(FileNotFoundException exception){
			exception.printStackTrace();
		}
		
		try{
			book = WorkbookFactory.create(file);
		}catch(InvalidFormatException exception){
			exception.printStackTrace();
		} catch(IOException exception){
			exception.printStackTrace();
		}
		
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		/*System.out.println("************** Last Row Number ***********: "+sheet.getLastRowNum());
		System.out.println("************** Last Cell Number***********: "+ sheet.getRow(0).getLastCellNum());
		
		for(int i=0;i<sheet.getLastRowNum();i++){
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
				if(sheet.getRow(i+1).getCell(j) != null && !sheet.getRow(i+1).getCell(j).toString().trim().isEmpty()){
						data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				}else{
						data[i][j] = "";
				}
				System.out.println("************** Data value of row "+i+" and column "+j+" *********: "+data[i][j]);
			}
		}*/
		 //data[0][1] = new EmployeeInformationTestData("","","","","","","","","","","","","","","","","");
		//Object[][] data= new Object[][];
		data[0][1] = new EmployeeInformationTestData();
		
		((EmployeeInformationTestData) data[0][1]).setFirst_Name("rakesh");
		((EmployeeInformationTestData) data[0][1]).setMiddle_Name("g");
		((EmployeeInformationTestData) data[0][1]).setLast_Name("gopari");
		((EmployeeInformationTestData) data[0][1]).setStreet_Address("address one");
		((EmployeeInformationTestData) data[0][1]).setAddressLine2("Addressline 2");
		((EmployeeInformationTestData) data[0][1]).setZipCode("94105");
		((EmployeeInformationTestData) data[0][1]).setPhone_Number("");
		((EmployeeInformationTestData) data[0][1]).setEmail("");
		((EmployeeInformationTestData) data[0][1]).setGender("Male");
		((EmployeeInformationTestData) data[0][1]).setDob("01/01/1990");
		((EmployeeInformationTestData) data[0][1]).setSsn("254163987");
		((EmployeeInformationTestData) data[0][1]).setDateApplicationSigned("04/10/2019");
		((EmployeeInformationTestData) data[0][1]).setHireDate("04/10/2019");
		((EmployeeInformationTestData) data[0][1]).setEnrollmentReason("New Hire");
		((EmployeeInformationTestData) data[0][1]).setWaitingPeriod("Hire date(hire date)");
		((EmployeeInformationTestData) data[0][1]).setCoverageType("Active");
		((EmployeeInformationTestData) data[0][1]).setLifeClass("");
		
		//return new Object[][]{new EmployeeInformationTestData("","","","","","","","","","","","","","","","","")};
		 return data;
	}
}
