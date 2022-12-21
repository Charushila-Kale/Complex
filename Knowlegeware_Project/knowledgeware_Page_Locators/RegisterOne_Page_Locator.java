package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import web_Common_Functions.WebElementWait;

public class RegisterOne_Page_Locator {
	WebDriver driver = null;
	public ExtentTest logger = null;
	public RegisterOne_Page_Locator(WebDriver driver,ExtentTest logger){
		this.driver = driver;
		this.logger =logger;
		PageFactory.initElements(driver, this);			//Mandatory to initialize page factory elements
	}
	
	//WebElement userName = driver.findElement(By.name("name"));
	@FindBy(name="name") 
	private WebElement userName;
	
	public WebElement getUserName(){
		if(WebElementWait.waitToElementClickable(driver, userName, "User name", logger)!=null)
			return userName;
		else
			return null;
	}
	
	@FindBy(name="password") 
	private WebElement password;
	
	public WebElement getPassword(){
		if(WebElementWait.waitToElementClickable(driver, password, "Password ", logger)!=null)
			return password;
		else
			return null;
	}
	
	@FindBy(xpath="//input[@name='confirmpassword']") 
	private WebElement confirmPassword;
	
	public WebElement getConfirmPassword(){
		if(WebElementWait.waitToElementClickable(driver, confirmPassword, "Confirm Password ", logger)!=null)
			return confirmPassword;
		else
			return null;
	}

	@FindBy(xpath = "//a[@href='reg.html']") 
	private WebElement loginLink;
	
	public WebElement getLoginLink(){
		if(WebElementWait.waitToElementClickable(driver, loginLink, "Login Link", logger)!=null)
			return loginLink;
		else
			return null;
	}
}
