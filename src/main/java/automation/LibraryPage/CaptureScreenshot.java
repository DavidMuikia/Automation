package automation.LibraryPage;

import java.io.File;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CaptureScreenshot {

	static String filename = null;

	public static void takeScreenshot(WebDriver driver, String name) {

		try {
			Calendar c = Calendar.getInstance();
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			filename = "./Screenshots/" + name + c.getTime().toString().replace(":", "").replace(" ", "") + ".png";
			File f = screenshot.getScreenshotAs(OutputType.FILE);
			File fd = new File(filename);
			FileUtils.copyFileToDirectory(f, fd);
		} catch (Exception e) {
			System.out.println("Not Able To Take screenshot");
		}
		attachScreenShotToReport();
	}

	public static void attachScreenShotToReport() {
		try {
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			File f = new File(filename);
			Reporter.log("<a title= \"Snapshot\" href=\"" + f.getAbsolutePath() + "\">"
					+ "<img width=\"418\" height=\"240\" alt=\"alternativeName\" title=\"title\" scr=\"../surefire-reports/html/screenShots/"
					+ filename);

		} catch (Exception e) {
			System.out.println("Not Able To Take screenshot");
		}
	}
}
