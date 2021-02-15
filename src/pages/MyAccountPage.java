package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
WebDriver driver; 
WebElement signOutButton; 
WebElement orderHistoryAndDetails; 
WebElement myWishlist; 
WebElement myCreditSlip; 
WebElement myAddress; 
WebElement myPersonalInformation;
WebElement myAccountText; 
WebElement tShirts;
WebElement dresses; 

public WebElement getDresses() {
	return this.driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
}
public WebElement getTShirts() {
	return this.driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
}
public WebElement getSignOutButton() {
	return this.driver.findElement(By.className("logout"));
}
public WebElement getOrderHistoryAndDetails() {
	return this.driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=history"));
}
public WebElement getMyWishlist() {
	return this.driver.findElement(By.className("icon-heart"));
}
public WebElement getMyCreditSlip() {
	return this.driver.findElement(By.className("icon-ban-circle"));
}
public WebElement getMyAddress() {
	return this.driver.findElement(By.className("icon-building"));
}
public WebElement getMyPersonalInformation() {
	return this.driver.findElement(By.className("icon-user"));
} 
public WebElement getMyAccountText() {
	return this.driver.findElement(By.className("page-heading"));
}
public MyAccountPage(WebDriver driver) {
	this.driver = driver;
}
public void toToTShirts() {
	this.getTShirts().click();
}
public void clickSignOutButton() {
	this.getSignOutButton().click();
}
public void clickOrderHistory() {
	this.getOrderHistoryAndDetails().click();
}
public void clickMyWhislist() {
	this.getMyWishlist().click();
}
public void clickCreditSlip() {
	this.getMyCreditSlip().click();
}
public void clickMyAddress() {
	this.getMyAddress().click();
}
public void clickMyPersonalInformation() {
	this.getMyPersonalInformation().click();
}
public void goToDresses() {
	this.getDresses().click();
}
}
