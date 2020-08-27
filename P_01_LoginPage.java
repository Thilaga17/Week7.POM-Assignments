package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class P_01_LoginPage extends BaseClass
{
	//Constructor
	public P_01_LoginPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	//Common for all Testcases, Used Property files for locators(Username,Password,LoginButton)
	public P_01_LoginPage enterUsername()
	{
		WebElement eleUserName = driver.findElementById(prop.getProperty("LoginPage.Username.Id"));
		eleUserName.sendKeys("demosalesmanager");
		return this;
	}
	
	public P_01_LoginPage enterPassWord()
	{
		WebElement elePassWord = driver.findElementById(prop.getProperty("LoginPage.Password.Id"));
		elePassWord.sendKeys("crmsfa");
		return this;
	}
	
	public P_02_HomePage clickOnLoginButton()
	{
		driver.findElementByClassName(prop.getProperty("LoginPage.LoginButton.Classname")).click();
		return new P_02_HomePage(driver);
	}
}
