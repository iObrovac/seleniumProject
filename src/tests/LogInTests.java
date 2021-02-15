package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LogInTests extends TestBase{

	@BeforeMethod
	public void beforeMethod() {
		
	}
	@Test (priority = 65)
	public void logInValidCredentials() throws InterruptedException {
		String correctMail = excelReader.getString("Logging", 6, 2);
		String correctPassword = excelReader.getString("Logging", 7, 2);
		String assertLogIn = excelReader.getString("Logging", 9, 2);
		Thread.sleep(2000);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(correctMail, correctPassword);
		Assert.assertEquals(myAccountPage.getMyAccountText().getText(), assertLogIn); 
		Thread.sleep(2000);
		myAccountPage.clickSignOutButton();
		signInPage.goHome();
		}
	@Test (priority = 60)
	public void logInWrongPassword() throws InterruptedException {
		String correctMail = excelReader.getString("Logging", 16, 2);
		String wrongPassword = excelReader.getString("Logging", 17, 2);
		String errorMsg = excelReader.getString("Logging", 18, 2);
		homePage.clickSignInButton();
		signInPage.actionLogIn(correctMail, wrongPassword); Thread.sleep(2000);
		Assert.assertEquals(signInPage.getAlertDanger().getText(), errorMsg);
		 Thread.sleep(2000);
		 signInPage.goHome();
		}
	@Test  (priority = 55)
	public void logInWrongEmail() throws InterruptedException {
		String wrongMail = excelReader.getString("Logging", 24, 2);
		String correctPassword = excelReader.getString("Logging", 25, 2);
		String errorMsg = excelReader.getString("Logging", 26, 2);
		homePage.clickSignInButton();
		signInPage.actionLogIn(wrongMail, correctPassword); Thread.sleep(2000);
		Assert.assertEquals(signInPage.getAlertDanger().getText(), errorMsg);
		Thread.sleep(2000);
		signInPage.goHome();
	}
	@Test  (priority = 50)
	public void logInWrongEmailAndPassword() throws InterruptedException{
		String wrongMail = excelReader.getString("Logging", 32, 2);
		String wrongPW = excelReader.getString("Logging", 33, 2);
		String errorMsg = excelReader.getString("Logging", 34, 2);
		homePage.clickSignInButton();
		signInPage.actionLogIn(wrongMail, wrongPW); Thread.sleep(2000);
		Assert.assertEquals(signInPage.getAlertDanger().getText(), errorMsg);
		Thread.sleep(2000);
		signInPage.goHome();
	}
	@Test   (priority = 45)
	public void logOUT() throws InterruptedException{
		String correctMail = excelReader.getString("Logging", 40, 2);
		String correctPassword = excelReader.getString("Logging", 41, 2);
		String assertLogIn = excelReader.getString("Logging", 43, 2);
		String assertLogOUT = excelReader.getString("Logging", 45, 2);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(correctMail, correctPassword);
		Assert.assertEquals(myAccountPage.getMyAccountText().getText(), assertLogIn);  Thread.sleep(2000);
		myAccountPage.clickSignOutButton(); Thread.sleep(2000);
		Assert.assertEquals(signInPage.getSignInBtn().getAttribute("id"), assertLogOUT);
		Thread.sleep(2000);
		signInPage.goHome();
	}
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
	}
}
