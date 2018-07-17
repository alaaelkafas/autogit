package Try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {
	WebDriver driver;
	
  @Test
  public void f() {
	    System.setProperty("webdriver.chrome.driver",".\\Adds\\chromedriver.exe");
	    driver = new ChromeDriver();
	          String baseUrl = "https://itsm9-stage.vodafone.com";
	          
	  // launch Chrome and direct it to the Base URL
	          driver.get(baseUrl);
	         
	      }
	  
  
}
