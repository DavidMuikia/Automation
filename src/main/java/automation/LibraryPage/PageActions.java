package automation.LibraryPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageActions {

	WebDriver driver = null;
	WebDriverWait wait;

	public PageActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	public void clickButton(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			CaptureScreenshot.takeScreenshot(driver, "ButtonNotClickable");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void enterDataIntoTextbox(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
		} catch (Exception e) {
			CaptureScreenshot.takeScreenshot(driver, "ElementNotVisible");
			e.printStackTrace();
			Assert.fail();
		}

	}

	public void selectVisibleTextInDropdown(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
			Select s = new Select(element);
			s.selectByVisibleText(text);
		} catch (Exception e) {
			CaptureScreenshot.takeScreenshot(driver, "ElementDataNotVisible");
			e.printStackTrace();
			Assert.fail();
		}

	}
}
