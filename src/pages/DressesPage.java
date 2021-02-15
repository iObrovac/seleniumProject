package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPage {
WebDriver driver; 
WebElement dress1; 
WebElement dress2; 
WebElement dress3;
WebElement cart1; 
WebElement cart2; 
WebElement cart3;
WebElement cross; 
WebElement cartFinal; 
public WebElement getCartFinal() {
	return this.driver.findElement(By.xpath("//*[text()='Cart']"));
}
public WebElement getCross() {
	return this.driver.findElement(By.className("cross"));
}
public WebElement getCart1() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
}
public WebElement getCart2() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
}
public WebElement getCart3() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]/span"));
}
public WebElement getDress1() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
}
public WebElement getDress2() { 
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
}
public WebElement getDress3() {
	return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
} 
public DressesPage(WebDriver driver) {
	this.driver = driver; 
	}
public void closePopUper() {
	this.getCross().click();
}
public void goToCartFinal() {
	this.getCartFinal().click();
}

}
