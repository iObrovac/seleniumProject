package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBase {
	WebDriver driver;
@BeforeClass 
public void preKlase() {
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	
	this.driver = new ChromeDriver();
	driver.manage().window().maximize();
	
}

public void afterClass() {
	driver.close();
}
}
