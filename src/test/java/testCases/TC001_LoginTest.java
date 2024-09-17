package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass{
	
	@Test
	void LoginTest()  throws IOException{
		
	try {	
		LoginPage lp = new LoginPage(driver);
		
		String user=p.getProperty("username");
		String password=p.getProperty("password");
		lp.username(user);
		lp.password(password);
		lp.click_login();
		
		HomePage hp = new HomePage(driver);
		
		if(hp.title().equalsIgnoreCase("Dashboard")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);;
		}
	}
	catch(Exception e) {
		Assert.fail();
	}
		
	}

}
