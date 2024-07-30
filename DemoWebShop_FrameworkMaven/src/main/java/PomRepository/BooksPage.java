package PomRepository;

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class BooksPage {
	    @FindBy(id="products-orderby")
		 private WebElement sortByDropdown;
	     
	     @FindBy(id="products-pagesize")
		 private WebElement displayDropdown;
	     
	     @FindBy(xpath = "//h2[@class='product-title']")
		 private List<WebElement> BooksNamesLink;
	     
	     @FindBy(xpath = "//h2[@class='product-title']/a[text()='Fiction EX']")
	     private WebElement fictionEX;

		public BooksPage(WebDriver driver)
	     {
	  	   PageFactory.initElements(driver, this);
	     }

		public WebElement getSortByDropdown() {
			return sortByDropdown;
		}

		public WebElement getDisplayDropdown() {
			return displayDropdown;
		}

		public List<WebElement> getBooksNamesLink() {
			return BooksNamesLink;
		}

		public WebElement getFictionEX() {
			return fictionEX;
		}
	}




