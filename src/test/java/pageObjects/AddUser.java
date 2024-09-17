package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser extends BasePage {
	
	WebDriver driver;

	public AddUser(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='oxd-form-row']/div/div[1]/div/div[2]") WebElement dropdown_userRole;
	@FindBy(xpath="//div[@role='listbox']//div[2]") WebElement dropdown_SelectUR;
	@FindBy(xpath="//div[@class='oxd-form-row']/div/div[2]/div/div[2]//input") WebElement txt_employeeName;
	@FindBy(xpath="//div[@class='oxd-form-row']/div/div[3]/div/div[2]") WebElement dropdown_status;
	@FindBy(xpath="//div[@role='listbox']//div[2]") WebElement dropdown_SelectStatus;
	@FindBy(xpath="//div[@class='oxd-form-row']/div/div[4]/div/div[2]//input") WebElement txt_username;
	@FindBy(xpath="//form[@class='oxd-form']/div[2]/div/div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input") WebElement txt_password;
	@FindBy(xpath="//form[@class='oxd-form']/div[2]/div/div[@class='oxd-grid-item oxd-grid-item--gutters']//input") WebElement txt_cnfmPassword;
	@FindBy(xpath="//button[@type='submit']") WebElement btn_submit;
	
	
	public void userRole() {
		dropdown_userRole.click();
	}
	public void selectUR() {
		dropdown_SelectUR.click();
	}
	
	public void employeeName(String en) {
		txt_employeeName.sendKeys(en);
	}

	public void status() {
		dropdown_status.click();
	}
	public void selectStatus() {
		dropdown_SelectStatus.click();
	}
	public void userName(String user) {
		txt_username.sendKeys(user);
	}
	
	public void password(String passw) {
		txt_password.sendKeys(passw);
	}
	
	public void cnfm_password(String cpassw) {
		txt_cnfmPassword.sendKeys(cpassw);
	}
	public void Click_submit() {
		btn_submit.click();
	}
}
