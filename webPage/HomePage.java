package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public static void openHomePage(WebDriver driver) {
		driver.get(PageURLs.URL);
	}

	public static void navigateToHP(WebDriver driver) {
		driver.navigate().to(PageURLs.URL);
	}

	public static void action(WebDriver driver, WebElement element1, WebElement element2) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).moveToElement(element2).click().perform();
	}

	public static WebElement women(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.WOMEN_XPATH));
	}

	public static WebElement womenSummerDresses(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.SUMMER_DRESS_XPATH));
	}

	public static String clickWomenSummerDresses(WebDriver driver) {
		action(driver, women(driver), womenSummerDresses(driver));
		return driver.getCurrentUrl();
	}

	public static WebElement dresses(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.DRESSES_XPATH));
	}

	public static WebElement dressesSummerDresses(WebDriver driver) {
		return driver.findElement(By.xpath(ObjectsPath.D_SUMMER_DRESS_XPATH));
	}

	public static String clickDressesSummerDresses(WebDriver driver) {
		action(driver, dresses(driver), dressesSummerDresses(driver));
		return driver.getCurrentUrl();
	}

}
