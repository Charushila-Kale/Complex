package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import web_Common_Functions.WebElementWait;

public class RegisterFour_Page_Locator {

	public WebDriver driver = null;
	public ExtentTest logger = null;
	public RegisterFour_Page_Locator(WebDriver driver,	ExtentTest logger ) {
		this.driver = driver;
		this.logger = logger;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='Hobby_Other']")
	private WebElement other;
	public WebElement getCheckBoxeOther() {
		
		if(WebElementWait.waitToElementClickable(driver, other, "Other Hobby", logger)!=null)
			return other;
		else
			return null;
	}
	
	@FindBy(xpath="/input[@name='Other_Hobby']")
	private WebElement extra;
	public WebElement getCheckBoxeExtra() {
		
		if(WebElementWait.waitToElementClickable(driver, extra, "Hobby Other", logger)!=null)
			return extra;
		else
			return null;
	}
	
	@FindBy(xpath="//input[@name='Hobby_Cooking']")
	private WebElement cooking;
	public WebElement getCheckBoxeCooking() {
		
		if(WebElementWait.waitToElementClickable(driver, other, "Cooking", logger)!=null)
			return cooking;
		else
			return null;
	}
		
	@FindBy(xpath="//a[starts-with(text(),'NE')]")
	private WebElement nextButton;
	public WebElement getNextButton() {
		
		if(WebElementWait.waitToElementClickable(driver, nextButton, "Next Button", logger)!=null)
			return nextButton;
		else
			return null;
	}

}
