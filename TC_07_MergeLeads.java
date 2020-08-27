package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.P_01_LoginPage;

public class TC_07_MergeLeads extends BaseClass
{
	@BeforeTest
	public void setFile()
	{
		excelName = "MergeLeads";

	}
	@Test(dataProvider = "fetchdata")
	public void runMergeLead(String fromLeadId, String toLeadId) throws InterruptedException 
	{
		P_01_LoginPage lp = new P_01_LoginPage(driver);
		
		lp.enterUsername()
		.enterPassWord()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnLeads()
		.clickOnMergeLeads()
		.clickIconNearfromLead()
		.moveToNewWindow1()
		.enterFromLeadId(fromLeadId)
		.clickOnFindLeadsButton()
		.clickOnFirstResult()
		.switchBackToPWindow1()
		.clickIconNearToLead()
		.moveToNewWindow2()
		.enterToLeadId(toLeadId)
		.clickOnFindLeadsButton()
		.clickOnFirstResult1()
		.switchBackToPWindow2()
		.clickOnMergeLeadButton()
		.clickOnFindLeadsLink()
		.enterFromLeadId(fromLeadId)
		.clickOnFindLeadsButton()
		.verifyMessage();
		

	}
	
	
	
	
}
