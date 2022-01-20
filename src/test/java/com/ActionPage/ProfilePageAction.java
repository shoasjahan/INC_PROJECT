package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.ProfilePageLocator;
import com.Utiliti.Perent_Base;
import com.Utiliti.Utility;

public class ProfilePageAction extends Perent_Base{
	
	ProfilePageLocator profilePageLocator = new ProfilePageLocator();
	
	public void Verifyuserlogininprofile() {
		boolean profile = profilePageLocator.ProfilePage.isDisplayed();
		Assert.assertTrue(profile);
		Utility.takescreenshot(driver, "Profile Page");
		
	}
	
	

}
