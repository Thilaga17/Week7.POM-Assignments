package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.P_01_LoginPage;

public class TC_03_CreateLead extends BaseClass 
{
	@BeforeClass
	public void setFile()
	{
		excelName = "CreateLead";
	}
	
	@Test(dataProvider = "fetchdata")
	public void runCreateLeadTC(String companyName,String firstName,String lastName,String countryCode,String phoneNumber,String emailId) throws InterruptedException
	{
		P_01_LoginPage lp = new P_01_LoginPage(driver);
		
			lp.enterUsername()
			.enterPassWord()
			.clickOnLoginButton()
			.verifyHomePage()
			.clickOnCrmsfa()
			.clickOnLeads()
			.clickOnCreateLeadsLink()
			.enterCompanyName(companyName)
			.enterFirstName(firstName)
			.enterLastName(lastName)
			.clearCountryCode()
			.enterCountryCode(countryCode)
			.enterPhoneNumber(phoneNumber)
			.enterEmailId(emailId)
			.clickOnCreateLeadButton()
			.appearFirstName()
			.getLeadID();	
			
	}
}
