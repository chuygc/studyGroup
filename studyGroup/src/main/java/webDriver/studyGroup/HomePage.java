package webDriver.studyGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePAge{
	@FindBy(className = "login")
	WebElement loginbtn;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public HomePage open() {
		navigateMyStore();
		return this;
	}
	
	
	public HomePage clickLogIn() {
		loginbtn.click();
		return this;
	}
}
