package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_10_MergeLeadsPage extends BaseClass
{
	public P_10_MergeLeadsPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public P_07_FindLeadsPage clickIconNearfromLead()
	{
		driver.findElementByXPath("(//a/img[@alt = 'Lookup'])[1]").click();
		return new P_07_FindLeadsPage(driver);
	}
	
	public P_10_MergeLeadsPage switchBackToPWindow1()
	{
		String firstWindow = listHandle.get(0);
		driver.switchTo().window(firstWindow);
		return this;
	}
		
	public P_07_FindLeadsPage clickIconNearToLead()
	{
		driver.findElementByXPath("(//a/img[@alt = 'Lookup'])[2]").click();
		return new P_07_FindLeadsPage(driver);
	}
	
	
	public P_10_MergeLeadsPage switchBackToPWindow2()
	{
		String parentWindow = listHandle1.get(0);
		driver.switchTo().window(parentWindow);
		return this;
	}
	
	public P_04_MyLeadspage clickOnMergeLeadButton()
	{
		driver.findElementByXPath("//a[text() = 'Merge']").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new P_04_MyLeadspage(driver);
	}
	
	
}
