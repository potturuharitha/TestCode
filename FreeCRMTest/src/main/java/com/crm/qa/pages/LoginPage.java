package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TetsBase;

public class LoginPage extends TetsBase {

	//Page factory or Object Repository
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	
	//submit
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(linkText ="Sign Up")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//initializing the Page Objects:
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions:
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd)
	{
		//username.clear();
		username.sendKeys(un);
		//password.clear();
		password.sendKeys(pwd);
		//code to click
		Actions actions = new Actions(driver);
		actions.moveToElement(loginBtn).click().perform();
		
		//loginBtn.click();
		
		return new HomePage();
	}
	
	//
	
}
