package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalinfoPage {
WebDriver driver; 
WebElement firstNameSquare; 
WebElement lastNameSquare; 
WebElement emailSquare; 
WebElement calendarDays; 
WebElement calendarMonths; 
WebElement currentPassword;
WebElement saveButtonGreen;
WebElement alertSuccessField;
WebElement backToYourAccBtn; 
public WebElement getBackToYouAccBtn() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a"));
}

public WebElement getAlertSuccessFile() {
	return this.driver.findElement(By.className("alert-success"));
}
public WebElement getSaveButtonGreen() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button"));
}
public WebElement getFirstNameSquare() {
	return this.driver.findElement(By.id("firstname"));
}

public WebElement getLastNameSquare() {
	return this.driver.findElement(By.id("lastname"));
}

public WebElement getEmailSquare() {
	return this.driver.findElement(By.id("email"));
}

public WebElement getCalendarDays() {
	return this.driver.findElement(By.id("days"));
}

public WebElement getCalendarMonths() {
	return this.driver.findElement(By.id("months"));
}
public WebElement getCurrentPassword() {
	return this.driver.findElement(By.id("old_passwd"));
}
public PersonalinfoPage(WebDriver driver) {
	this.driver = driver; 
}
public void inputFName() {
	this.getFirstNameSquare().clear();
	this.getFirstNameSquare().sendKeys("milan");
}
public void inputLName() {
	this.getLastNameSquare().clear();
	this.getLastNameSquare().sendKeys("iznogud");
}
public void inputEmail() {
	this.getEmailSquare().clear();
	this.getEmailSquare().sendKeys("milan.iznogud@fakemail.com");
}
public void inputDOB() throws InterruptedException {
	this.getCalendarDays().click();
	this.getCalendarDays().sendKeys("6");
	Thread.sleep(1000);
	this.getCalendarMonths().click();
	this.getCalendarMonths().sendKeys("4");
	
}
public void inputPassword() {
	this.getCurrentPassword().clear();
	this.getCurrentPassword().sendKeys("televizija");
}
public void clickSave() {
	this.getSaveButtonGreen().click();
}
public void changeData()  throws InterruptedException {
		this.inputFName(); Thread.sleep(1000);
		this.inputLName(); Thread.sleep(1000);
		this.inputEmail(); Thread.sleep(1000);
		this.inputDOB();  Thread.sleep(1000);
		this.inputPassword(); Thread.sleep(1000);
		this.clickSave();
}
public void dataReset() {
		this.getFirstNameSquare().clear();
		this.getFirstNameSquare().sendKeys("igor");
		this.getLastNameSquare().clear();
		this.getLastNameSquare().sendKeys("Obrovac");
		this.getEmailSquare().clear();
		this.getEmailSquare().sendKeys("minimalrobinson@yanex.com");
		this.getCalendarDays().click();
		this.getCalendarDays().sendKeys("9");
		this.getCalendarMonths().click();
		this.getCalendarMonths().sendKeys("4");
		this.getCurrentPassword().clear();
		this.getCurrentPassword().sendKeys("televizija");
		this.clickSave();
		
}
public void clickBackToAccBtn() {
		this.getBackToYouAccBtn().click();}
}
