package TestingInfoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRep.HomePage;

public class CheckingTestOfPopularItem {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		HomePage home = new HomePage(driver);

		// Click on Popular Items
		home.clickOnPopularItem().click();

		Thread.sleep(3000);

		// Get Text
		String tableText = home.tableText().getText();

		// Verification
		if (tableText.contains("HP ELITEPAD 1000")) {

			System.out.println("System runs ok");

			home.popularItems1().click();
			Thread.sleep(2000);
			driver.navigate().back();

			Thread.sleep(2000);

			home.popularItems2().click();
			Thread.sleep(2000);
			driver.navigate().back();

			Thread.sleep(2000);

			home.popularItems3().click();
			Thread.sleep(2000);
			driver.navigate().back();

		} else {

			System.out.println("System does not run");
		}

		driver.quit();
	}
}