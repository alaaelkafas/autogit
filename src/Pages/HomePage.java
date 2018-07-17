package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage
{
	private WebDriver driver;
	private By Application = By.id("reg_img_304316340");
	private By IncidentManagment = By.xpath("//a[1][@class='btn' and contains(.,'Incident M')]/span[1][@class='navLabel root ' and text()='Incident Management']");
	private By SearchIncident = By.xpath("//a[1][@class='btn' and contains(.,'Search Inc')]");
	private By NewIncident= By.linkText("New Incident");
			//("//div[2][@class='item EP lvl1  VNavHover1']/a[1][@class='btn' and contains(.,'New Incide')]/span[1][@class='navLabel lvl1  VNavHover1' and text()='New Incident']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void ClickSearchIncidentButton() {
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(Application);
		element1.click();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(IncidentManagment);
		element2.click();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(SearchIncident);
		element3.click();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	}
	
	public void ClickNewIncidentButton() {
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(Application);
		element1.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(IncidentManagment);
		element2.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(NewIncident);
		element3.click();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	}
}
