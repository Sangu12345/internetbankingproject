package com.intbanking.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.intbanking.pageObject.LoginPage;



public class Tc_LogTest_001 extends BasePage {
	
	
	@Test
	public void LoginTesxt()
	{
		driver.get("baseURL");
		LoginPage lp=new LoginPage(driver);
		lp.SetUserName(username);
		lp.SetPassword("password");
		lp.button();
		

	/*if(driver.getTitle().equals("Guru99 bank manger"))
	{
		assertTrue(true);
	}
	else
	{
		assertTrue(false);
	}*/

}
}
