package Pages;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage
{
	private WebDriver driver;
	private By Application = By.id("reg_img_304316340");
	private By ChangeManagement=By.xpath("//a[1][@class='btn' and contains(.,'Change Man')]");
	private By NewChange= By.xpath("//a[1][@class='btn' and contains(.,'New Change')]/span[1][text()='New Change']");
	private By SearchChange=By.xpath("//a[1][@class='btn' and contains(.,'Search Cha')]/span[1][text()='Search Change']");
	private By TaskManagement= By.xpath("//a[1][@class='btn' and contains(.,'Task Manag')]");
	private By TaskConsole =By.xpath("//a[1][@class='btn' and contains(.,'Task Manag')]/span[1][text()='Task Management Console']");
	//private By SearchTask =By.xpath("//fieldset[1][@class='PageBodyVertical']/div[1][@class='PageBody pbChrome']/div[1][@class='VNavBar arfid301626400 ardbnz2NF_SecondaryNavigation']/div[2][@id='sub-301650500']/div[2][@class and contains(.,' Search Ta')]/a[@class='btn']");
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void OpenTaskConsole() {
		driver.manage().timeouts().pageLoadTimeout(6,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(Application);
		element1.click();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(TaskManagement);
		element2.click();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(TaskConsole);
		element3.click();
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
	}

		
	
    
	public void SearchChange() {
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(Application);
		element1.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(ChangeManagement);
		element2.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(SearchChange);
		element3.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}

	
public void OpenSearchChange() {
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	WebElement element1 = driver.findElement(Application);
	element1.click();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement element2 = driver.findElement(ChangeManagement);
	element2.click();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement element3 = driver.findElement(SearchChange);
	element3.click();
	
	
}	

public void OpenNewChange() {
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	WebElement element1 = driver.findElement(Application);
	element1.click();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement element2 = driver.findElement(ChangeManagement);
	element2.click();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement element3 = driver.findElement(NewChange);
	element3.click();
	
	
}	
}
