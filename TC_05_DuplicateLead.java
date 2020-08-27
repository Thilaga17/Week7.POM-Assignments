package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.P_01_LoginPage;

public class TC_05_DuplicateLead extends BaseClass
{
	@BeforeTest
	public void setFile()
	{
		excelName = "DuplicateLead";
	}
	
	@Test(dataProvider = "fetchdata")
	public void runDuplicateLead(String emailId) throws InterruptedException
	{
		P_01_LoginPage lp = new P_01_LoginPage(driver);
		lp.enterUsername()
		.enterPassWord()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnLeads()
		.clickOnFindLeadsLink()
		.clickOnEmail()
		.enterEmailId(emailId)
		.clickOnFindLeadsButton()
		.clickFirstResultingLead()
		.captureNameOfFirstResult()
		.clickOnDuplicateLeadButton()
		.clickOnCreateLead()
		.confirmDuplicateLeadName();
		

	}

}
