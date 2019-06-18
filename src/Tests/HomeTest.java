package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import Base.TestBaseSetup;
import Pages.ChangePage;
import Pages.HomePage;
import Pages.LogOutPage;
import Pages.TaskPage;

public class HomeTest extends TestBaseSetup {
	


	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver=this.getDriver();
	}
	
	@Test
	public void verifyHomePage() throws InterruptedException, IOException {
		System.out.println("Home page test...");
		HomePage HomePage = new HomePage(driver);
		ChangePage ChangePage=new ChangePage(driver);
		TaskPage TaskPage=new TaskPage(driver);
		
		/*System.out.println("Open Change");
		HomePage.OpenNewChange();
		System.out.println("Creating Change");
		ChangePage.FillChange();
		System.out.println("Creating Task");
		TaskPage.RelateTaskGroupTemp();
		*/
		//TaskPage.CreateAdhocTaskFromChange();
		//TaskPage.FillAdhocTask();
		
		
		/*System.out.println("Open Search Change");
		HomePage.OpenSearchChange();
		System.out.println("Searching for a Change");
		ChangePage.SearchChange();
		*/
		/*System.out.println("Open Task Console");
		HomePage.OpenTaskConsole();
		System.out.println("Searching for a Task");
		TaskPage.SearchTask();*/
		
		/*HomePage.OpenNewChange();
		System.out.println("Creating Change");
		ChangePage.FillChange();
		System.out.println("Creating Task");
		ChangePage.UpdateStatus();*/
		
	/*	HomePage.OpenNewChange();
		System.out.println("Opening Change");
		ChangePage.FillChange();
		System.out.println("Creating Change");
		TaskPage.CreateAdhocTaskFromChange();
		System.out.println("Creating Adhoc Task");
		TaskPage.FillAdhocTask();
		System.out.println("Filling Adhoc Task");*/
		
		/*HomePage.OpenNewChange();
		System.out.println("Opening Change");
		ChangePage.FillChange();
		System.out.println("Creating Change");
		TaskPage.RelateTaskTemp();
		System.out.println("Creating Task Temp");*/
		
		/*HomePage.OpenNewChange();
		System.out.println("Opening Change");
		ChangePage.FillChange();
		System.out.println("Creating Change");
		ChangePage.AddWI();
		System.out.println("WI is added Successfully");*/
		
		/*LogOutPage logoutpage= new LogOutPage(driver);
		logoutpage.Logout();
		*/
		
		/*System.out.println("Open Change");
		HomePage.OpenNewChange();
		System.out.println("Creating Change");
		ChangePage.FillChange();
		System.out.println("Creating Task");
		TaskPage.CreateAdhocTaskFromChange();
		System.out.println("FillAdhoc Task");
		TaskPage.FillAdhocTask();
		ChangePage.UpdateStatus();
		System.out.println("Update change");
		
		TaskPage.UpdateAdhocTask();*/
		
		String Pro="CDN-LIVE";
		System.out.println("Open Change");
		HomePage.OpenNewChange();
		System.out.println("Creating Change");
		ChangePage.FillChange();
		ChangePage.RelateIncToProblem(Pro);
	}
}
