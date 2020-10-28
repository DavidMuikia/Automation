package automationTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_011_Mouse_Move_ToElement extends InitiateDriver {

	

	@Test
	public void tc001() {

		Actions act = new Actions(driver);
	       act.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'VIDEOS')]"))).perform();
	       driver.findElement(By.xpath("//a[@title='Free Videos']")).click();
	}

}
