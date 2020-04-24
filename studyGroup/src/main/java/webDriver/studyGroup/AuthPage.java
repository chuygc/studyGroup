package webDriver.studyGroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends BasePAge{
	@FindBy(id="email_create")
	WebElement emailTxtBox;
	
	@FindBy(id="SubmitCreate")
	WebElement createaccountbtn;
		
	public AuthPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public AuthPage setEmail(String email) {
		super.waitUntilClickable(emailTxtBox);
		emailTxtBox.sendKeys(email);
		return this;
	}
	
	public AuthPage clickCreateAccount() {
		createaccountbtn.click();

		return this;
	}
	

}
