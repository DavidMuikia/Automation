package automationTestcases;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_009_Facebook_Login_Keyboard_Multiple_Keys extends InitiateDriver {

	

	@Test
	public void tc001() { 

		driver.findElement(By.id("email")).sendKeys("Hello");
	       Actions act = new Actions(driver);
	       act.sendKeys(Keys.TAB).perform();
	       act.sendKeys("HelloWorld").perform();
	       act.sendKeys(Keys.ENTER).perform();
       
	}

}
