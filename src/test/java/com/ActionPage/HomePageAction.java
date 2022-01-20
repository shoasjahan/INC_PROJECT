package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.HomePageLocator;


import com.Utiliti.Perent_Base;
import com.Utiliti.TestData;
import com.Utiliti.Utility;

public class HomePageAction extends Perent_Base{
	
	
	HomePageLocator homePageLocator= new HomePageLocator();
	
	
	
	
	public void clicksignandclicksigninbutton() {
		homePageLocator.SigninLink.click();
		homePageLocator.SinginButton.click();
		
		
	}
	
	public void EnterXPSinsearchfield() {
		homePageLocator.SearchField.sendKeys(TestData.searchdata1);
		
	}
	public void clicksearch() {
		homePageLocator.SearchButton.click();
		
		
	}
	public void VerifyCyberMondaytextdisplayinhomepage() throws Exception {
		
		Thread.sleep(10000);
		boolean promotion =homePageLocator.Promotion.isDisplayed();
		Assert.assertTrue(promotion);
		Utility.takescreenshot(driver, "CyberMonday");
	}
	

}
