package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistPage {
WebDriver driver; 
WebElement wishlistName;
WebElement saveWishlist; 
WebElement toYourAcc;
WebElement removeWishlist;
WebElement wishlistTextField;
WebElement logoutButton;
List <WebElement> counter = new ArrayList<>();
String wishlistStringCheck = "First Wishlist";
public List<WebElement> getCounter() {
	return this.driver.findElements(By.xpath("//tr[starts-with(@id, 'wishlist')]"));
}
public String getWishlistStringCheck() {
	return this.wishlistStringCheck;
}
public MyWishlistPage(WebDriver driver) {
	this.driver = driver;
}
public WebElement getWishlistTextField() {
	return this.driver.findElement(By.xpath("//td[starts-with(@style, 'width')]"));
}
public WebElement getLogoutButton() {
	return this.driver.findElement(By.className("logout"));
}
public WebElement getRemoveWishlist() {
	return this.driver.findElement(By.className("icon-remove"));
}
public WebElement getWishlistName() {
	return this.driver.findElement(By.id("name"));	
}
public WebElement getSaveWishlist() {
	return this.driver.findElement(By.id("submitWishlist"));
}
public WebElement getToYourAcc() {
	return this.driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[1]/a"));
} 
public void inputWishlistName() {
	this.getWishlistName().clear();
	this.getWishlistName().sendKeys("First Wishlist");
}
public void clickSaveWishlist() {
	this.getSaveWishlist().click();
}
public void inputOneWishlist() throws InterruptedException {
	this.inputWishlistName(); 
	Thread.sleep(2000);
	this.clickSaveWishlist();
	Thread.sleep(2000);
}
public void goBackToYAcc() {
	this.getToYourAcc().click();
}
public void deleteWishlist() throws InterruptedException {
	this.getRemoveWishlist().click();
	this.driver.switchTo().alert().accept();
	Thread.sleep(9000);
	//this.driver.navigate().refresh();
	}
public int stanje() {
	int stanje = getCounter().size();
	return stanje;
}
public void clickLogOutButtn() {
	this.getLogoutButton().click();
}

public void inputFiveWishlists() throws InterruptedException {
	int number = 1;
	for (int i = 1; i < 6; i++) {
		this.getWishlistName().sendKeys("Wishlist " + String.valueOf(number));
		this.clickSaveWishlist();
		number++;
		Thread.sleep(2000);
	}
}
public void deleteFiveWishLists() throws InterruptedException {
	for (int i = 1; i < 6; i++) {
	this.deleteWishlist();
	Thread.sleep(2000);
	}
}
}
