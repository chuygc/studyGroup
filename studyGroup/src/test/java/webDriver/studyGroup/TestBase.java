package webDriver.studyGroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	WebDriver driver;
	HomePage homepage;
	AuthPage authpage;
	
	@BeforeClass
	public void beforeClass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public void teardown() {
	//	if (driver != null) {
		//	driver.quit();
		//}
	}
	
	@BeforeMethod
	public void initPages() {
		homepage = new HomePage(driver);
		authpage = new AuthPage(driver);
	}


}
