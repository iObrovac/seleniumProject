package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressesPage {
private WebDriver driver; 
WebElement updateAddress; 
WebElement removeAddress; 
WebElement addNewAddress;
WebElement backYourToAccount;
WebElement addressCheck;
WebElement deleteButton;
WebElement updatedCompanyCheck;
WebElement alertWarningField;
WebElement addNewAddress2;
String addressText2 = "neznanog junaka 7";
List <WebElement> adrese;
public List<WebElement> getAdrese() {
	return this.driver.findElements(By.className("address"));
}
public String getAddressText2() {
	return this.addressText2;
}
public WebElement getAddNewAddress2() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/a"));
}
public WebElement getAlertWaringField()  {
	return this.driver.findElement(By.className("alert-warning"));
}
public WebElement getUpdatedCompanyCheck() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]"));
}
public WebElement getDeleteButton() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[9]/a[2]"));
}
public WebElement getAddressCheck() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[4]/span[1]"));
}
public WebElement getUpdateAddress() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]"));
}
public WebElement getRemoveAddress() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]"));
}
public WebElement getAddNewAddress() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a"));
			}
public WebElement getBackYourToAccount() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a"));
} 
public MyAddressesPage(WebDriver driver) {
	this.driver = driver; 
}
public void clickUpdateAddress() {
	this.getUpdateAddress().click();
}
public void clickRemoveAddress() {
	this.getRemoveAddress().click();
}
public void clickAddNewAddress() throws InterruptedException {
	Thread.sleep(3000);
	this.getAddNewAddress().click();
}
public void clickAddNewAddress2() throws InterruptedException {
	this.getAddNewAddress2().click();
}
public void clickBackToAccount() {
	this.getBackYourToAccount().click();
}
public void deleteAddress() throws InterruptedException {
	this.getDeleteButton().click();
	Thread.sleep(2000);
	this.driver.switchTo().alert().accept();
}
public void deleteLastAddress()  throws InterruptedException {
	this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]")).click();
	Thread.sleep(2000);
	this.driver.switchTo().alert().accept();
}

}
