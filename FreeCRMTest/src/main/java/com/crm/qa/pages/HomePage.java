package com.crm.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TetsBase;

public class HomePage extends TetsBase {

	@FindBy(xpath="//td[contains(text(),'User: Naveen AutomationLabs')]")
	WebElement userNameLabel;
	
	//Contacts
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newcontactlink;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	/*public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
		
	}
	
	public ContactsPage clickOnContactslink()
	{
		contactslink.click();
		return new ContactsPage();
	}*/
	
	public void clickOnContactPage()
	{
		Actions action = new Actions(driver);
		action.moveToElement(contactslink).build().perform();
		newcontactlink.click();
	}
	
}
