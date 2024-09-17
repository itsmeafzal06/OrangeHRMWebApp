package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.AddUser;
import pageObjects.AdminPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_Admin_addUser extends BaseClass{
	@Test
	void addUserTest() throws InterruptedException {
		logger.info("*** Test Starts TC002_Admin_addUser *****");
		LoginPage lp = new LoginPage(driver);
		
		logger.info("*** Entering login valid credientials *****");
		String user=p.getProperty("username");
		String password=p.getProperty("password");
		lp.username(user);
		lp.password(password);
		lp.click_login();
		
		HomePage hp = new HomePage(driver);
		
		logger.info("*** clicking on Admin button *****");
		
		hp.Admin();
		
		AdminPage ap = new AdminPage(driver);
		
		logger.info("*** clicking on ADD button *****");
		
		ap.add();
		
		AddUser au = new AddUser(driver);
		
		logger.info("*** Entering user info *****");
		
		au.userRole();
		Thread.sleep(2000);
		au.selectUR();
		au.employeeName(p.getProperty("name"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ARROW_DOWN).keyUp(Keys.ENTER).perform();
		au.status();
		Thread.sleep(2000);
		au.selectStatus();
		
		String pw=randomAlfaNum()+"_";
		
		au.userName(randomString()+"@gmail.com");
		Thread.sleep(2000);
		au.password(pw);
		Thread.sleep(2000);
		au.cnfm_password(pw);
		Thread.sleep(2000);
		
		logger.info("*** clicking on Submit button *****");
		au.Click_submit();
		
		
		logger.info("*** Test End TC002_Admin_addUser *****");
	}
}
