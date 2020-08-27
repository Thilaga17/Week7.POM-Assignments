package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.P_01_LoginPage;

public class TC_04_EditLead extends BaseClass
{
	
	@BeforeClass
	public void setFile()
	{
		excelName = "EditLead";
	}
	
	@Test(dataProvider = "fetchdata")
	public void runEditLeadTC(String fName,String cName) throws InterruptedException
	{
		P_01_LoginPage lp = new P_01_LoginPage(driver);
		
		lp.enterUsername()
		.enterPassWord()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnLeads()
		.clickOnFindLeadsLink()
		.enterFirstName(fName)
		.clickOnFindLeadsButton()
		.clickFirstResultingLead()
		.clickOnEdit()
		.clearCompanyName()
		.enterNewCompanyName(cName)
		.clickUpdate()
		.checkNewCompanyNameAppears();
	}
}
