package automationTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_010_Facebook_Mouse_Operations extends InitiateDriver {

	

	@Test
	public void tc001() {

		driver.findElement(By.id("email")).sendKeys("Hello");
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform(); // left click mouse
	//	 act.doubleClick(driver.findElementByXPath("//input[@type='submit']")).perform();// left doubleclick mouse

		//act.contextClick(driver.findElementByXPath("//input[@type='submit']")).perform(); // right click mouse

	}

}
