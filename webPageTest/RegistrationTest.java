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
import webPage.HomePage;
import webPage.ObjectsPath;
import webPage.PageURLs;
import webPage.Registration;
import webPage.SignIn;

public class RegistrationTest {

	@Test(priority = 1)
	public void navigateToRegPage() {
		HomePageTest.driver.get(PageURLs.REG_URL);
		Assert.assertEquals(HomePageTest.driver.getCurrentUrl(), PageURLs.REG_URL);
	}

	// Manually create one account test
	@Test(priority = 2)
	public void createOneAccount() {
		Registration.inputEmail(HomePageTest.driver, "mjuy123@gmail.com");
		Registration.createAccount(HomePageTest.driver);
		Registration.inputFirstName(HomePageTest.driver, "Jelena");
		Registration.inputLastName(HomePageTest.driver, "Nejkovic");
		Registration.inputPassword(HomePageTest.driver, "eurokrem");

		// This two fields are automatically filled
		// Registration.inputAddressFirstName(driver, "Jelena");
		// Registration.inputAddressLastName(driver, "Nejkovic");

		Registration.inputAddress(HomePageTest.driver, "Milosa Obrenovica 9");
		Registration.inputCity(HomePageTest.driver, "Obrenovac");
		Registration.chooseState(HomePageTest.driver, "Colorado");
		Registration.inputZip(HomePageTest.driver, "11500");
		Registration.chooseCountry(HomePageTest.driver, "United States");
		Registration.inputMobilePhone(HomePageTest.driver, "066123456");
		Registration.inputAlias(HomePageTest.driver, "address1");
		Registration.clickRegButton(HomePageTest.driver);
		boolean ExistsSignOut = HomePageTest.driver.findElement(By.xpath(ObjectsPath.SIGN_OUT)).isDisplayed();
		Assert.assertEquals(ExistsSignOut, true, "Registration Unsuccessful");
		SignIn.clickSignOut(HomePageTest.driver);

	}

	// Registration of 30 randomly generated users from the excel table
	@Test(priority = 3)
	public void randomUserRegistrationTest() {
		SoftAssert sa = new SoftAssert();
		HomePageTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ExcelUtils.setExcel();
		ExcelUtils.setWorkSheet(0);
		ExcelUtils.setCellData(0, 13, "registration");

		for (int i = 1; i <= 30; i++) {

			HomePageTest.driver.navigate().to(PageURLs.REG_URL);
			Registration.inputEmail(HomePageTest.driver, ExcelUtils.getCellData(i, 1));
			Registration.createAccount(HomePageTest.driver);
			Registration.inputFirstName(HomePageTest.driver, ExcelUtils.getCellData(i, 2));
			Registration.inputLastName(HomePageTest.driver, ExcelUtils.getCellData(i, 3));
			Registration.inputPassword(HomePageTest.driver, ExcelUtils.getCellData(i, 4));

			// This two fields are automatically filled
			// Registration.inputAddressFirstName(driver, ExcelUtils.getCellData(i, 2));
			// Registration.inputAddressLastName(driver, ExcelUtils.getCellData(i, 3));

			Registration.inputAddress(HomePageTest.driver, ExcelUtils.getCellData(i, 5));
			Registration.inputCity(HomePageTest.driver, ExcelUtils.getCellData(i, 6));
			Registration.chooseState(HomePageTest.driver, ExcelUtils.getCellData(i, 7));
			Registration.inputZip(HomePageTest.driver, ExcelUtils.getCellData(i, 8));
			Registration.chooseCountry(HomePageTest.driver, ExcelUtils.getCellData(i, 9));
			Registration.inputMobilePhone(HomePageTest.driver, ExcelUtils.getCellData(i, 10));
			Registration.inputAlias(HomePageTest.driver, ExcelUtils.getCellData(i, 11));
			Registration.clickRegButton(HomePageTest.driver);
			boolean ExistsSignOut = HomePageTest.driver.findElement(By.xpath(ObjectsPath.SIGN_OUT)).isDisplayed();
			sa.assertEquals(ExistsSignOut, true, "Registration Unsuccessful");

			if (ExistsSignOut) {
				SignIn.clickSignOut(HomePageTest.driver);
				ExcelUtils.setCellData(i, 13, "PASS");
			} else {
				System.out.println("Registration Unsuccessful");
				ExcelUtils.setCellData(i, 13, "FAIL");
			}

		}
		sa.assertAll();
	}

}
