package testscript.search;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import PomRepository.DigitalDownloads;
import PomRepository.SearchStorePage;
import PomRepository.ShoppingCart;

public class SearchBlueJeansTestCase extends BaseTest {

		@Test
		public void Verify_User_is_Able_To_Add_The_Jeans_To_Cart() throws InterruptedException {

			// Search for Jeans
			home_page.getSearchTextField().sendKeys("blue jeans");
			home_page.getSearchButton().click();

			// validation
			Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Search");
			Reporter.log("Searched Jeans Page is displayed", true);

			SearchStorePage searchStore_page = new SearchStorePage();
			// validation
			Assert.assertEquals(true, searchStore_page.getBluejeans().isDisplayed());
			Reporter.log("Blue Jeans Product is displayed", true);

			DigitalDownloads digitalDownloads_page = new DigitalDownloads(driver);
			List<WebElement> cart = digitalDownloads_page.getAddtoCartDigitalButton();
			for (WebElement addtocart : cart) {
				addtocart.click();
			}
			// Navigate shopping cart
			home_page.getShoppingCart().click();
			// validation

			Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
			Reporter.log("Shopping Cart Page displayed", true);

			ShoppingCart shoppingcart_page = new ShoppingCart(driver);

			// changing the quantity
			shoppingcart_page.getQtyTextField().clear();
			Thread.sleep(3000);
			shoppingcart_page.getQtyTextField().sendKeys("5", Keys.ENTER);
			Thread.sleep(3000);

			// validation
			Assert.assertEquals(true, shoppingcart_page.getTotalQty().isDisplayed());
			Reporter.log("Qty added", true);

			// removing the product

			List<WebElement> allchk = shoppingcart_page.getRemoveFromCartCheckbox();
			for (WebElement allcheckbox : allchk) {
				allcheckbox.click();
			}

			shoppingcart_page.getUpdateShoppingCartButton().click();
			Reporter.log("verify_user_Is_Able_to_Add_Jeans_to_the_cart() is pass", true);

		}

	}



