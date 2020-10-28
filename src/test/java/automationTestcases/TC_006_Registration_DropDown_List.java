package automationTestcases;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation.LibraryPage.PropertyReader;
import automation.basePage.InitiateDriver;

public class TC_006_Registration_DropDown_List extends InitiateDriver {

	

	@Test
	public void tc001() throws IOException { 

		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))).sendKeys("Hello"); // Write Data
		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))).clear();
		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))).sendKeys("Testing");
		
        Select  country = new Select(driver.findElement(By.id(PropertyReader.elementLocatorReader("registration_page_country_dropdown_id"))));
        country.selectByVisibleText("India");  // 3rd Approach
        
        //System.out.println(country.getFirstSelectedOption().getText());// displays selected option
        
        List<WebElement> allOptions = country.getOptions();//(.getAllSelectedOptions() returns values of selected option while .getOptions return list)
        for(WebElement e : allOptions){
        	System.out.println(e.getText());
        }
        
        Select  gender = new Select(driver.findElement(By.name("sex")));
        gender.selectByVisibleText("Male");  // 3rd Approach
        
        //country.selectByIndex(10);    // 1st Approach
        //country.selectByValue("21");  // 2nd Approach
		
	}

}
