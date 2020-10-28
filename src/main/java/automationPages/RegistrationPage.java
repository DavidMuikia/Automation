package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import automation.LibraryPage.CaptureScreenshot;
import automation.LibraryPage.PageActions;
import automation.LibraryPage.PropertyReader;

public class RegistrationPage {

	WebDriver driver = null;
PageActions action;
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);

	}

	public void enterUsername(String username) {
		
		try
		{
		action.enterDataIntoTextbox(
				driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))), username);
		}
		catch(Exception e) {
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "EnterDataFailed");
			Assert.fail();
		}
	}

	public void enterEmailAddress(String email) {
		try
		{
		action.enterDataIntoTextbox(
		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_email_textbox_name"))), email);
		}
		catch(Exception e) {
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "EnterDataFailed");
			Assert.fail();
		}
	}

	public void clickSigninButton() {
		try
		{
		action.clickButton(
		driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_signup_button_xpath"))));
		}
		catch(Exception e) {
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "ClickButtonFailed");
			Assert.fail();
		}
	}

	public void selectCountryDropdown(String countryName) {

		try
		{
		Select country = new Select(driver.findElement(By.id(PropertyReader.elementLocatorReader("registration_page_country_dropdown_id"))));
		country.selectByVisibleText(countryName);
		}
		catch(Exception e) {
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "ClickButtonFailed");
			Assert.fail();
		}

	}
}
