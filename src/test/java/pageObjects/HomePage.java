package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']") WebElement txt_title;
	@FindBy(xpath="//div[@class='oxd-sidepanel-body']//ul/li[1]") WebElement btn_Admin;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") WebElement dropdown_userPrfile;
	@FindBy(xpath="//a[.='Logout']") WebElement dropdown_logout;
	public String title() {
		String Title=txt_title.getText();
		return Title;
	}
	
	public void Admin() {
		btn_Admin.click();
	}
	
	public void profile() {
		dropdown_userPrfile.click();
	}
	
	public void logoutDropDownOpt4() {
		dropdown_logout.click();
	}
	

}
