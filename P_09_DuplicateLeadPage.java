package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_09_DuplicateLeadPage extends BaseClass
{
	//Constructor
	public P_09_DuplicateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//TC_DuplicateLead
	public P_06_ViewLeadPage clickOnCreateLead()
	{
		driver.findElementByXPath("//input[@value = 'Create Lead' and @name = 'submitButton']").click();
		return new P_06_ViewLeadPage(driver);

	}

}
