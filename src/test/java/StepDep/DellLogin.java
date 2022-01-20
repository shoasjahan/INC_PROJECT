package StepDep;

import com.ActionPage.HomePageAction;
import com.ActionPage.LoginPageAction;
import com.ActionPage.ProfilePageAction;
import com.ActionPage.SearchPageAction;
import com.Utiliti.Perent_Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DellLogin extends Perent_Base{
	HomePageAction homePageAction = new HomePageAction();
	
	ProfilePageAction profilePageAction = new ProfilePageAction();
	
	LoginPageAction loginPageAction = new LoginPageAction();
	
	SearchPageAction searchPageAction = new SearchPageAction();

	
	@Given("^Launch dell \"([^\"]*)\"$")
	public void launch_dell(String URL) throws Throwable {
		launchURL(URL);
	}
	@Then("^click sign and click signin button$")
	public void click_sign_and_click_signin_button() throws Throwable {
		homePageAction.clicksignandclicksigninbutton();
	}

	@Then("^Enter User and password and click login$")
	public void enter_User_and_password_and_click_login() throws Throwable {
		loginPageAction.UserLogin(propp.getProperty("UserNameJahan"),propp.getProperty("PassWordJahan") );
		
	}

	@Then("^Verify user login in profile$")
	public void verify_user_login_in_profile() throws Throwable {
		profilePageAction.Verifyuserlogininprofile();
	}
	@Then("^Enter XPS in search field$")
	public void enter_XPS_in_search_field() throws Throwable {
		homePageAction.EnterXPSinsearchfield(); 
	}

	@Then("^click search$")
	public void click_search() throws Throwable {
		homePageAction.clicksearch(); 
	}

	@Then("^Verify search results$")
	public void verify_search_results() throws Throwable {
		searchPageAction.Verifysearchresults();
	}


}
