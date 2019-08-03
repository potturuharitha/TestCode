package com.crm.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TetsBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utill.TestUtil;

public class HomePageTest extends TetsBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
		
	public HomePageTest()
	{
		super();
	}

	@BeforeMethod
	public void SetUp()
	{
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitleTest = homePage.verifyHomePageTitle();
						
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
