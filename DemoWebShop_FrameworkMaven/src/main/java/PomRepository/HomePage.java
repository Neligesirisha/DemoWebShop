package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Register']")
    private WebElement RegisterLink;
    
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement LoginLInk;
    
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShoppingCart;
    
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement WishList;
    
	@FindBy(id="small-searchterms")
	private WebElement SearchTextField;
    
	@FindBy(xpath="//input[@value='Search']")
	private WebElement SearchButton;
    
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Books')]")
	private WebElement BooksLink;
    
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	private WebElement ComputersLink;
    
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
	private WebElement ElectronicsLink;
    
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Apparel & Shoes')]")
	private WebElement ApparelAndShoesLink;
    
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
	private WebElement DigitalDownLoadsLink;
    
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Jewelry')]")
	private WebElement JewelleryLink;
    
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]")
	private WebElement GiftCardsLink;
	
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement LogoutLink;
	
	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLInk() {
		return LoginLInk;
	}

	
	public WebElement getShoppingCart() {
		return ShoppingCart;
	}

	public WebElement getWishList() {
		return WishList;
	}

	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public   WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return ApparelAndShoesLink;
	}

	public WebElement getDigitalDownLoadsLink() {
		return DigitalDownLoadsLink;
	}

	public WebElement getJewelleryLink() {
		return JewelleryLink;
	}

	public WebElement getGiftCardsLink() {
		return GiftCardsLink;
	}
	
}
