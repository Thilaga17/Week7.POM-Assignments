package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.P_01_LoginPage;

public class TC_06_DeleteLead extends BaseClass
{
	@BeforeTest
	public void setFile()
	{
		excelName = "DeleteLead";

	}
	
	@Test(dataProvider = "fetchdata")
	public void runDeleteLead(String CountryCode, String PhoneNumber) throws InterruptedException
	{
		P_01_LoginPage lp = new P_01_LoginPage(driver);
		
		lp.enterUsername()
		.enterPassWord()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnLeads()
		.clickOnFindLeadsLink()
		.clickOnPhone()
		.clearCountryCode()
		.enterCountryCode(CountryCode)
		.enterPhoneNumber(PhoneNumber)
		.clickOnFindLeadsButton()
		.captureIdOfFirstResultingLead()
		.clickFirstResultingLead()
		.clickOnDelete()
		.clickOnFindLeadsLink()
		.enterCapturedId()
		.clickOnFindLeadsButton()
		.verifyMessage();
		
		
		
		
		
		
		

	}
}
