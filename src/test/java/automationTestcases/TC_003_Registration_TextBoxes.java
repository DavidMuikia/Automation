package automationTestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_003_Registration_TextBoxes extends InitiateDriver {

	
	@Test
	public void tc001() { // Text box and text area

		driver.findElement(By.name("fld_username")).sendKeys("Hello"); // Write Data
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();  // Click on Element

	}

}
