package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTests extends TestBase{
	@BeforeMethod
	public void beforeMethod() {
	}	
	@Test   (priority = 10)
	public void addOneItemAndRemoveItQuantitySetTo3() throws InterruptedException {
		String mail = excelReader.getString("ShoppingCart", 6, 2);
		String pw = excelReader.getString("ShoppingCart", 7, 2);
		String shirt = excelReader.getString("ShoppingCart", 13, 2);
		String msg = excelReader.getString("ShoppingCart", 17, 2);
		int quantity = excelReader.getInt("ShoppingCart", 15, 2);
		homePage.clickSignInButton(); Thread.sleep(2000);
		signInPage.actionLogIn(mail, pw); Thread.sleep(2000);
		myAccountPage.toToTShirts(); Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,450)", ""); Thread.sleep(2000);
		action.moveToElement(tShirtPage.getShirtImage()).perform(); Thread.sleep(2000);
		tShirtPage.getAddToC().click(); Thread.sleep(7000);
		tShirtPage.closePopUp();
		js.executeScript("arguments[0].scrollIntoView();",tShirtPage.getCartButton());
		tShirtPage.goToCart(); Thread.sleep(5000);
		Assert.assertEquals(shoppingCartpage.getShirtTextField().getText(), shirt); Thread.sleep(2000);
		shoppingCartpage.setQuantityTo3(); Thread.sleep(2000);
		Assert.assertEquals(Integer.parseInt(shoppingCartpage.getQuantityField().getAttribute("value")), quantity); Thread.sleep(2000);
		shoppingCartpage.removeShirt(); Thread.sleep(8000);
		Assert.assertEquals(shoppingCartpage.getWarning().getText(), msg); Thread.sleep(2000);
		shoppingCartpage.backToAccIg();
		myAccountPage.clickSignOutButton();
		signInPage.goHome();
	}
	@Test   (priority = 5)
	public void addThreeItemsAndRemoveThem() throws InterruptedException {
		String mail = excelReader.getString("ShoppingCart", 23, 2);
		String pw = excelReader.getString("ShoppingCart", 24, 2);
		String msg = excelReader.getString("ShoppingCart", 31, 2);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(mail, pw);
		Thread.sleep(2000);
		myAccountPage.goToDresses(); Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)", ""); Thread.sleep(2000);
		action.moveToElement(dressesPage.getDress1()).perform(); Thread.sleep(2000); Thread.sleep(2000);
		dressesPage.getCart1().click(); Thread.sleep(7000);
		dressesPage.closePopUper();
		action.moveToElement(dressesPage.getDress2()).perform(); Thread.sleep(2000);
		dressesPage.getCart2().click(); Thread.sleep(7000);
		dressesPage.closePopUper();
		action.moveToElement(dressesPage.getDress3()).perform(); Thread.sleep(2000);
		dressesPage.getCart3().click(); Thread.sleep(7000);
		dressesPage.closePopUper();
		js.executeScript("arguments[0].scrollIntoView();",dressesPage.getCartFinal()); Thread.sleep(2000);
		dressesPage.goToCartFinal(); Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",shoppingCartpage.getPriceField()); Thread.sleep(2000);
		Assert.assertEquals(shoppingCartpage.getPriceField().getText(), shoppingCartpage.getPrice());
		shoppingCartpage.removeShirt(); Thread.sleep(10000);
		shoppingCartpage.removeShirt(); Thread.sleep(10000);
		shoppingCartpage.removeShirt(); Thread.sleep(10000);
		Assert.assertEquals(shoppingCartpage.getWarning().getText(), msg);
		shoppingCartpage.backToAccIg();
		myAccountPage.clickSignOutButton();
		signInPage.goHome();
		}
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
	}
	
}
