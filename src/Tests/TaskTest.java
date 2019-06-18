package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Base.TestBaseSetup;

public class TaskTest extends TestBaseSetup{
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver=this.getDriver();
	}

}
