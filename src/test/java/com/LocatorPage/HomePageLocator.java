package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utiliti.Perent_Base;

public class HomePageLocator extends Perent_Base{
	
public HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}

@FindBy(how=How.XPATH, using=" //a[text()=' Sign In ']")
public WebElement SinginButton;
@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
public WebElement SigninLink;

@FindBy(how=How.ID, using="mh-search-input")
public WebElement SearchField;

@FindBy(how=How.XPATH, using="//button[@class='mh-search-btn mh-search-submit']")
public WebElement SearchButton;

@FindBy(how=How.XPATH, using="//h2[text()='PERFECTION WITHIN REACH']")
public WebElement Promotion;
@FindBy(how=How.CSS, using="")
public WebElement exple;



}
