package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_06_ViewLeadPage extends BaseClass
{
	//Constructor
	public P_06_ViewLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//TC_CreateLead
	public P_06_ViewLeadPage appearFirstName()
	{
		String fname = driver.findElementByXPath("//span[@id = 'viewLead_firstName_sp']").getText();
		System.out.println("Created New Lead, First Name of the lead is : " + fname);
		return this;
	}
	public P_06_ViewLeadPage getLeadID()
	{
		capturedId = driver.findElementByXPath("//span[@id = 'viewLead_companyName_sp']").getText();
		System.out.println("The lead Id is : " + capturedId);
		return this;
	}
	
	//TC_EditLead
	public P_08_EditLeadsPage clickOnEdit()
	{
		driver.findElementByXPath("//a[text() ='Edit']").click();
		return new P_08_EditLeadsPage(driver);
	}
	public P_06_ViewLeadPage checkNewCompanyNameAppears()
	{
		String NewCompanyName = driver.findElementByXPath("//span[@id = 'viewLead_companyName_sp']").getText();
		System.out.println("Company Name was changed to - " + NewCompanyName);
		return this;
	}

	//TC_DuplicateLead
	public P_06_ViewLeadPage captureNameOfFirstResult()
	{
		Name = driver.findElementByXPath("//span[@id = 'viewLead_firstName_sp']").getText();
		System.out.println("Name of the Lead is " + Name);
		return this;
	}
	public P_09_DuplicateLeadPage clickOnDuplicateLeadButton()
	{
		driver.findElementByXPath("//a[text() = 'Duplicate Lead']").click();
		return new P_09_DuplicateLeadPage(driver);
	}
	public P_06_ViewLeadPage confirmDuplicateLeadName()
	{
		String DuplicateName = driver.findElementByXPath("//span[@id ='viewLead_firstName_sp']").getText();
		System.out.println("The duplicate name of the lead is " + DuplicateName );
		
		if (Name.equals(DuplicateName))
		{
			System.out.println("Both Actual name and Duplicate Name of the lead is same");
		}
		return this;
	}
	
	//TC_DeleteLead
	public P_04_MyLeadspage clickOnDelete() 
	{
		driver.findElementByXPath("//a[text() = 'Delete']").click();
		return new P_04_MyLeadspage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
