package com.ActionPage;

import com.LocatorPage.LoginPageLocator;
import com.Utiliti.Perent_Base;

public class LoginPageAction extends Perent_Base{
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
	public void UserLogin(String u, String p) {
		loginPageLocator.Email.sendKeys(u);
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.LoginButton.click();
		
	}

}
