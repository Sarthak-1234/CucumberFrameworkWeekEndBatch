package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MMTHomePage {
	
	//pagefactory pattern constructor
	
	
	
	WebDriver driver;
	
	
	public MMTHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//locators
	@FindBy(xpath="//img[@alt='Make My Trip']")
	public WebElement mmtLogo;
	
	@FindBy(xpath="//div[text()='Sea']")
	public WebElement searchButton;
	
	@FindBy(xpath="//p[text()=' Login or Create Account']")
	public WebElement loginButton;
	
	
	//functions
	public void navigateToHomePage() {
		driver.get("https://www.makemytrip.com/");
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public void checkHomePageBasicAtt(String e) {
		if(e.equals("makemytriplogo")) {
			System.out.println("Checking Logo");
			Assert.assertTrue(mmtLogo.isDisplayed(), "Logo is missing");
			
		} else if(e.equals("searchButton")) {
			System.out.println("Checking Search Button");
			Assert.assertTrue(searchButton.isDisplayed(), "Search Button Missing");	
			
		} else if(e.equals("loginAccountButton")) {
			System.out.println("Checking Login Button");
			Assert.assertTrue(loginButton.isDisplayed(), "Login Button is missing");	
		}
		
	}



//	public void checkLogo() {
//		Assert.assertTrue(mmtLogo.isDisplayed(), "Logo is missing");
//	}
//
//	public void checkSearchButton() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void checkLoginButton() {
//		// TODO Auto-generated method stub
//		
//	}

}
