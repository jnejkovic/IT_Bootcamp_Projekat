package webPageTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webPage.PageURLs;
import webPage.SummerDresses;

public class SummerDressesTest {

	@Test(priority = 1)
	public void navigateToSummerDresses() {
		JavascriptExecutor js = (JavascriptExecutor) HomePageTest.driver;
		SummerDresses.navigateToSummerDresses(HomePageTest.driver);
		Assert.assertEquals(HomePageTest.driver.getCurrentUrl(), PageURLs.W_SUMMER_DRESSES_URL);
		SummerDresses.clickListView(HomePageTest.driver);
		js.executeScript("window.scrollBy(0,500)");

	}

	@Test(priority = 2)
	public void clickFirstSummerDress() {

		SummerDresses.clickFirstSummerDresses(HomePageTest.driver);
		Assert.assertEquals(HomePageTest.driver.getCurrentUrl(), PageURLs.FIRST_SUMMER_DRESS_URL);
	}

	// Adding products to the cart
	@Test(priority = 3)
	public void addToChartTest() {
		JavascriptExecutor js = (JavascriptExecutor) HomePageTest.driver;
		SummerDresses.chooseTwoDresses(HomePageTest.driver);
		SummerDresses.clickSelectSize(HomePageTest.driver);
		SummerDresses.selectSizeM(HomePageTest.driver);
		SummerDresses.selectBlueColour(HomePageTest.driver);
		SummerDresses.clickAdToChart(HomePageTest.driver);
		SummerDresses.closePopUp(HomePageTest.driver);
		SummerDresses.openCart(HomePageTest.driver);
		js.executeScript("window.scrollBy(0,600)");

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(SummerDresses.getDressName(HomePageTest.driver).getText().contains("Printed Summer Dress"));
		sa.assertTrue(SummerDresses.getColorSize(HomePageTest.driver).getText().contains("Color : Blue, Size : M"));
		sa.assertEquals(SummerDresses.getQty(HomePageTest.driver).getAttribute("value"), "2");
		sa.assertAll();
	}

	@Test(priority = 4)
	public void proceedToCheckout() {
		SummerDresses.proceedToCheckout(HomePageTest.driver);

		Assert.assertEquals(HomePageTest.driver.getCurrentUrl(), PageURLs.REG_URL);
	}

}
