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

    // Locator Methods
    
    public WebElement clickOnPopularItem() {
    	
    	return driver.findElement(By.xpath("/html/body/header/nav/ul/li[6]/a"));
    }

    public WebElement popularItems1() {

        return driver.findElement(By.id("details_16"));
    }

    public WebElement popularItems2() {

        return driver.findElement(By.id("details_10"));
    }

    public WebElement popularItems3() {

        return driver.findElement(By.id("\"details_21"));
    }

}