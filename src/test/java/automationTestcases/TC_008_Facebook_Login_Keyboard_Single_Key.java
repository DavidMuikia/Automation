package automationTestcases;



import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import automation.basePage.InitiateDriver;

public class TC_008_Facebook_Login_Keyboard_Single_Key extends InitiateDriver {

	

	@Test
	public void tc001() { 

		//driver.findElementById("email").sendKeys("Hello");
	       Actions act = new Actions(driver);
	       act.sendKeys(Keys.PAGE_DOWN).perform();
	       //act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	       //act.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();
       
	}

}
