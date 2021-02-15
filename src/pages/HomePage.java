package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver; 
WebElement signInButton;
WebElement contacUsButton; 
WebElement cartButton;
public WebElement getSignInButton() {
	return this.driver.findElement(By.className("login"));
}
public WebElement getContacUsButton() {
	return this.driver.findElement(By.id("contact-link"));
}
public WebElement getCartButton() {
	return this.driver.findElement(By.className("ajax_cart_no_product"));
} 
public HomePage(WebDriver driver) {
	this.driver = driver;
}
public void clickSignInButton() {
	this.getSignInButton().click();
}
public void contactUsClick() {
	this.getContacUsButton().click();
}
public void cartButtonClick() {
	this.getCartButton().click();
}
}
