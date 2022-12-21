package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import web_Common_Functions.WebElementWait;

public class RegisterThree_Page_Locator {

	public WebDriver driver = null;
	public ExtentTest logger = null;
	public RegisterThree_Page_Locator(WebDriver driver, ExtentTest logger){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//textarea[@name='Address']")
	private WebElement address;

	public WebElement getAddress(){
		if(WebElementWait.waitToElementClickable(driver, address, "Address", logger)!=null)
			return address;
		else
			return null;
	}
	
	@FindBy(xpath = "//input[@name ='City']")
	private WebElement city;

	public WebElement getCity(){
		if(WebElementWait.waitToElementClickable(driver, city, "City ", logger)!=null)
			return city;
		else
			return null;
	}
	
	@FindBy(xpath = "//input[@name ='Pin_Code']")
	private WebElement pinCode;

	public WebElement getPinCode(){
		if(WebElementWait.waitToElementClickable(driver, pinCode, "Pin Code", logger)!=null)
			return pinCode;
		else
			return null;
	}
	
	@FindBy(xpath = "//input[@name='State']")
	private WebElement state;

	public WebElement getState(){
		if(WebElementWait.waitToElementClickable(driver, state, "State ", logger)!=null)
			return state;
		else
			return null;
	}
	
	@FindBy(xpath = "//Select[@name='Country']")
	private WebElement country;

	public WebElement getCountry(){
		if(WebElementWait.waitToElementClickable(driver, country, "Country", logger)!=null)
			return country;
		else
			return null;
	}
	
	@FindBy(xpath = "//a[starts-with(text(),'NE')]")
	private WebElement nextBtn;

	public WebElement getNextButton() {
		if(WebElementWait.waitToElementClickable(driver, nextBtn, "Next Button", logger)!=null)
			return nextBtn;
		else
			return null;
	}
}
