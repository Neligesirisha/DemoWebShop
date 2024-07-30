package Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import PomRepository.HomePage;
import PomRepository.LoginPage;


public class BaseTest {
	public	DataUtility data_Utility=new DataUtility();
	public WebDriver driver;
	public static WebDriver listenersDriver;
	public HomePage home_page;
	public SoftAssert sa;
	
	@BeforeClass(alwaysRun = true)
  public void launchTheBrowser() throws IOException {
		
		driver= new ChromeDriver();
		listenersDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromProperties("url"));
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void performLogin() throws IOException {
		
		home_page=new HomePage(driver);
		home_page.getLoginLInk().click();
		
		LoginPage login_page=new LoginPage(driver);
		login_page.getEmailTextfield().sendKeys(data_Utility.getDataFromProperties("email"));
		login_page.getPasswordTextField().sendKeys(data_Utility.getDataFromProperties("pwd"));
		login_page.getLoginButton().click();
	}
     @AfterMethod(alwaysRun = true)
	public void performLogout() {
		
		home_page.getLogoutLink().click();
	}
     @AfterClass(alwaysRun = true)
	public void closeTheBrowser() {
		driver.quit();
	}

}
