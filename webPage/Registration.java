package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void inputEmail(WebDriver driver, String data) {
		driver.findElement(By.cssSelector(ObjectsPath.EMAIL)).sendKeys(data);
	}

	public static void createAccount(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.CREATE_ACCOUNT)).click();
	}

	public static void inputFirstName(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.FIRST_NAME)).sendKeys(data);
	}

	public static void inputLastName(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.LAST_NAME)).sendKeys(data);
	}

	public static void inputPassword(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.PASSWORD)).sendKeys(data);
	}

	public static void inputAddressFirstName(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.ADDRESS_FIRST_NAME)).sendKeys(data);
	}

	public static void inputAddressLastName(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.ADDRESS_LASTNAME)).sendKeys(data);
	}

	public static void inputAddress(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.ADDRESS)).sendKeys(data);
	}

	public static void inputCity(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.CITY)).sendKeys(data);
	}

	public static Select state(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(ObjectsPath.STATE)));
	}

	public static void chooseState(WebDriver driver, String data) {
		state(driver).selectByVisibleText(data);

	}

	public static void inputZip(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.ZIP)).sendKeys(data);

	}

	public static Select country(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(ObjectsPath.COUNTRY)));
	}

	public static void chooseCountry(WebDriver driver, String data) {
		country(driver).selectByVisibleText(data);

	}

	public static void inputMobilePhone(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.MOBILE)).sendKeys(data);
	}

	public static void inputAlias(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.ALIAS)).sendKeys(data);
	}

	public static void clickRegButton(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.REG_BUTTON)).click();
	}
}
