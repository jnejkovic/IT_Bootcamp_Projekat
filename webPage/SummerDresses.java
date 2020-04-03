package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummerDresses {

	public static void navigateToSummerDresses(WebDriver driver) {
		driver.navigate().to(PageURLs.W_SUMMER_DRESSES_URL);
	}

	public static void clickListView(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.LIST_VIEW)).click();
	}
	public static WebElement firstSummerDresses(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.FIRST_SUMMER_DRESS_XPATH));
	}

	public static void clickFirstSummerDresses(WebDriver driver) {
		firstSummerDresses(driver).click();
	}

	public static void chooseTwoDresses(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(ObjectsPath.QUANTITY_WANTED_XPATH));
		element.clear();
		element.sendKeys("2");
	}

	public static void clickSelectSize(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.SIZE_PATH)).click();
	}

	public static void selectSizeM(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.SIZE_M_PATH)).click();
	}

	public static void selectBlueColour(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.COLOUR_BLUE_XPATH)).click();
	}

	public static void clickAdToChart(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.ADD_TO_CART_XPATH)).click();
	}

	public static void openCart(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.VIEW_CART)).click();
	}

	public static WebElement getDressName(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.DRESS_NAME));

	}

	public static WebElement getColorSize(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.COLOR_SIZE_CART));
	}

	public static WebElement getQty(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.QTY));
	}

	public static void closePopUp(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.POP_UP_CART)).click();
	}

	public static void proceedToCheckout(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.PROCEED_TO_CHECKOUT)).click();
	}

}
