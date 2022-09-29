package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfo extends BasePage{

	public CheckoutInfo(WebDriver driver) {
		super(driver);
	}
	
	By FirstName = By.id("first-name");
	By LastName = By.id("last-name");
	By PostalCode = By.id("postal-code");
	By ContinueBtn = By.id("continue");
	By FinishBtn = By.id("finish");
	
	
	public void fillData() {
		driver.findElement(FirstName).sendKeys("Nancy");
		driver.findElement(LastName).sendKeys("Eldsoky");
		driver.findElement(PostalCode).sendKeys("11757");
		driver.findElement(ContinueBtn).click();
		driver.findElement(FinishBtn).click();
		
		
	}
	

}
