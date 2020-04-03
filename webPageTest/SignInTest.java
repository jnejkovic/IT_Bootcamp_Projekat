package webPageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.ExcelUtils;
import webPage.ObjectsPath;
import webPage.PageURLs;
import webPage.SignIn;

public class SignInTest {

	@Test(priority = 1)
	public void navigateToRegPage() {
		HomePageTest.driver.get(PageURLs.REG_URL);
		Assert.assertEquals(HomePageTest.driver.getCurrentUrl(), PageURLs.REG_URL);
	}

	// Signing in one manually registered user
	@Test(priority = 2)
	public void signInOneUser() {
		SignIn.inputSignInEmail(HomePageTest.driver, "lataaa@gmail.com");
		SignIn.inputSignInPass(HomePageTest.driver, "eurokrem");
		SignIn.clickSignIn(HomePageTest.driver);

		boolean ExistsSignOut = HomePageTest.driver.findElement(By.xpath(ObjectsPath.SIGN_OUT)).isDisplayed();
		Assert.assertEquals(ExistsSignOut, true, "Log In Unsuccessful");
		SignIn.clickSignOut(HomePageTest.driver);
	}

	// Signing in randomly generated and registered users
	@Test(priority = 3)
	public void signInRandomUsersTest() {
		SoftAssert sa = new SoftAssert();
		HomePageTest.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ExcelUtils.setExcel();
		ExcelUtils.setWorkSheet(0);
		ExcelUtils.setCellData(0, 14, "sign_in");
		for (int i = 1; i <= 30; i++) {

			HomePageTest.driver.navigate().to(PageURLs.REG_URL);
			SignIn.inputSignInEmail(HomePageTest.driver, ExcelUtils.getCellData(i, 1));
			SignIn.inputSignInPass(HomePageTest.driver, ExcelUtils.getCellData(i, 4));
			SignIn.clickSignIn(HomePageTest.driver);
			boolean ExistsSignOut = HomePageTest.driver.findElement(By.xpath(ObjectsPath.SIGN_OUT)).isDisplayed();
			sa.assertEquals(ExistsSignOut, true, "Registration Unsuccessful");

			if (ExistsSignOut) {
				SignIn.clickSignOut(HomePageTest.driver);
				ExcelUtils.setCellData(i, 14, "PASS");
			} else {
				System.out.println("Log In Unsuccessful");
				ExcelUtils.setCellData(i, 14, "FAIL");
			}
		}
		sa.assertAll();
	}

}
