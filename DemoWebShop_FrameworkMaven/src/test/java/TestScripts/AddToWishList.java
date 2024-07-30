package TestScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import PomRepository.BooksPage;
import PomRepository.FictionFXProduct;
import PomRepository.HomePage;
import PomRepository.WishListPage;

public class AddToWishList extends BaseTest {
	
	@Test
	public void Verify_User_Is_Able_To_Add_Product_To_WishList() throws InterruptedException {
		
		//Navigate to books Page
		
				 home_page.getBooksLink().click();
				 //validation
				 Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
				 Reporter.log("Book Page should be displayed",true);
				 //Click on Fiction_Ex link And Navigate to FictionEx product page
				 BooksPage book_Page=new BooksPage(driver);
//				List<WebElement> allbooks = book_Page.getBooksNamesLink();
//				for (WebElement books : allbooks) {
//					
//					books.click();
//					Thread.sleep(2000);
//					
//				}
				 book_Page.getFictionEX().click();
				 //Capture Text From PDP Page
				 FictionFXProduct Pdp_Page=new FictionFXProduct(driver);
				 String productText = Pdp_Page.getFictionExText().getText();
				 //Navigate to wishlist page
				 Pdp_Page.getAddtoWishListButton().click();
				 //Capture text from wishlist page
				 WishListPage wishlist_page=new WishListPage(driver);
				 String wishlistText = wishlist_page.getFictionExProduct().getText();
				 //validation
				 if(productText.equals(wishlistText)) {
					 System.out.println("TestCase pass");
				 }else {
					 System.out.println("Rest case fail");
				 }	
	}
	

}
