package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utiliti.Perent_Base;

public class LoginPageLocator extends Perent_Base{
	
	
public LoginPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(how=How.ID, using="EmailAddress")
public WebElement Email;
@FindBy(how=How.ID, using="Password")
public WebElement Password;
@FindBy(how=How.ID, using="sign-in-button")
public WebElement LoginButton;

}
