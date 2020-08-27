package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_04_MyLeadspage extends BaseClass 
{
	//Constructor
	public P_04_MyLeadspage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//TC_CreateLead
	public P_05_CreateLeadPage clickOnCreateLeadsLink() 
	{
		driver.findElementByLinkText("Create Lead").click();
		return new P_05_CreateLeadPage(driver);
	}
	
	//TC_EditLead, TC_DuplicateLead, TC_DeleteLead
	public P_07_FindLeadsPage clickOnFindLeadsLink() throws InterruptedException
	{
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
		Thread.sleep(2000);
		return new P_07_FindLeadsPage(driver);
	}
	
	//TC_MergeLeads
	public P_10_MergeLeadsPage clickOnMergeLeads()
	{
		driver.findElementByXPath("//a[text() = 'Merge Leads']").click();
		return new P_10_MergeLeadsPage(driver);
	}
	
	

}
