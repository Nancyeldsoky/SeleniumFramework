package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCart extends BasePage {

	public YourCart(WebDriver driver) {
		super(driver);
	}
	
	By CheckOutBtn = By.id("checkout");

	public void checkout() {
		driver.findElement(CheckOutBtn).click();
	}
}
