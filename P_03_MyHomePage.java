package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_03_MyHomePage extends BaseClass 
{
	//Constructor
	public P_03_MyHomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//TC_LoginLogout
	public P_03_MyHomePage verifyMyHomePage()
	{
		String title = driver.getTitle();
		if(title.contains("My Home"))
		{
			System.out.println("Title is " + title );
		}
		else
		{
			System.out.println("Wrong Title");
		}
		return this;
	}
	
	//Common for all Testcases
	public P_04_MyLeadspage clickOnLeads() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElementByLinkText("Leads").click();
		return new P_04_MyLeadspage(driver);
	}

}
