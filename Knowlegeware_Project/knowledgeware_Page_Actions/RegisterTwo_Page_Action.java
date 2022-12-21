package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterTwo_Page_Locator;
import web_Common_Functions.WebBrowser;
import web_Common_Functions.WebButton;
import web_Common_Functions.WebDropDown;
import web_Common_Functions.WebRadioButton;
import web_Common_Functions.WebTextBox;

public class RegisterTwo_Page_Action {

// Global variable
	WebDriver driver  = null;
	RegisterTwo_Page_Locator regTwoPL = null;
	ExtentTest logger = null;
	public RegisterTwo_Page_Action(WebDriver driver, ExtentTest logger){
		this.driver = driver;
		this.logger=logger;
		regTwoPL = new RegisterTwo_Page_Locator(driver, logger);
	}
	
	public boolean verifyTitle(String expectedTitle)
	{
		return WebBrowser.verifyTitle(driver, expectedTitle, expectedTitle, logger);
		
	}
	public void enterFirstName(String firstName){
		WebTextBox.sendInput(regTwoPL.getFirstName(), firstName, "First Name", logger);
	}
	
	public void enterLastName(String lastName){
		WebTextBox.sendInput(regTwoPL.getLastName(), lastName, "Last Name", logger);
	}
	
	public void enterBirthDay(String birthDay){
		WebDropDown.selectDropDownByVal(regTwoPL.getBirthdayDay(), birthDay, "Birth Day", logger);
		
	}
	public void enterBirthMonth(String birthMonth){
		WebDropDown.selectDropDownByVal(regTwoPL.getBirthdayMonth(), birthMonth,"Birth Month", logger);
		
	}
	public void enterBirthYear(String birthYear){
		WebDropDown.selectDropDownByVal(regTwoPL.getBirthdayYear(), birthYear, "Birth Year", logger);
		
	}
	public void enterEmailId(String emailId){
		WebTextBox.sendInput(regTwoPL.getEmailId(), emailId, "Email ID", logger);
		
	}
	public void enterMobNo(String mobNo){
		WebTextBox.sendInput(regTwoPL.getMobNo(), mobNo, "Mobile No", logger);
	}
	
	public void selectGender(){
		WebRadioButton.clickRadioButton(regTwoPL.getGenderFemale(), "Radio Button", logger);
	}
	
	public void clickOnNextBtn(){
		WebButton.click(regTwoPL.getNextButton(), "Next Button", logger);
	}
	
	public RegisterThree_Page_Action enterPageTwoDetails(String firstName, String  lastName, String birthDay,String birthMonth,String birthYear, String emailId, String mobNo){
		RegisterThree_Page_Action regThreePA = null;
		try {
			enterFirstName(firstName);
			enterLastName(lastName);
			enterBirthDay(birthDay);
			enterBirthMonth(birthMonth);
			enterBirthYear(birthYear);
			enterEmailId(emailId);
			enterMobNo(mobNo);
			selectGender();
			clickOnNextBtn();
			regThreePA = new RegisterThree_Page_Action(driver, logger);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regThreePA;
		
	}
	
}
