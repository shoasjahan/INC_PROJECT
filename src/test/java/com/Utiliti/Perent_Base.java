package com.Utiliti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perent_Base {
	// IN PERENT/BASE CLASS- WE HAVE CONSTRUCTOR TO CUMINUCATE WITH CONFIG FILE-
	// FOR CONFIG WE USE PROPERTIES AND FILEINPUTSTREEM CLASS
	// WE HAVE BOWSER INIT METHOD 
	// WE METHOD FOR LUNCHING URL
	// ALSO WE IMPLEMENTED ABSTRUCTION 
	public static Properties propp;
	public static WebDriver driver;
	
	
	public Perent_Base() {
		
		propp = new Properties();
		
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\Config\\Config.properties");
			
			propp.load(fls);
		} catch (FileNotFoundException e) {
			System.out.println("Please chek");
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	public void brinit() {
		
		String Browsername = propp.getProperty("Browser1");
		
		if(Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");// Setting up browser
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout, TimeUnit.SECONDS); // This statement is applicable for whole application
			driver.manage().timeouts().implicitlyWait(TestData.implicitlyWait, TimeUnit.SECONDS);// This statement is applicable for whole application
			}
		else if(Browsername.equalsIgnoreCase("FF"));
		
		
	}
	
	public static void launchURL(String URL) {
		
		driver.get(propp.getProperty("URL1"));
		
		
	}
	
	

}
