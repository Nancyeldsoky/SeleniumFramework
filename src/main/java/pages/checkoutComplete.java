package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutComplete extends BasePage{

	public checkoutComplete(WebDriver driver) {
		super(driver);
	}
	
	 By CompleteOrderMessage = By.xpath("//h2[@class='complete-header']");
	
	 public String getConfirmationMessage() {
		return driver.findElement(CompleteOrderMessage).getText();
	 }

}
