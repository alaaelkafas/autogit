package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	private WebDriver driver;
	private String HomeUrl="https://itsm9-stage.vodafone.com";
	private By LogOutButton = By.xpath("//div[1][@class='btntextdiv']/div[1][@class='f9' and text()='Logout']");

	public LogOutPage(WebDriver driver) {
		this.driver=driver;
	}
	public void Logout() {
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get(HomeUrl);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(LogOutButton);
		element1.click();	
	}
}
