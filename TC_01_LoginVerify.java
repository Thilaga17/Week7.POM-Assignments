package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.P_01_LoginPage;

public class TC_01_LoginVerify extends BaseClass
{
	
		@Test
		public void runLoginVerify() 
		{
			P_01_LoginPage lp = new P_01_LoginPage(driver);
			
			lp.enterUsername()
			.enterPassWord()
			.clickOnLoginButton()
			.verifyHomePage();
		}

	
}
