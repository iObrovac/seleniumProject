package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
WebDriver driver; 
WebElement emailField; 
WebElement passwordField; 
WebElement signInBtn;
WebElement alertDanger; 
WebElement firstPageLink;
public WebElement getFirstPageLink() {
	return this.driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
}
public WebElement getEmailField() {
	return this.driver.findElement(By.id("email"));
}
public WebElement getPasswordField() {
	return this.driver.findElement(By.id("passwd"));
}
public WebElement getSignInBtn() {
	return this.driver.findElement(By.id("SubmitLogin"));
}
public WebElement getAlertDanger() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
}
public SignInPage(WebDriver driver) {
	this.driver = driver; 
}
public void inputEmail(String email) {
	this.getEmailField().sendKeys(email); 
}
public void inputPassword(String password) {
	this.getPasswordField().sendKeys(password); 
}
public void clickSignInBtn() {
	this.getSignInBtn().click();
}
public void goHome() throws InterruptedException {
	this.getFirstPageLink().click();
	Thread.sleep(3000);
}
public void actionLogIn(String email, String password) throws InterruptedException {
	Thread.sleep(2000);
	this.inputEmail(email);
	this.inputPassword(password);
	this.clickSignInBtn();
}
}
