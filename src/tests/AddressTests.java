package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AddressTests extends TestBase {	
	@BeforeMethod
	public void beforeMethod() {
				
	}	
	@Test  (priority = 40)
	public void addAndDeleteOneAddress() throws InterruptedException {
		String correctMail = excelReader.getString("Addresses", 6, 2);
		String correctPassword = excelReader.getString("Addresses", 7, 2);
		String addressTxt = excelReader.getString("Addresses", 14, 2);
		int addQuant = excelReader.getInt("Addresses", 13, 2);
		int addQuant2 = excelReader.getInt("Addresses", 16, 2);
		Thread.sleep(2000);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(correctMail, correctPassword);
		myAccountPage.clickMyAddress(); Thread.sleep(2000);
		myAddressesPage.clickAddNewAddress(); Thread.sleep(5000);
		addNewAddressPage.inputDataAddressOne(); Thread.sleep(2000);
		addNewAddressPage.clickSaveButton();Thread.sleep(5000);
		Assert.assertEquals(myAddressesPage.getAdrese().size() , addQuant);
		Assert.assertEquals(myAddressesPage.getAddressCheck().getText(), addressTxt);
		myAddressesPage.deleteAddress();
		Assert.assertEquals(myAddressesPage.getAdrese().size() , addQuant2);
		Thread.sleep(5000);
		myAddressesPage.clickBackToAccount(); Thread.sleep(2000);
		myAccountPage.clickSignOutButton();
		signInPage.goHome();
		}
	@Test  (priority = 35)
	public void updateAnExistingAddress() throws InterruptedException {
		String correctMail = excelReader.getString("Addresses", 22, 2);
		String correctPassword = excelReader.getString("Addresses", 23, 2);
		String compField = excelReader.getString("Addresses", 29, 2);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(correctMail, correctPassword);
		myAccountPage.clickMyAddress(); Thread.sleep(2000);
		myAddressesPage.clickUpdateAddress(); Thread.sleep(3000);
		addNewAddressPage.actionAddressUpdate(); Thread.sleep(3000);
		addNewAddressPage.clickSaveButton(); Thread.sleep(3000);
		Assert.assertEquals(myAddressesPage.getUpdatedCompanyCheck().getText(), compField); Thread.sleep(3000);
		myAddressesPage.clickUpdateAddress(); Thread.sleep(3000);
		addNewAddressPage.addressDataReset();
		addNewAddressPage.clickSaveButton(); Thread.sleep(3000);
		Assert.assertEquals(myAddressesPage.getUpdatedCompanyCheck().getText(), myAddressesPage.getAddressText2());
		myAddressesPage.clickBackToAccount(); Thread.sleep(2000);
		myAccountPage.clickSignOutButton();
		signInPage.goHome();
	}
	@Test  (priority = 30)
	public void deleteTheLastAddress() throws InterruptedException {
		String mail = excelReader.getString("Addresses", 35, 2);
		String pw = excelReader.getString("Addresses", 36, 2);
		String warning = excelReader.getString("Addresses", 40, 2);
		homePage.clickSignInButton();
		signInPage.actionLogIn(mail,pw);
		myAccountPage.clickMyAddress(); Thread.sleep(2000);
		myAddressesPage.deleteLastAddress(); Thread.sleep(2000);
		Assert.assertEquals(myAddressesPage.getAlertWaringField().getText(), warning); Thread.sleep(2000);
		myAddressesPage.clickAddNewAddress2(); Thread.sleep(2000);
		addNewAddressPage.addressDataReset(); 
		addNewAddressPage.clickSaveButton();
		myAddressesPage.clickBackToAccount(); Thread.sleep(2000);
		myAccountPage.clickSignOutButton();
		signInPage.goHome();
	}	
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
	}
	

}
