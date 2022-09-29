package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;




public class TestBase {
	
	public static WebDriver driver;
	public static String actualUrl;
	public static String expectedUrl;
	
	@BeforeSuite
	public void startDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.navigate().to("https://www.saucedemo.com");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
    	WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
		
		actualUrl="https://www.saucedemo.com/inventory.html";
		expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
}
