package webPageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utility.ExcelUtils;
import webPage.HomePage;
import webPage.PageURLs;

public class HomePageTest {
	public static WebDriver driver;

	@BeforeSuite
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void TestQuit() {
		ExcelUtils.closeExcell();
		driver.close();
	}

	@Test(priority = 1)
	public void openHomePage() {
		HomePage.openHomePage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.URL);

	}

	@Test(priority = 2)
	public void navigateToHP() {
		HomePage.navigateToHP(driver);
		Assert.assertEquals(driver.getCurrentUrl(), PageURLs.URL);

	}

	@Test(priority = 3)
	public void clickWomenSummerDresses() {
		Assert.assertEquals(HomePage.clickWomenSummerDresses(driver), PageURLs.W_SUMMER_DRESSES_URL);

	}

	@Test(priority = 4)
	public void clickDressesSummerDresses() {
		Assert.assertEquals(HomePage.clickDressesSummerDresses(driver), PageURLs.D_SUMMER_DRESSES_URL);

	}

	@Test(priority = 5)
	public void testSummerDressesUrl() {
		Assert.assertEquals(HomePage.clickWomenSummerDresses(driver), HomePage.clickDressesSummerDresses(driver));
	}

}
