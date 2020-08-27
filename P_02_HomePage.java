package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_02_HomePage extends BaseClass
{
	//Constructor
	public P_02_HomePage(ChromeDriver driver)
	{
		this.driver = driver;

	}
	
	//Common for all TestCases
	public P_02_HomePage verifyHomePage()
	{
		String title = driver.getTitle();
		if(title.contains("Leaftaps"))
		{
			System.out.println("Title is " + title );
		}
		else
		{
			System.out.println("Wrong Title");
		}
		return this;
	}
	
	public P_03_MyHomePage clickOnCrmsfa()
	{
		driver.findElementByLinkText(prop.getProperty("HomePage.CRMSFAButton.LinkText")).click();
		return new P_03_MyHomePage(driver);
	}
	
	/*
	public LoginPage clickLogout()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage(driver);

	}
	*/


}
