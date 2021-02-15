package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TshirtPage {
WebDriver driver; 
WebElement addToC; 
WebElement more; 
WebElement cartButton;
WebElement shirtImage; 
WebElement cross; 
public TshirtPage(WebDriver driver) {
	this.driver = driver;
}
public WebElement getCross() {
	return this.driver.findElement(By.className("cross"));
}
public WebElement getShirtImage() {
	return this.driver.findElement(By.xpath("//img[starts-with(@alt, 'Faded')]"));
}
 public WebElement getAddToC() {
	return this.driver.findElement(By.xpath("//*[text()='Add to cart']"));
}
public WebElement getMore() {
	return this.driver.findElement(By.xpath("//*[text()='More']"));
}
public WebElement getCartButton() {
	return this.driver.findElement(By.xpath("//*[text()='Cart']"));
} 
public void goToCart() {
	this.getCartButton().click();
}
public void closePopUp() {
	this.getCross().click();
}

}
