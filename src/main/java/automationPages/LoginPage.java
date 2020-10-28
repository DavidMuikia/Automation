package automationPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import automation.LibraryPage.PageActions;
import automation.LibraryPage.PropertyReader;

public class LoginPage {

			
		WebDriver driver = null;
		PageActions action;
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			action = new PageActions(driver);

	}
	
	public void enterUsername() throws IOException {
			action.enterDataIntoTextbox
			          (driver.findElement(By.name(PropertyReader.elementLocatorReader("login_username_textbox_name"))),
			                         PropertyReader.applicationConfigReader("Application_Username"));
		}
	
	public void enterPassword() throws IOException {
		action.enterDataIntoTextbox
		                (driver.findElement(By.name(PropertyReader.elementLocatorReader("ogin_password_textbox_name"))),
		                             PropertyReader.applicationConfigReader("Application_Password"));
	}
	
	public void clickSignin() {
		action.clickButton	(driver.findElement(By.xpath("//input[@value='Login']")));
	}
	
	public void clickLoginTab() {
		action.clickButton(driver.findElement(By.xpath("//label[text()='Login']//parent::li")));
	}
}

