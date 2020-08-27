package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_05_CreateLeadPage extends BaseClass
{
	//Constructor
	public P_05_CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//TC_CreateLead
	public P_05_CreateLeadPage enterCompanyName(String cName) 
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	
	public P_05_CreateLeadPage enterFirstName(String fName) 
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	public P_05_CreateLeadPage enterLastName(String lName) 
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public P_05_CreateLeadPage clearCountryCode()
	{
		driver.findElementByXPath("//input[@id = 'createLeadForm_primaryPhoneCountryCode']").clear();
		return this;
	}
	
	public P_05_CreateLeadPage enterCountryCode(String cCode)
	{
		driver.findElementByXPath("//input[@id = 'createLeadForm_primaryPhoneCountryCode']").sendKeys(cCode);
		return this;
	}
	
	public P_05_CreateLeadPage enterPhoneNumber(String pNumber)
	{
		driver.findElementByXPath("//input[@id = 'createLeadForm_primaryPhoneNumber']").sendKeys(pNumber);
		return this;
	}
	
	public P_05_CreateLeadPage enterEmailId(String eMail) 
	{
		driver.findElementByXPath("//input[@id = 'createLeadForm_primaryEmail']").sendKeys(eMail);
		return this;
	}
	
	public P_06_ViewLeadPage clickOnCreateLeadButton()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new P_06_ViewLeadPage(driver);
	}
	

}
