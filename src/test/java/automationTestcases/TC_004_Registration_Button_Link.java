package automationTestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_004_Registration_Button_Link extends InitiateDriver {

	

	@Test
	public void tc001() { 

		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("Testing");
		//driver.findElement(By.xpath("//input[@value='Sign up']")).click();  // Click on Button
		driver.findElement(By.xpath("//a[text()='Read Detail']")).click();    // Click on Link
	}

}
