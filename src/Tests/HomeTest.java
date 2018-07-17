package Tests;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import Base.TestBaseSetup;
import Pages.HomePage;
import Pages.LogOutPage;

public class HomeTest extends TestBaseSetup {
	


	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver=this.getDriver();
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		HomePage HomePage = new HomePage(driver);
		HomePage.ClickSearchIncidentButton();
		LogOutPage logoutpage= new LogOutPage(driver);
		logoutpage.Logout();
		
	}
}
