package ObjectRep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHomePage {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.advantageonlineshopping.com/#/");

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for loader to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.className("loader")));

        HomePage home = new HomePage(driver);

        // Wait until clickable
        WebElement popular =
                wait.until(ExpectedConditions.elementToBeClickable(
                        home.clickOnPopularItem()));

        popular.click();

        // Product 1
        wait.until(ExpectedConditions.elementToBeClickable(
                home.popularItems1())).click();

        driver.navigate().back();

        // Product 2
        wait.until(ExpectedConditions.elementToBeClickable(
                home.popularItems2())).click();

        driver.navigate().back();

        // Product 3
        wait.until(ExpectedConditions.elementToBeClickable(
                home.popularItems3())).click();

        driver.quit();
    }
}