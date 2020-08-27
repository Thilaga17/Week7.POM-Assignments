package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_08_EditLeadsPage extends BaseClass
{
	
	//Constructor
	public P_08_EditLeadsPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//TC_EditLead
	public P_08_EditLeadsPage clearCompanyName()
	{
		driver.findElementByXPath("//input[@id = 'updateLeadForm_companyName']").clear();
		return this;
	}
	public P_08_EditLeadsPage enterNewCompanyName(String cName)
	{
		driver.findElementByXPath("//input[@id = 'updateLeadForm_companyName']").sendKeys(cName);
		return this;
	}
	public P_06_ViewLeadPage clickUpdate() 
	{
		driver.findElementByXPath("//input[@name ='submitButton' and @value = 'Update']").click();
		return new P_06_ViewLeadPage(driver);
	}
}
