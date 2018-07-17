package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncidentPage {
	private WebDriver driver;
	private By country= By.xpath("//div[2][@id='WIN_3_1000000082']/textarea[1][@id='arid_WIN_3_1000000082']");
	private By CustomerEmail = By.id("arid_WIN_3_303530000");
			//xpath("//div[3][@id='WIN_3_303530000']/textarea[1][@id='arid_WIN_3_303530000' and contains(.,'<Search us')]");
	private By Summary=By.xpath("//div[3][@id='WIN_3_1000000000']/textarea[1][@id='arid_WIN_3_1000000000']");
			//id("arid_WIN_3_1000000000");
	private By Service =By.id("arid_WIN_3_303497300");
	//private By Priorty =By.id("arid_WIN_3_1000000164");
	private By IncidenTypeMenu=By.id("arid_WIN_3_1000000099");
	private By IncidentOption=By.xpath("//tr[1][@class='MenuTableRow']/td[1][@class='MenuEntryNameHover' and text()='Incident']");
	private By AssignedGroup= By.id("arid_WIN_3_1000000217");
	private By SaveButtom= By.xpath("//fieldset[1][@class='PageBodyHorizontal']/div[1][@class='PageBody pbChrome']/a[1][@id='WIN_3_301614800' and contains(normalize-space(),'Save  ')]/div[1][@class='btntextdiv']/div[1][@class='f1' and text()='Save']");

	public IncidentPage(WebDriver driver) {
		this.driver=driver;
	}
	//for now we will set data as plain text , next satge we will insert it as data sheet
	public void CreateNewIncident()
	{
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(CustomerEmail)); 
		// 2 line above is for waiting element display
		WebElement Email =driver.findElement(CustomerEmail);
		  Email = driver.findElement(CustomerEmail);
		  Email.click();
		  Actions builder = new Actions(driver); 
		  builder.sendKeys("alaa.elkafas1@vodafone.com").sendKeys(Keys.ENTER).build().perform();
		  //Email.sendKeys(Keys.ENTER);
		// this for auto complete email in remedy form
		  //Creating the JavascriptExecutor interface object by Type casting		
	      // ((JavascriptExecutor)driver).executeScript("arguments[0].value='alaa.elkafas1@vodafone.com'.;",Email);
		  
		WebElement Sum = driver.findElement(Summary);  	
		Sum.sendKeys("Create New Incident using our automation selenium code");
		WebElement Ser = driver.findElement(Service);  	
		Ser.sendKeys("CS-MONITORING-PROD BS");
		WebElement IncidentMenuType = driver.findElement(IncidenTypeMenu);
		IncidentMenuType.click();
		WebElement IncidentOpt = driver.findElement(IncidentOption);
		IncidentOpt.click();
		WebElement AssGroup = driver.findElement(AssignedGroup);
		AssGroup.sendKeys("IC Team");//we will face auto complete issue
		AssGroup.sendKeys(Keys.ENTER);
		WebElement SaveIncident = driver.findElement(SaveButtom);
		SaveIncident.click();
	}
}
