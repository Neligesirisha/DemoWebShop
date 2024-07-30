package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	 @FindBy(id="gender-female")
		private WebElement GenderRadioButton;
		
	    @FindBy(id="FirstName")
		private WebElement FirstNameTextField;
		
	    @FindBy(id="LastName")
		private WebElement LastNameTextField;
		
	    @FindBy(id="Email")
		private WebElement EmailTextField;
		
	    @FindBy(id="Password")
		private WebElement PasswordTextField;
		
	    @FindBy(id="ConfirmPassword")
		private WebElement ConfirmPassword;
	    
	    @FindBy(id="register-button")
	    private WebElement RegisterButton;
	    
	    
		

		public RegisterPage(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    }

		public WebElement getGenderRadioButton() {
			return GenderRadioButton;
		}

		public WebElement getFirstNameTextField() {
			return FirstNameTextField;
		}

		public WebElement getLastNameTextField() {
			return LastNameTextField;
		}

		public WebElement getEmailTextField() {
			return EmailTextField;
		}

		public WebElement getPasswordTextField() {
			return PasswordTextField;
		}

		public WebElement getConfirmPassword() {
			return ConfirmPassword;
		}
		 public WebElement getRegisterButton() {
				return RegisterButton;

}

}
