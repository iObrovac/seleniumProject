package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishlistTests extends TestBase{

	@BeforeMethod
	public void beforeMethod() {		
	}
	@Test  (priority = 25)
	public void addAndDeleteOneWishList() throws InterruptedException {
		String mail = excelReader.getString("Wishlist", 6, 2);
		String pw = excelReader.getString("Wishlist", 7, 2);
		int num = excelReader.getInt("Wishlist", 11, 2);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(mail, pw);
		myAccountPage.clickMyWhislist(); Thread.sleep(2000);
		myWishListPage.inputOneWishlist();
		Assert.assertEquals(myWishListPage.stanje(), num);
		Assert.assertEquals(myWishListPage.getWishlistTextField().getText(), myWishListPage.getWishlistStringCheck());
		Thread.sleep(2000);
		myWishListPage.deleteWishlist();
		myWishListPage.clickLogOutButtn();
		signInPage.goHome();
	}
	@Test   (priority = 20)
	public void addAndDeleteFiveWishlists() throws InterruptedException {
		String mail = excelReader.getString("Wishlist", 17, 2);
		String pw = excelReader.getString("Wishlist", 18, 2);
		int num = excelReader.getInt("Wishlist", 22, 2);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(mail, pw);
		myAccountPage.clickMyWhislist(); Thread.sleep(2000);
		Assert.assertEquals(myWishListPage.stanje(), 0);
		myWishListPage.inputFiveWishlists();
		Assert.assertEquals(myWishListPage.stanje(), num);
		Thread.sleep(2000);
		myWishListPage.deleteFiveWishLists();
		Assert.assertEquals(myWishListPage.stanje(), 0);
		myWishListPage.clickLogOutButtn();
		signInPage.goHome();
	}
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
	}
	
}
