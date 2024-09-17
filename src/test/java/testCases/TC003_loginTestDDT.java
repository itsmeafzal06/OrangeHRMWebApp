package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DDTUtility;

public class TC003_loginTestDDT extends BaseClass{
	@Test(dataProvider = "logindata", dataProviderClass = DDTUtility.class)
	void LoginTest(String username,String password,String exp,String actual) {
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(exp);
		logger.info("*** It is a Data Driven Testing using Excel File ****");
		logger.info("*** Test Start TC003_loginTestDDT****");
	try {	
		LoginPage lp = new LoginPage(driver);
		logger.info("*** Entering credientials from excel file ****");
		
		lp.username(username);
		lp.password(password);
		lp.click_login();
		
		logger.info("*** validating conditions  ****");
		HomePage hp = new HomePage(driver);
		if(exp.equalsIgnoreCase("valid")) {
			if(hp.title().equalsIgnoreCase("dashboard")) {
				hp.profile();
				Thread.sleep(5000);
				hp.logoutDropDownOpt4();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("invalid")) {
			if(hp.title().equalsIgnoreCase("dashboard")) {
				hp.profile();
				Thread.sleep(2000);
				hp.logoutDropDownOpt4();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		
	}catch(Exception e) {
		Assert.fail();
	}
	logger.info("*** Test Start TC003_loginTestDDT****");
	}
	
}
