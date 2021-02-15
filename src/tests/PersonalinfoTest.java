package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalinfoTest extends TestBase {
	
	@BeforeMethod
	public void beforeMethod() {
		
	}
	@Test  (priority = 15)
	public void changePersonalData() throws InterruptedException {
		String mail = excelReader.getString("PersonalInfo", 6, 2);
		String pw = excelReader.getString("PersonalInfo", 7, 2);
		String msg = excelReader.getString("PersonalInfo", 11, 2);
		homePage.clickSignInButton();
		Thread.sleep(2000);
		signInPage.actionLogIn(mail, pw);
		myAccountPage.clickMyPersonalInformation(); Thread.sleep(2000);
		personalinfoPage.changeData(); Thread.sleep(2000);
		Assert.assertEquals(personalinfoPage.getAlertSuccessFile().getText(), msg); Thread.sleep(2000);
		personalinfoPage.clickBackToAccBtn(); 
		myAccountPage.clickMyPersonalInformation(); Thread.sleep(2000);
		personalinfoPage.dataReset(); Thread.sleep(2000);
		personalinfoPage.clickBackToAccBtn();  Thread.sleep(2000);
		myAccountPage.clickSignOutButton();  Thread.sleep(2000);
		signInPage.goHome();
	}
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
	}
}
