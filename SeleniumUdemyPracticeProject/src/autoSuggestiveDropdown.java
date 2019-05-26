import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.skyscanner.com");
		
		WebElement source = driver.findElement(By.xpath("//input[@name='fsc-origin-search']"));
		// iT IS THE LATEST COMMIT
		source.click();
//		Thread.sleep(3000);
		source.sendKeys("del");
		source.sendKeys(Keys.ENTER);
		source.sendKeys(Keys.TAB);
		
		WebElement destination = driver.findElement(By.xpath("//input[@name='fsc-destination-search']"));
		
		destination.sendKeys("zur");
		for (int i=1;i<=4;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@name='class-travellers-trigger']")).click();
		
		Select cabinClass = new Select(driver.findElement(By.id("search-controls-cabin-class-dropdown")));
		cabinClass.selectByValue("Business");
		
		int i=1;
				while(i<=3) {
					driver.findElement(By.xpath("//button[@title='Increase number of adults']")).click();
					i++;
				}
				
		driver.findElement(By.xpath("//button[@class='bpk-link_bpk-link__3O7G1']")).click();
		
		
		
		
		
	}

}
