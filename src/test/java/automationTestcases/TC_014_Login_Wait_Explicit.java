package automationTestcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.LibraryPage.PropertyReader;
import automation.basePage.InitiateDriver;
import automationPages.LoginPage;

public class TC_014_Login_Wait_Explicit extends InitiateDriver{

	
	
	@Test
	public void tc001() throws InterruptedException, IOException {
		
		LoginPage login = new LoginPage(driver);
		login.clickLoginTab();
		login.enterUsername();
		login.enterPassword();
		login.clickSignin();
		
		
//	  driver.findElement(By.xpath("//label[text()='Login']//parent::li")).click();
//	  driver.findElement(By.name("_txtUserName")).sendKeys(PropertyReader.applicationConfigReader("Application_Username"));
//	  driver.findElement(By.name("_txtPassword")).sendKeys(PropertyReader.applicationConfigReader("Application_Password"));
//	  driver.findElement(By.xpath("//input[@value='Login']")).click();
//	  driver.findElement(By.xpath("//button[text()='View Me']")).click();
//	  
//	  WebDriverWait wait = new WebDriverWait(driver, 20);//Waiting for the popup to close
//	  wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='modal-content']"))));
//	  driver.findElement(By.xpath("//a[text()='Download']")).click();
	  
	}

}
