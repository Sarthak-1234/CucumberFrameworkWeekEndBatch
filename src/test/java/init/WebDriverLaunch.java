package init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_windows.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	
	//Reporting -----1
	//try/catch

}
