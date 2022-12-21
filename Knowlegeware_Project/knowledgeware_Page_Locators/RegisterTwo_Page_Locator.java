package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import web_Common_Functions.WebElementWait;

public class RegisterTwo_Page_Locator {



////jjsjldjldjs


	public WebDriver driver = null;
	public ExtentTest logger = null;
	public RegisterTwo_Page_Locator(WebDriver driver, ExtentTest logger ){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "First_Name")
	private WebElement firstName;

	public WebElement getFirstName(){
		if(WebElementWait.waitToElementClickable(driver, firstName, "First Name ", logger)!=null)
			return firstName;
		else
			return null;
	}

	@FindBy(name = "Last_Name")
	private WebElement lastName;

	public WebElement getLastName(){
		if(WebElementWait.waitToElementClickable(driver, lastName, "Last Name", logger)!=null)
			return lastName;
		else
			return null;
	}

	@FindBy(name="Birthday_day")
	private WebElement birthdayDay;
	public WebElement getBirthdayDay() {
		if(WebElementWait.waitToElementClickable(driver, birthdayDay, "Birthday", logger)!=null)
			return birthdayDay;
		else
			return null;
	}

	@FindBy(name="Birthday_Month")
	private WebElement birthdayMonth;
	public WebElement getBirthdayMonth() {
		if(WebElementWait.waitToElementClickable(driver, birthdayMonth, "Birth Month", logger)!=null)
			return birthdayMonth;
		else
			return null;
	}

	@FindBy(name="Birthday_Year")
	private WebElement birthdayYear;
	public WebElement getBirthdayYear() {
		if(WebElementWait.waitToElementClickable(driver, birthdayYear, "Birth Year", logger)!=null)
			return birthdayYear;
		else
			return null;
	}

	@FindBy(name="Email_Id")
	private WebElement emailID;
	public WebElement getEmailId() {
		if(WebElementWait.waitToElementClickable(driver, emailID, "Email Id", logger)!=null)
			return emailID;
		else
			return null;
	}

	@FindBy(name="Mobile_Number")
	private WebElement mobNo;
	public WebElement getMobNo() {
		if(WebElementWait.waitToElementClickable(driver, mobNo, "Mobile Number", logger)!=null)
			return mobNo;
		else
			return null;
	}

	@FindBy(xpath="//input[@value='Female']")
	private WebElement genderFemale;
	public WebElement getGenderFemale() {
		if(WebElementWait.waitToElementClickable(driver, genderFemale, "Female Radio Button", logger)!=null)
			return genderFemale;
		else
			return null;
	}

	@FindBy(linkText="NEXT")
	private WebElement nextButton;
	public WebElement getNextButton() {
		if(WebElementWait.waitToElementClickable(driver, nextButton, "Next Button", logger)!=null)
			return nextButton;
		else
			return null;
	}
}
