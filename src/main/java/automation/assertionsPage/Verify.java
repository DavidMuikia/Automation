package automation.assertionsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verify {

	public static boolean validateElementVisibility(WebDriver driver, String locType, String locValue) {
		boolean result = false;

		try {
			if (locType.equalsIgnoreCase("xpath")) {
				result = driver.findElement(By.xpath(locValue)).isDisplayed();
			} else if (locType.equalsIgnoreCase("id")) {
				result = driver.findElement(By.id(locValue)).isDisplayed();
			} else if (locType.equalsIgnoreCase("name")) {
				result = driver.findElement(By.name(locValue)).isDisplayed();
			}

		} catch (Exception e) {}

		return result;
	}

	public static boolean validateAttribute(WebDriver driver, String locType, String locValue, String attributeName,
			String expValue) {
		boolean result = false;
		String value = "";

		try {
			if (locType.equalsIgnoreCase("xpath")) {
				driver.findElement(By.xpath(locValue)).getAttribute(attributeName);
			} else if (locType.equalsIgnoreCase("id")) {
				driver.findElement(By.id(locValue)).getAttribute(attributeName);
			} else if (locType.equalsIgnoreCase("name")) {
				driver.findElement(By.name(locValue)).getAttribute(attributeName);
			}
			if (value.equalsIgnoreCase(expValue))
				;
			{
				result = true;
			}
		}

		catch (Exception e) {
		}
		return result;
	}

	public static boolean validateTextOnPage(WebDriver driver, String expValue) {
		boolean result = false;
		if (driver.getPageSource().contains(expValue)) {
			result = true;
		}
		return result;
	}

	public static String validateTextPresentOnElement(WebDriver driver, String locType, String locValue) {

		String actvalue = "";

		try {
			if (locType.equalsIgnoreCase("xpath")) {
				actvalue = driver.findElement(By.xpath(locValue)).getText();
			}
			if (locType.equalsIgnoreCase("id")) {
				actvalue = driver.findElement(By.id(locValue)).getText();
			}
			if (locType.equalsIgnoreCase("name")) {
				actvalue = driver.findElement(By.name(locValue)).getText();
			}
		} catch (Exception e) {
		}
		return actvalue;
	}

	public static boolean validateElementExists(WebDriver driver, String locType, String locValue) {

		boolean result = false;

		try {
			if (locType.equalsIgnoreCase("xpath")) {
				driver.findElement(By.xpath(locValue));
			}
			if (locType.equalsIgnoreCase("id")) {
				driver.findElement(By.id(locValue));
			}
			if (locType.equalsIgnoreCase("name")) {
				driver.findElement(By.name(locValue));
			}
			result = true;

		} catch (Exception e) {
		}
		return result;
	}

	public static boolean validateURL(WebDriver driver, String expURL) {
		{
			boolean result = false;
			if (driver.getCurrentUrl().equalsIgnoreCase(expURL))
				;
			{
				result = true;
			}
			return result;
		}
	}

	public static boolean validatePageTitle(WebDriver driver, String expTitle) {

		boolean result = false;
		if (driver.getTitle().equalsIgnoreCase(expTitle)) {
			result = true;
		}
		return result;
	}
}
