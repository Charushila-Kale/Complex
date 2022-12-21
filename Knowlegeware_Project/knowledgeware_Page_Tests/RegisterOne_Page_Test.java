package knowledgeware_Page_Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import dataSource.PropertiesReader;
import initializer.BaseClass;
import initializer.Reporter;
import knowledgeware_Page_Actions.RegisterFour_Page_Action;
import knowledgeware_Page_Actions.RegisterOne_Page_Action;
import knowledgeware_Page_Actions.RegisterThree_Page_Action;
import knowledgeware_Page_Actions.RegisterTwo_Page_Action;

public class RegisterOne_Page_Test extends BaseClass{
	@Test
	public void pageOneTest() throws IOException{
		RegisterTwo_Page_Action regTwoPA;
		RegisterOne_Page_Action regOnePA = new RegisterOne_Page_Action(driver,reportLogger);
		
			regTwoPA = regOnePA.enterPageOneDetails(
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"username"),
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"password"), 
					PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"conpass"));
			
			Assert.assertEquals(regTwoPA.verifyTitle("Reg2"), true);
			reportLogger.log(LogStatus.PASS, reportLogger.addScreenCapture(Reporter.screenCapture(driver,"Login test")));
		
		
		
		RegisterThree_Page_Action regThreePA = regTwoPA.enterPageTwoDetails(
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"fname"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"lname"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"birthDay"),
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"birthMonth"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"birthYear"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"emailId"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"mobNo"));

		Assert.assertEquals(regThreePA.verifyTitle("Reg3"), true);
		
		reportLogger.log(LogStatus.PASS, reportLogger.addScreenCapture(Reporter.screenCapture(driver,"Registration Page Two")));
		
		RegisterFour_Page_Action regFourPA= regThreePA.enterPageThreeDetails(
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"address"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"city"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"pincode"), 
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"state"),
				PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"country"));

		 reportLogger.log(LogStatus.PASS, reportLogger.addScreenCapture(Reporter.screenCapture(driver,"Registration Page Three")));
		
		Assert.assertEquals(regFourPA.verifyTitle("Reg4"), true);
		regFourPA.enterPageFourDetails(PropertiesReader.getPropertyValue(KnowledgeWareStaticTestData.configPath,"hobbies"));
	}
}