package automationTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_013_Registration_DropDown_List extends InitiateDriver {

	
	@Test
	public void tc001() {

		driver.findElement(By.name("fld_username")).sendKeys("Hello"); // Write Data
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("Testing");

		Select country = new Select(driver.findElement(By.id("countryId")));
		country.selectByVisibleText("India");

		// Explicit Wait - Waits for property of element to change
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Delhi"));
		Select state = new Select(driver.findElement(By.id("stateId")));
		state.selectByVisibleText("Delhi");

		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Delhi"));
		Select city = new Select(driver.findElement(By.id("cityId")));
		city.selectByVisibleText("Delhi");
	}

}
