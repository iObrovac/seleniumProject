package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewAddressPage {
WebDriver driver; 
WebElement firstNameField; 
WebElement lastNameField; 
WebElement companyField; 
WebElement addressField; 
WebElement cityField; 
WebElement zipCodeField; 
WebElement homePhoneField;
WebElement saveButton; 
WebElement backToYourAddressesButton;
WebElement stateDropDown;
WebElement aliasAddress;
WebElement backToYourAccount; 
String test = "update test";

public WebElement getBackToYourAccount() {
	return this.driver.findElement(By.className("button-small"));
}
public WebElement getFirstNameField() {
	return this.driver.findElement(By.id("firstname"));
}
public WebElement getLastNameField() {
	return this.driver.findElement(By.id("lastname"));
}
public WebElement getCompanyField() {
	return this.driver.findElement(By.id("company"));
}
public WebElement getAddressField() {
	return this.driver.findElement(By.id("address1"));
}
public WebElement getCityField() {
	return this.driver.findElement(By.id("city"));
}
public WebElement getZipCodeField() {
	return this.driver.findElement(By.id("postcode"));
}
public WebElement getHomePhoneField() {
	return this.driver.findElement(By.id("phone"));
}
public WebElement getSaveButton() {
	return this.driver.findElement(By.id("submitAddress"));
}
public WebElement getBackToYourAddressesButton() {
	return this.driver.findElement(By.className("icon-chevron-left"));
}
public WebElement getStateDropDown() {
	return this.driver.findElement(By.id("id_state"));
}
public WebElement getAliasAddress() {
	return this.driver.findElement(By.id("alias"));
}
public AddNewAddressPage(WebDriver driver) {
	this.driver = driver;
}
public void inputDataAddressOne() throws InterruptedException {
	this.getFirstNameField().clear();
	this.getFirstNameField().sendKeys("dragan"); Thread.sleep(1000);
	this.getLastNameField().clear();
	this.getLastNameField().sendKeys("dragic"); Thread.sleep(1000);
	this.getCompanyField().clear();
	this.getCompanyField().sendKeys("KTV"); Thread.sleep(1000);
	this.getAddressField().clear();
	this.getAddressField().sendKeys("neznanog junaka 123"); Thread.sleep(1000);
	this.getCityField().clear();
	this.getCityField().sendKeys("vrsac"); Thread.sleep(1000);
	this.getZipCodeField().clear();
	this.getZipCodeField().sendKeys("32456"); Thread.sleep(1000);
	this.getHomePhoneField().clear();
	this.getHomePhoneField().sendKeys("011098456"); Thread.sleep(1000);
	this.getStateDropDown().click(); Thread.sleep(1000);
	this.getStateDropDown().sendKeys("h"); Thread.sleep(1000);
	this.getStateDropDown().sendKeys(Keys.ENTER);
	this.getAliasAddress().clear();
	this.getAliasAddress().sendKeys("apdejt adrese");
}
public void clickSaveButton() {
	this.getSaveButton().click();
}
public void clickBackToAddresses() {
	this.getBackToYourAddressesButton().click();
}
public void clickBackToAccount() {
	this.getBackToYourAccount().click();
}
public void addressDataReset() throws InterruptedException {
	this.getFirstNameField().clear();
	this.getFirstNameField().sendKeys("miki"); Thread.sleep(1000);
	this.getLastNameField().clear();
	this.getLastNameField().sendKeys("peric"); Thread.sleep(1000);
	this.getCompanyField().clear();
	this.getCompanyField().sendKeys("SkyNet"); Thread.sleep(1000);
	this.getAddressField().clear();
	this.getAddressField().sendKeys("neznanog junaka 7"); Thread.sleep(1000);
	this.getCityField().clear();
	this.getCityField().sendKeys("dedinje"); Thread.sleep(1000);
	this.getZipCodeField().clear();
	this.getZipCodeField().sendKeys("11200"); Thread.sleep(1000);
	this.getHomePhoneField().clear();
	this.getHomePhoneField().sendKeys("011098456"); Thread.sleep(1000);
	this.getStateDropDown().click(); Thread.sleep(1000);
	this.getStateDropDown().sendKeys("h"); Thread.sleep(1000);
	this.getStateDropDown().sendKeys(Keys.ENTER);
	this.getAliasAddress().clear();
	this.getAliasAddress().sendKeys("prvi test adrese");
}
public void actionAddressUpdate() throws InterruptedException {
	this.getFirstNameField().clear();
	this.getFirstNameField().sendKeys(test); Thread.sleep(1000);
	this.getLastNameField().clear();
	this.getLastNameField().sendKeys(test); Thread.sleep(1000);
	this.getCompanyField().clear();
	this.getCompanyField().sendKeys(test); Thread.sleep(1000);
	this.getAddressField().clear();
	this.getAddressField().sendKeys(test); Thread.sleep(1000);
	this.getCityField().clear();
	this.getCityField().sendKeys("dedinje"); Thread.sleep(1000);
	this.getZipCodeField().clear();
	this.getZipCodeField().sendKeys("77777"); Thread.sleep(1000);
	this.getHomePhoneField().clear();
	this.getHomePhoneField().sendKeys("7777777"); Thread.sleep(1000);
	this.getStateDropDown().click(); Thread.sleep(1000);
	this.getStateDropDown().sendKeys("h"); Thread.sleep(1000);
	this.getStateDropDown().sendKeys(Keys.ENTER);
	this.getAliasAddress().clear();
	this.getAliasAddress().sendKeys("UPDATE UPDATE");
}
}
