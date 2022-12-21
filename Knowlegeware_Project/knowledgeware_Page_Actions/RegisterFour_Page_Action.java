package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterFour_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebButton;

public class RegisterFour_Page_Action {

	WebDriver driver;
	RegisterFour_Page_Locator regFourPL = null;
	ExtentTest logger = null;
	
	public RegisterFour_Page_Action(WebDriver driver, ExtentTest logger ) 
	{
		this.driver = driver;
		this.logger =logger;
		regFourPL = new RegisterFour_Page_Locator(driver, logger);
	}
	
	public boolean verifyTitle(String expectedTitle)
	{
		return WebBrowser.verifyTitle(driver, expectedTitle, expectedTitle, logger);
		
	}

	
	public void clickOnNextBtn(){
		WebButton.click(regFourPL.getNextButton(), "Next Button", logger);
	}
	
	public void enterPageFourDetails(String hobby )
	{
				clickOnNextBtn();
	}
	
}
