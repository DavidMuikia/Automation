package automationTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_012_Keyboard_And_Mouse_Operation extends InitiateDriver {

	@Test
	public void tc001() {

		driver.findElement(By.xpath("//label[text()='Login']//parent::li")).click();
		driver.findElement(By.name("_txtUserName")).sendKeys("test");
		driver.findElement(By.name("_txtPassword")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		// Thread.sleep(15000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Download']"))).keyUp(Keys.CONTROL).build()
				.perform();

	}

}
