package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.checkoutComplete;


public class OrderConfirmationValidation extends TestBase {
	checkoutComplete checkoutComplete;
	SoftAssert softAssert = new SoftAssert();
	
	@Test (priority = 1)
	public void urlCheck() {
		actualUrl="https://www.saucedemo.com/checkout-complete.html";
		expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	
	@Test (priority = 2)
	public void orderConfirmationMessage() {
		checkoutComplete = new checkoutComplete(driver);
		softAssert.assertEquals(checkoutComplete.getConfirmationMessage(),"THANK YOU FOR YOUR ORDER" );
		softAssert.assertAll();
	}

}
