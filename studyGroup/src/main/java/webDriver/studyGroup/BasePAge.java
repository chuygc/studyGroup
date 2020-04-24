package webDriver.studyGroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePAge {
	public WebDriver driver;
	public WebDriverWait wait;

	public  BasePAge(WebDriver driver)	{
		 this.driver = driver;
		 wait = new WebDriverWait(driver, 15);
	}
	
	public void navigateMyStore() {
		driver.get("http://automationpractice.com/index.php");
	}
	
	public void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
