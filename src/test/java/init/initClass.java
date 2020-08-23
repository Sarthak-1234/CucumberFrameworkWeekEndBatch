package init;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.ExtentReports;

import pageObjects.MMTHomePage;
import reporting.ExtentManager;

public class initClass {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(initClass.class);
	
	public static WebDriver driver;
	
	public MMTHomePage homepage;
	
	
	public initClass() throws IOException {
		launchDriver();
		createObjects();
	}
	
	public static void launchDriver() throws IOException {
		driver = WebDriverLaunch.getDriver();
	}
	
	public void createObjects() {
		homepage = new MMTHomePage(driver);
	}
	


}
