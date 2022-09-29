package tests;


import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import pages.CheckoutInfo;
import pages.HomePage;
import pages.YourCart;
import pages.checkoutComplete;


public class AddToCartTest extends TestBase {
	HomePage homePage;
	YourCart yourCart;
	CheckoutInfo checkoutInfo;
	checkoutComplete checkoutComplete;
	SoftAssert softAssert = new SoftAssert();
	
	
	@Test (priority = 1)
	public void addToCard() {
		homePage = new HomePage(driver);
		homePage.addToCart();
		yourCart = new YourCart(driver);
		yourCart.checkout();
		checkoutInfo = new CheckoutInfo(driver);
		checkoutInfo.fillData();
	}
}
