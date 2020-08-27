package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_07_FindLeadsPage extends BaseClass
{
		
	//Constructor
	public P_07_FindLeadsPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//------------------------------------------------------------
	//FindLeadsButton & ClickOnFirstResultingLead(TC_EditLead,TC_DuplicateLead,TC_DeleteLead)
	public P_07_FindLeadsPage clickOnFindLeadsButton() throws InterruptedException
	{
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}
	public P_06_ViewLeadPage clickFirstResultingLead() throws InterruptedException 
	{
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();	
		Thread.sleep(3000);
		return new P_06_ViewLeadPage(driver);
	}
	//-------------------------------------------------------------
	
	//TC_EditLead
	public P_07_FindLeadsPage enterFirstName(String fName) 
	{
		driver.findElementByXPath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@type='text' and @name ='firstName']").sendKeys(fName);
		return this;
	}
	
	
	//TC_DuplicateLead
	public P_07_FindLeadsPage clickOnEmail() 
	{
		driver.findElementByXPath("//span[text() = 'Email']").click();
		return this;
	}
	public P_07_FindLeadsPage enterEmailId(String email)
	{
		driver.findElementByXPath("//input[@name= 'emailAddress']").sendKeys(email);
		return this;
	}
	
	//TC_DeleteLead
	public P_07_FindLeadsPage clickOnPhone()
	{
		driver.findElementByXPath("//ul[@class = 'x-tab-strip x-tab-strip-top']/li[2]").click();
		return this;
	}
	public P_07_FindLeadsPage clearCountryCode() 
	{
		driver.findElementByXPath("//input[@name = 'phoneCountryCode']").clear();
		return this;
	}
	public P_07_FindLeadsPage enterCountryCode(String cCode)
	{
		driver.findElementByXPath("//input[@name = 'phoneCountryCode']").sendKeys(cCode);
		return this;
	}
	public P_07_FindLeadsPage enterPhoneNumber(String pNumber)
	{
		driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys(pNumber);
		return this;
	}
	public P_07_FindLeadsPage captureIdOfFirstResultingLead()
	{
		LeadsId = driver.findElementByXPath("//div[@class = 'x-grid3-body']//a").getText();
		System.out.println("The Lead Id is - " + LeadsId);
		return this;
	}
	public P_07_FindLeadsPage enterCapturedId() 
	{
		driver.findElementByXPath("//input[@name ='id']").sendKeys(LeadsId);
		return this;
	}
	public P_07_FindLeadsPage verifyMessage()
	{
		String text = driver.findElementByXPath("//div[@class = 'x-paging-info']").getText();
		System.out.println(text);
		String ActualText = "No records to display";
		if(text.equals(ActualText))
		{
			System.out.println(LeadsId + " was deleted Successfully ");	
		}
		return this;   
	}
	
	//TC_MergeLeads
	public P_07_FindLeadsPage moveToNewWindow1() throws InterruptedException 
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		listHandle = new ArrayList<String>(allWindowHandles);
		String secondWindow = listHandle.get(1);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		return this;
	}
	public P_07_FindLeadsPage enterFromLeadId(String fLId) 
	{
		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input[@name = 'id']").sendKeys(fLId);
		return this;
	}
	public P_10_MergeLeadsPage clickOnFirstResult()
	{
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new P_10_MergeLeadsPage(driver);
	}
	
	public P_07_FindLeadsPage moveToNewWindow2() 
	{
		Set<String> allWindowHandles1 = driver.getWindowHandles();
		listHandle1 = new ArrayList<String>(allWindowHandles1);
		String childWindow = listHandle1.get(1);
		driver.switchTo().window(childWindow);
		return this;
	}
	public P_07_FindLeadsPage enterToLeadId(String tLId)
	{
		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input[@name = 'id']").sendKeys(tLId);
		return this;
	}
	public P_10_MergeLeadsPage clickOnFirstResult1()
	{
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new P_10_MergeLeadsPage(driver);
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	

