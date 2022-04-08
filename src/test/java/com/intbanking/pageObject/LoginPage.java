package com.intbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
}
	@FindBy(name="uid")
	WebElement txtUseName;
	@FindBy(name="password")
	WebElement txtPassword;
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	public void SetUserName(String name)
	{
		txtUseName.sendKeys("mngr389376");
	}
	public void SetPassword(String password)
	{
		txtPassword.sendKeys("nAtEdYj");
	}
	public void button()
	{
		btnLogin.click();
	}
}
