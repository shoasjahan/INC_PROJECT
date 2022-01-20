package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utiliti.Perent_Base;

public class ProfilePageLocator extends Perent_Base {
	
	
public ProfilePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(how=How.XPATH, using="//span[text()='MOHAMMAD']")
public WebElement ProfilePage;

}
