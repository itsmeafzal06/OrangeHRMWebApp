package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage{

	WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[@class='orangehrm-header-container']/button") WebElement btn_Add;
	
	public void add() {
		btn_Add.click();
	}
}
