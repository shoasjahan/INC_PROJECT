package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.SearchPageLocator;
import com.Utiliti.Perent_Base;
import com.Utiliti.Utility;

public class SearchPageAction extends Perent_Base{
	
	SearchPageLocator searchPageLocator = new SearchPageLocator();
	
	
	public void Verifysearchresults() {
		
		boolean xPSSearchResult =searchPageLocator.XPSSearchResult.isDisplayed();
		Assert.assertTrue(xPSSearchResult);
		Utility.takescreenshot(driver, "XPS search result");
	}

}
