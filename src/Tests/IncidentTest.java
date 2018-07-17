package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBaseSetup;
import Pages.HomePage;
import Pages.IncidentPage;
import Pages.LogOutPage;

public class IncidentTest extends TestBaseSetup{
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver=this.getDriver();
	}
	
  @Test
  public void CreatingNewIncident()
  {
	  System.out.println("Create New Incident...");
	    HomePage Homepage= new HomePage(driver);
	    Homepage.ClickNewIncidentButton();
	    IncidentPage IncidentPage = new IncidentPage(driver);
	    IncidentPage.CreateNewIncident();
		LogOutPage logoutpage= new LogOutPage(driver);
		logoutpage.Logout();
  }
}
