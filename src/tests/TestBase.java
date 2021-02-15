package tests;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AddNewAddressPage;
import pages.DressesPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.MyAddressesPage;
import pages.MyWishlistPage;
import pages.PersonalinfoPage;
import pages.ShoppingCartPage;
import pages.SignInPage;
import pages.TshirtPage;
public class TestBase {
	WebDriver driver;
	Actions action;
	JavascriptExecutor js;
	ExcelReader excelReader;
	//pages
	HomePage homePage; 
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	MyAddressesPage myAddressesPage;
	AddNewAddressPage addNewAddressPage;
	PersonalinfoPage personalinfoPage;
	MyWishlistPage myWishListPage;
	TshirtPage tShirtPage; 
	ShoppingCartPage shoppingCartpage;
	DressesPage dressesPage; 	
@BeforeClass 
public void preKlase() throws IOException {
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	this.driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
	this.homePage = new HomePage(driver);
	this.signInPage = new SignInPage(driver);
	this.myAccountPage = new MyAccountPage(driver);
	this.myAddressesPage = new MyAddressesPage(driver);
	this.addNewAddressPage = new AddNewAddressPage(driver);
	this.personalinfoPage = new PersonalinfoPage(driver);
	this.myWishListPage = new MyWishlistPage(driver);
	this.tShirtPage = new TshirtPage(driver);
	this.action = new Actions(driver);
	this.js = (JavascriptExecutor) driver;
	this.shoppingCartpage = new ShoppingCartPage(driver);
	this.dressesPage = new DressesPage(driver);
	this.excelReader = new ExcelReader("data/AutomationTests.xlsx");	
	}
@AfterClass
public void afterClass() {
	driver.close();
}
}
