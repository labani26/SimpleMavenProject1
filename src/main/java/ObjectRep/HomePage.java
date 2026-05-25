package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	// Constructor
	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	// Click on Popular Item Menu
	public WebElement clickOnPopularItem() {

		return driver.findElement(By.xpath("/html/body/header/nav/ul/li[6]/a"));
	}

	// Table Text Method
	public WebElement tableText() {

		return driver.findElement(By.name("'HP ELITEPAD 1000"));
	}

	// Popular Item 1
	public WebElement popularItems1() {

		return driver.findElement(By.id("details_16"));
	}

	// Popular Item 2
	public WebElement popularItems2() {

		return driver.findElement(By.id("details_10"));
	}

	// Popular Item 3
	public WebElement popularItems3() {

		return driver.findElement(By.id("details_21"));
	}
}