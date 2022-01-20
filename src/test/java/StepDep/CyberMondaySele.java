package StepDep;

import com.ActionPage.HomePageAction;
import com.Utiliti.Perent_Base;

import cucumber.api.java.en.Then;




public class CyberMondaySele extends Perent_Base{
	HomePageAction homePageAction = new HomePageAction();
	
	@Then("^Verify CyberMonday text display in home page$")
	public void verify_CyberMonday_text_display_in_home_page() throws Throwable {
		homePageAction.VerifyCyberMondaytextdisplayinhomepage();
	}

}
