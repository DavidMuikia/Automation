package automationTestcases;

import java.io.IOException;

import org.testng.annotations.Test;

import automation.LibraryPage.CaptureScreenshot;
import automation.basePage.InitiateDriver;

public class TC_001_Registration_Functionality extends InitiateDriver {

	@Test
	public void tc001() throws IOException {
		
		registration.enterUsername("testing");
		registration.enterEmailAddress("testing@testing.com");
		registration.selectCountryDropdown("India");
		registration.clickSigninButton();

//		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_username_textbox_name")))
//				.sendKeys("Hello"); // Write Data
//		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_email_textbox_name")))
//				.sendKeys("Hello@yahoo.com"); // Write Data

//		Assert.assertTrue(
//			Verify.validateElementVisibility(driver, "xpath",
//						PropertyReader.elementLocatorReader("registration_page_signup_button_xpath")),
//				"Sign up button does not display on page");
//		driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_signup_button_xpath")))
//				.click(); // Click on Element
		
		CaptureScreenshot.takeScreenshot(driver, "Registration Error");
	}

}
