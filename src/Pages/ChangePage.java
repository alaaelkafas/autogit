package Pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChangePage {
	private WebDriver driver;
	HomePage HomePage=new HomePage(driver);
	private By SearchChangeBtn=By.xpath("//fieldset[1][@class='PageBodyHorizontal']/div[1][@class='PageBody pbChrome']/a[2][@id='WIN_3_1002' and contains(normalize-space(),'Search')]/div[1][@class='btntextdiv']/div[1][@class='f1' and text()='Search']");
	private By Service=By.id("arid_WIN_3_303497300");
	private By Summary=By.id("arid_WIN_3_1000000000");
	private By ManagerGroup=By.id("arid_WIN_3_1000000015");
	private By ChangeBodyID=By.xpath("//a[(@class='btn')and contains (text(),'CRQ')]");
	private By CustomTab =By.xpath("//div[1]/dl[1][@class='OuterOuterTab']/dd[8][@class='OuterTab']/span[2][@class='Tab']/a[1][@class='btn f1' and text()='Custom']");
	private By WITab =By.xpath("//div[1]/dl[1][@class='OuterOuterTab']//span[2][@class='Tab']/a[1][@class='btn f1' and contains(.,'Work Detai')]");
	private By WINotes =By.xpath("//div[3][@id='WIN_3_304247060']/fieldset[1][@class='PageBodyVertical']/div[1][@class='PageBody pbChrome']/div[3][@id='WIN_3_304247080']/textarea[1][@id='arid_WIN_3_304247080']");
	private By WINotesBtn =By.xpath("//fieldset[1][@class='PageBodyVertical']/div[1][@class='PageBody pbChrome']/a[2][@id='WIN_3_304247110' and contains(normalize-space(),'Add')]/div[1][@class='btntextdiv']/div[1][@class='f1' and text()='Add']");
	private By PRITab = By.xpath("//div[1]/dl[1][@class='OuterOuterTab']/dd[6][@class='OuterTab']/span[2][@class='Tab']/a[1][@class='btn f1' and contains(.,'Post Imple')]");
	private By Q1=By.xpath("//div[3][@id='WIN_3_1020000103']/fieldset[1][@class='fieldSetRadio']/div[1][@class='radio ']/span[1]/input[1][@id='WIN_3_rc0id1020000103' and @name='WIN_3_RCGroup1020000103' and @type='radio']");
	private By Q2=By.xpath("//div[4][@id='WIN_3_1020000104']/fieldset[1][@class='fieldSetRadio']/div[1][@class='radio ']/span[1]/input[1][@id='WIN_3_rc0id1020000104' and @name='WIN_3_RCGroup1020000104' and @type='radio']");
	private By Q3=By.xpath("//div[5][@id='WIN_3_1020000105']/fieldset[1][@class='fieldSetRadio']/div[1][@class='radio ']/span[1]/input[1][@id='WIN_3_rc0id1020000105' and @name='WIN_3_RCGroup1020000105' and @type='radio']");
	private By Q4=By.xpath("//div[6][@id='WIN_3_1020000106']/fieldset[1][@class='fieldSetRadio']/div[1][@class='radio ']/span[1]/input[1][@id='WIN_3_rc0id1020000106' and @name='WIN_3_RCGroup1020000106' and @type='radio']");
	private By Q5=By.xpath("//div[7][@id='WIN_3_1020000107']/fieldset[1][@class='fieldSetRadio']/div[1][@class='radio ']/span[1]/input[1][@id='WIN_3_rc0id1020000107' and @name='WIN_3_RCGroup1020000107' and @type='radio']");
	private By Cats=By.xpath("//div[1]/dl[1][@class='OuterOuterTab']/dd[2][@class='OuterTab']/span[2][@class='Tab']/a[1][@class='btn f1' and text()='Categorization']");
							//div[1]/dl[1][@class='OuterOuterTab']/dd[3][@class='OuterTab']/span[2][@class='Tab']/a[1][@class='btn f1' and text()='Tasks']
	private By NextStage=By.xpath("//fieldset[1][@class='PageBodyHorizontal']/div[1][@class='PageBody pbChrome']/a[5][@id='WIN_3_303060100' and contains(.,'Next Stage')]/div[1][@class='btntextdiv']/div[1][@class='f7' and text()='Next Stage']");
	private By ChangeManager=By.xpath("//div[1][@class='PageBody pbChrome']/div[4][@id='WIN_3_304196800']/fieldset[1][@class=' pnl ']/div[4][@id='WIN_3_1000000403']/textarea[1][@id='arid_WIN_3_1000000403']");
	private By DateTab=By.xpath("//div[1]/dl[1][@class='OuterOuterTab']/dd[5][@class='OuterTab']/span[2][@class='Tab']/a[1][@class='btn f1' and text()='Date/System']");
	private By ScheduledStartDate=By.xpath("//div[1][@class='PageBody pbChrome']/div[1][@id='WIN_3_303868800']/fieldset[5][@id='WIN_3_302058000']/div[3][@id='WIN_3_1000000350']/input[1][@id='arid_WIN_3_1000000350' and @type='text']");
	private By ScheduledEndDate=By.xpath("//div[1][@class='PageBody pbChrome']/div[1][@id='WIN_3_303868800']/fieldset[5][@id='WIN_3_302058000']/div[4][@id='WIN_3_1000000362']/input[1][@id='arid_WIN_3_1000000362' and @type='text']");
	private By ActualStartDate=By.xpath("//div[1][@class='PageBody pbChrome']/div[1][@id='WIN_3_303868800']/fieldset[5][@id='WIN_3_302058000']/div[5][@id='WIN_3_1000000348']/input[1][@id='arid_WIN_3_1000000348' and @type='text']");
	private By ActualEndDate=By.xpath("//div[1][@class='PageBody pbChrome']/div[1][@id='WIN_3_303868800']/fieldset[5][@id='WIN_3_302058000']/div[6][@id='WIN_3_1000000364']/input[1][@id='arid_WIN_3_1000000364' and @type='text']");
	private By Refresh= By.xpath("//img[(@id='reg_img_304352241' )and (@artxt='Refresh')]");
	//private By CoordinatorGroup=By.xpath("//div[1][@class=\"PageBody pbChrome\"]/div[1][@id=\"WIN_3_303683700\"]/fieldset[1][@class=\" pnl \"]/div[2][@id=\"WIN_3_1000003229\"]/textarea[1][@id=\"arid_WIN_3_1000003229\"]");
	//private By ChangeCoordinator=By.xpath("//div[1][@class=\"PageBody pbChrome\"]/div[1][@id=\"WIN_3_303683700\"]/fieldset[1][@class=\" pnl \"]/div[3][@id=\"WIN_3_1000003230\"]/textarea[1][@id=\"arid_WIN_3_1000003230\"]");
	private By Cat1=By.xpath("//div[1][@class='PageBody pbChrome']/div[1][@id='WIN_3_303868800']/fieldset[2][@id='WIN_3_304287650']//textarea[1][@id='arid_WIN_3_1000000063']");
	private By Save=By.id("WIN_3_1001");
	private By SearchChange=By.xpath("//a[1][@class='btn' and contains(.,'Search Cha')]/span[1][text()='Search Change']");
	private By ChangeID=By.xpath("//div[1][@class='PageBody pbChrome']/div[1][@id='WIN_3_303683700']/fieldset[1][@class=' pnl ']/div[1][@id='WIN_3_1000000182']/textarea[1][@id='arid_WIN_3_1000000182']");
	//private By NextStage= By.xpath("//fieldset[1][@class='PageBodyHorizontal']/div[1][@class='PageBody pbChrome']/a[5][@id='WIN_3_303060100' and contains(.,'Next Stage')]/div[1][@class='btntextdiv']/div[1][@class='f7' and text()='Next Stage']");
	String Change_ID = "CRQ000030003802";
	private By Status=By.xpath("//*[@id='arid_WIN_3_303502600']");
	private By Select=By.xpath("//div[@class='f1'and text()='Select']");
	//String Change_ID;
	String pattern;
	private By OkButton =By.className("btn btn3d PopupBtn");
	private By CoordinatorGroup=By.xpath("//div[1][@class=\"PageBody pbChrome\"]/div[1][@id=\"WIN_3_303683700\"]/fieldset[1][@class=\" pnl \"]/div[2][@id=\"WIN_3_1000003229\"]/textarea[1][@id=\"arid_WIN_3_1000003229\"]");
	private By ChangeCoordinator=By.xpath("//div[1][@class=\"PageBody pbChrome\"]/div[1][@id=\"WIN_3_303683700\"]/fieldset[1][@class=\" pnl \"]/div[3][@id=\"WIN_3_1000003230\"]/textarea[1][@id=\"arid_WIN_3_1000003230\"]");
	public ChangePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void FillChange() throws InterruptedException {
		//Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		WebElement element10 = driver.findElement(Service);
		element10.sendKeys("UK");
		
			element10.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			String parentHandle = driver.getWindowHandle();
			
			Set<String> PopHandle = driver.getWindowHandles();
			Iterator<String> it = PopHandle.iterator();
			String ChildHandle = "";
			Thread.sleep(1000);
			while(it.hasNext())
			{   
			    if (it.next() != parentHandle)
			    {   
			        ChildHandle = it.next().toString();
			    }
			}
			Thread.sleep(3000);
			driver.switchTo().window(ChildHandle);
			driver.manage().timeouts().pageLoadTimeout(1200,TimeUnit.SECONDS);
			Thread.sleep(5000);
			WebDriverWait wait1 = new WebDriverWait(driver,5500);
			Thread.sleep(1000);
			WebElement element22 = driver.findElement(Select);
			
			if(element22.isDisplayed()==false) {
				System.out.println("If Condition");
			wait1.until(ExpectedConditions.visibilityOfElementLocated(Select)).click();
			element22.click();
			}
			else 
			{
				System.out.println("Else Condition");
				Thread.sleep(1000);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(Select));
				Thread.sleep(2000);
				element22.click();
			}
			Thread.sleep(6000);
			driver.switchTo().window(parentHandle);
			
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(Summary);
		element2.sendKeys("Test");
		element2.sendKeys(Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(ManagerGroup);
		element3.sendKeys("GESD-GA");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		element3.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
		
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement element4 = driver.findElement(Cats);
		element4.click();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement element5 = driver.findElement(Cat1);
		element5.sendKeys("Application Management");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//element5.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(ChangeManager);
		element1.sendKeys("Ahmed Radwan",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element6 = driver.findElement(DateTab);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(element2));
		element6.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element7 = driver.findElement(ScheduledStartDate);
		element7.sendKeys("09/10/2019 00:00:00");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element8 = driver.findElement(ScheduledEndDate);
		element8.sendKeys("16/10/2019 00:00:00");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element9 = driver.findElement(ActualStartDate);
		element9.sendKeys("10/10/2019 00:00:00");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element11 = driver.findElement(ActualEndDate);
		element11.sendKeys("17/10/2019 00:00:00");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element12 = driver.findElement(CustomTab);
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(element12));
		element12.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element13 = driver.findElement(PRITab);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.elementToBeClickable(element13));
		element13.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element14 = driver.findElement(Q1);
		element14.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element15 = driver.findElement(Q2);
		element15.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element16 = driver.findElement(Q3);
		element16.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element17 = driver.findElement(Q4);
		element17.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element18 = driver.findElement(Q5);
		element18.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element20 = driver.findElement(Save);
		element20.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(1500);
		
		/*Thread.sleep(100);
	String parentHandle1 = driver.getWindowHandle();
		
		Set<String> PopHandle1 = driver.getWindowHandles();
		Iterator<String> it1 = PopHandle1.iterator();
		String ChildHandle1 = "";
		while(it.hasNext())
		{   
		    if (it.next() != parentHandle1)
		    {   
		        ChildHandle1 = it1.next().toString();
		    }
		}
		Thread.sleep(1600);
		
		driver.switchTo().window(ChildHandle1);
		driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
		Thread.sleep(500);
		WebDriverWait wait5 = new WebDriverWait(driver,200);
		Thread.sleep(500);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn btn3d PopupBtn"))).sendKeys(Keys.ENTER);;
		Thread.sleep(500);
		driver.switchTo().window(parentHandle1);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element19 = driver.findElement(OkButton);
		element19.click();
		
		*/
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		WebElement element21 = driver.findElement(ChangeBodyID);
		Change_ID= element21.getText();
		//pattern = "^([\\w\\-]+)";
		Change_ID=Change_ID.substring(0, 15);
				
		System.out.println(Change_ID);
		Thread.sleep(15000);
		
				
			}
	
	public void SearchChange() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element4 = driver.findElement(ChangeID);
		element4.sendKeys(Change_ID);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement element5 = driver.findElement(SearchChangeBtn);
		element5.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	public void UpdateStatus() throws InterruptedException {
		WebElement element4=driver.findElement(Status);
		for (int i=0; i<1;i++) {
			String Bew=element4.getText();
			System.out.println(Bew);
		if(element4.getText()!="Planning In Progress") {
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
			WebElement element2 = driver.findElement(Refresh);
			WebDriverWait wait2 = new WebDriverWait(driver, 500);
			wait2.until(ExpectedConditions.elementToBeClickable(element2));
			element2.click();
			
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			WebElement element1 = driver.findElement(NextStage);
			WebDriverWait wait1 = new WebDriverWait(driver, 500);
			wait1.until(ExpectedConditions.elementToBeClickable(element1));
			element1.click();
			
			
		/*	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebElement element2 = driver.findElement(Refresh);
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.elementToBeClickable(element2));
			element2.click();*/
			
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			Thread.sleep(5000);
			
			System.out.println("Iteration  "+i);
			Thread.sleep(15000);
			//WebDriverWait wait3 = new WebDriverWait(driver, 10);
			//wait3.until(ExpectedConditions.elementToBeClickable(element7));
		}
		}
	}
	
	public void AddWI() throws InterruptedException {
		Thread.sleep(500);
		//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(WITab);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(element1));
		element1.click();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(WINotes);
		element2.sendKeys("WI Added");
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(WINotesBtn);
		element3.click();
		
		
	}

	public void RelateIncToProblem(String Pro)throws InterruptedException, IOException 
    {
		Thread.sleep(10000);
       By RelationTab= By.xpath("//*[@id='WIN_3_303868800']/div[2]/div[2]/div/dl/dd[4]/span[2]/a");
       By RelTypeList= By.xpath("//*[@id='WIN_3_301541300']/a");
       By SearchIcon=By.xpath("//*[@id='WIN_3_301905800']");
       By DatSearchTxt=By.xpath("//*[@id='arid_WIN_3_301737200']");
       //By CheckingRelate= By.xpath("//*[@id='WIN_3_301389439']/div[1]/table/tbody/tr/td[1]");
       driver.manage().timeouts().pageLoadTimeout(11, TimeUnit.SECONDS);
       Thread.sleep(5000);
       try
       {
       WebDriverWait wait = new WebDriverWait(driver,7);
       //WebElement CheckingBefore= driver.findElement(CheckingRelate);
         //    String before= CheckingBefore.getText();
    wait.until(ExpectedConditions.elementToBeClickable(RelationTab));
       WebElement RelationTabElm= driver.findElement(RelationTab);
       RelationTabElm.click();
       WebDriverWait wait1 = new WebDriverWait(driver,5);
       wait1.until(ExpectedConditions.elementToBeClickable(RelTypeList));
        WebElement RelTypeListElm= driver.findElement(RelTypeList);
        RelTypeListElm.click();
        RelTypeListElm.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        
        
        Thread.sleep(2000);
        WebElement SearchIconElm = driver.findElement(SearchIcon);
        SearchIconElm.click();
        Thread.sleep(10000);
       // driver.findElement(By.xpath("//*[@id='WIN_0_304253220']")).click();
        WebElement DatSearchTxtElm= driver.findElement(DatSearchTxt);
        DatSearchTxtElm.sendKeys(Pro);
        //Handling pop window
     // It will return the parent window name as a String
       
        String parentHandle = driver.getWindowHandle();
        Set<String> PopHandle = driver.getWindowHandles();
        Iterator<String> it = PopHandle.iterator();
        String ChildHandle = "";
        while(it.hasNext())
        {   
            if (it.next() != parentHandle)
            {   
                ChildHandle = it.next().toString();
                // because the new window will be the last one opened
                       driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
                       System.out.println("Chaild Window was opened.............");
            }
            }

        driver.switchTo().window(ChildHandle);
        driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);

                    //WebDriverWait waitobj = new WebDriverWait(driver,20);
               //waitobj.until(ExpectedConditions.visibilityOfElementLocated(RelateButt));
                     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                     WebElement SearchTxt= driver.findElement(By.id("arid_WIN_0_304252960"));
                     SearchTxt.sendKeys(Pro);
                     WebElement SearchBtn= driver.findElement(By.id("WIN_0_304252360"));
                     SearchBtn.click();
                     Thread.sleep(10000);
                       WebElement RelateButtElm= driver.findElement(By.id("WIN_0_301931500"));
                       RelateButtElm.click();
                       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
                       //Closing Popup finllay 
            driver.close();
        Thread.sleep(500);
        driver.switchTo().window(parentHandle); 
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
             // WebElement CheckingAfter= driver.findElement(CheckingRelate);
                 //   String After= CheckingAfter.getText();
                    //if (After!=before)
                    //{
                          System.out.println("CI is Realted successfully");
                         // ExcelUtil.WriteInExcel("Success  Realting Incident To Problem:  "+Pro);
                    /*}
                    else 
        */                
                         // Assert.fail("Problem was not Realted Please check an error manully");
       }
       catch(Exception E)
       {
             System.err.println("Relate Incident was failed for details check The Exception");
             E.printStackTrace();
       }
    }

}



