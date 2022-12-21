package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterThree_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebButton;
import web_Common_Functions.WebDropDown;
import web_Common_Functions.WebTextBox;

public class RegisterThree_Page_Action {

	WebDriver driver  = null;
	RegisterThree_Page_Locator regThreePL = null;
	ExtentTest logger = null;
	
	public RegisterThree_Page_Action(WebDriver driver, ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		regThreePL = new RegisterThree_Page_Locator(driver, logger);
	}
	
	public boolean verifyTitle(String expectedTitle)
	{
		return WebBrowser.verifyTitle(driver, expectedTitle, expectedTitle, logger);
		
	}
	public void enterAddress(String address){
		WebTextBox.sendInput(regThreePL.getAddress(), address, "Address", logger);
	}
	
	public void enterCity(String city){
		WebTextBox.sendInput(regThreePL.getCity(), city, "City", logger);
	}
	
	public void enterPinCode(String pinCode){
		WebTextBox.sendInput(regThreePL.getPinCode(), pinCode,"Pin Code", logger);
	}
	
	public void enterState(String state){
		WebTextBox.sendInput(regThreePL.getState(), state, "State", logger);
	}
	
	public void enterCountry(String country){
		WebDropDown.selectDropDownByVal(regThreePL.getCountry(), country, "Country", logger);
	}
	
	public void clickOnNextBtn(){
		WebButton.click(regThreePL.getNextButton(), "Next Button", logger);
	}
	
	
		public RegisterFour_Page_Action enterPageThreeDetails(String addres, String  city, String pinCode,String state, String country){
			RegisterFour_Page_Action regFourPA = null;
			try {
			enterAddress(addres);
			enterCity(city);
			enterPinCode(pinCode);
			enterState(state);
			enterCountry(country);
			clickOnNextBtn();
			regFourPA = new RegisterFour_Page_Action(driver, logger);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return regFourPA;
	}
}
