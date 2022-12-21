package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import knowledgeware_Page_Locators.RegisterOne_Page_Locator;
import web_Common_Functions.WebLink;
import web_Common_Functions.WebTextBox;

public class RegisterOne_Page_Action {
	WebDriver driver  = null;
	RegisterOne_Page_Locator regOnePL = null;
	ExtentTest logger = null;
	
	public RegisterOne_Page_Action(WebDriver driver, ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		regOnePL = new RegisterOne_Page_Locator(driver, logger);
	}
	
	public void enterUserName(String user){
		WebTextBox.sendInput(regOnePL.getUserName(), user, "User Name", logger);
	}
	
	public void enterPassword(String pass){
		WebTextBox.sendInput(regOnePL.getPassword(), pass, "Password", logger);
	}
	
	public void enterConfirmPassword(String confPass){
		WebTextBox.sendInput(regOnePL.getConfirmPassword(), confPass, "Confirm Password", logger);
	}
	
	public void clickOnLogin(){
		WebLink.click(regOnePL.getLoginLink(), "Login Button", logger);
	}
	public RegisterTwo_Page_Action enterPageOneDetails(String uName, String pass, String conPass){
		RegisterTwo_Page_Action regTwoPA = null;
		try {
			enterUserName(uName);
			enterPassword(pass);
			enterConfirmPassword(conPass);
			clickOnLogin();
			regTwoPA = new RegisterTwo_Page_Action(driver, logger);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regTwoPA;
	}
}