package PomRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	@FindBy(xpath="//a[text()='Fiction EX']")
	private WebElement FictionExProduct;
	
	@FindBy(xpath = "//td[@class='remove-from-cart']/input")
	private List<WebElement>allRemoveCheckBox;
	
	@FindBy(xpath="//input[@value='Update wishlist']")
	private WebElement updateProductButton;
	
	
	public  WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getFictionExProduct() {
		return FictionExProduct;
	}
	


	public WebElement getUpdateProductButton() {
		return updateProductButton;
	}


	public List<WebElement> getAllRemoveCheckBox() {
		return allRemoveCheckBox;
	}
	
	

}
