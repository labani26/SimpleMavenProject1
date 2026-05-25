package TestingInfoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRep.HomePage;

public class CheckingTestOfPopularItem {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

		HomePage home = new HomePage(driver);

		// Click on Popular Items
		home.clickOnPopularItem().click();

		// Get Text
		String tableText = home.tableText().getText();

		// Verification
		if (tableText.contains("HP ELITEPAD 1000")) {

			System.out.println("System runs ok");

			home.popularItems1().click();
			driver.navigate().back();

			home.popularItems2().click();
			driver.navigate().back();

			home.popularItems3().click();
			driver.navigate().back();

		} else {

			System.out.println("System does not run");
		}

		driver.quit();
	}
}