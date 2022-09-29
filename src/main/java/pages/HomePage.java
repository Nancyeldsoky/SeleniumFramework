package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	By AddToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
	By ShoppingCart = By.id("shopping_cart_container");
	
	public void addToCart() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCartBtn));
		driver.findElement(AddToCartBtn).click();
		driver.findElement(ShoppingCart).click();
		
	}

}
