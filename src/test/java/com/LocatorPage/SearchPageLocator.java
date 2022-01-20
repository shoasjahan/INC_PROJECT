package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utiliti.Perent_Base;

public class SearchPageLocator extends Perent_Base {
	
	
public SearchPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(how=How.XPATH, using="//*[contains(text(), 'Designed to be the best.')]")
public WebElement XPSSearchResult;
	
	

}
