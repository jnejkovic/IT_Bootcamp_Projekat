package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

	public static void inputSignInEmail(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.SIGN_IN_EMAIL)).sendKeys(data);
	}

	public static void inputSignInPass(WebDriver driver, String data) {
		driver.findElement(By.xpath(ObjectsPath.SIGN_IN_PASS)).sendKeys(data);
	}

	public static void clickSignIn(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.SIGN_IN)).click();

	}

	public static void clickSignOut(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.SIGN_OUT)).click();
	}
	
	public static void clickSignInButton(WebDriver driver) {
		driver.findElement(By.xpath(ObjectsPath.SIGN_IN_BUTTON));
	}

}
