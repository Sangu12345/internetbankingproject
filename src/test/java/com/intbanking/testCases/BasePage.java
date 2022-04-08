package com.intbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
	public String baseURL="https://demo.guru99.com/V4/";
	public String username="mngr389376";
	public String password="nAtEdYj";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void Setup() 
	{
		System.setProperty("", "C:\\Users\\HAMJE SANGAMESH\\Desktop\\Software Testing pr\\intnetbanking_prcatice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	
	public void TearDown()
	{
		driver.quit();
	}
}
