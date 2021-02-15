package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
WebDriver driver; 
WebElement shirtTextField;
WebElement quantityField;
WebElement deleteItem;
WebElement warning; 
WebElement accountBtn; 
WebElement plusButton;
WebElement priceField; 
String price = "$105.97";
public String getPrice() {
	return this.price;
}
public WebElement getPriceField() {
	return this.driver.findElement(By.xpath("//*[@id=\"total_product\"]"));
}
public WebElement getPlusButton() {
	return this.driver.findElement(By.className("icon-plus"));
}
public WebElement getAccountBtn() {
	return this.driver.findElement(By.className("account"));
}
public WebElement getWarning() {
	return this.driver.findElement(By.className("alert-warning"));
}
public WebElement getDeleteItem() {
	return this.driver.findElement(By.className("icon-trash"));
}
public WebElement getQuantityField() {
	return this.driver.findElement(By.xpath("//input[starts-with(@class,'cart_quantity')]"));
}
public WebElement getShirtTextField() {
	return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a"));
}
public ShoppingCartPage(WebDriver driver) { 
	this.driver = driver;
}
public void removeShirt() {
	this.getDeleteItem().click();
}
public void backToAccIg() {
	this.getAccountBtn().click();
}
public void setQuantityTo3() throws InterruptedException {
	this.getPlusButton().click();
	Thread.sleep(4000);
	this.getPlusButton().click();
	Thread.sleep(4000);
}
}
