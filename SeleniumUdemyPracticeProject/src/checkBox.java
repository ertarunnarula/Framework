import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class checkBox {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();   //Maximize Window
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.spicejet.com");   //Open URL
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();   //Click on Source City
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();   //Select Source City
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();   //Click on Destination City
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();   //Select Destination City
		
//		Thread.sleep(5000);
		
//		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		
		
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();   //Select highlighted date
		
		
		driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[2])[1]")).click();

//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());  //This will return true even if the field is diabled
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {   //So,instead we do this....check it's HTML
			
			System.out.println("It's Disabled");
			Assert.assertTrue(true);
			
		}
		
		else {
			
			Assert.assertTrue(false);
			
		}
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='divpaxinfo']")));   ///Explicit wait
		
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));   //Since getting error "Element not clickable at (x,y), so used Actions method
		
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
//		Thread.sleep(3000);
		
		for (int i=0; i<4; i++) {
			
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();   //Selected 4 passengers
			
		}
		
		driver.findElement(By.cssSelector("input[value='Done']")).click();   //Clicked on Done
		
		Select currencyDD = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));   //Selected Currency through static dropdown
		
		currencyDD.selectByValue("USD");  
		

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());   //AssertFalse that checkbox is not selected
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();   //Selected friends and family checkbox
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());   //AssertTrue that checkbox is selected
		
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();   //Get count of checkboxes on screen
		System.out.println(count);
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);   //Assert that the count is correct
	
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();   //click on Search button
		
		driver.findElement(By.id("popUpConverter")).click();
		
	}

}
