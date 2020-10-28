package automationTestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_005_Registration_Radio_Button extends InitiateDriver {

	

	@Test
	public void tc001() { 

		driver.findElement(By.name("fld_username")).sendKeys("Hello"); // Write Data
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='add_type' and @value='home']")).click();  // Radio Button
		driver.findElement(By.name("terms")).click();
		
	}

}
