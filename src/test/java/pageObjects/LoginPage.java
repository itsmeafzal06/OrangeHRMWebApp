package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement txt_username;
	@FindBy(xpath="//input[@type='password']") WebElement txt_password;
	@FindBy(xpath="//button[@type='submit']") WebElement btn_login;
	
	public void username(String UN) {
		txt_username.sendKeys(UN);
	}
	
	public void password(String pw) {
		txt_password.sendKeys(pw);
	}
	
	public void click_login() {
		btn_login.click();
	}
	

}
