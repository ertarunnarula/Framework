import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class updatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com");
//		Thread.sleep(2000);
////		driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[6]/div[2]")).click();
////		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
//		if (driver.findElement(By.id("divpaxinfo")).isEnabled()) {
//			
//			Actions act = new Actions(driver);
//			act.moveToElement(driver.findElement(By.id("divpaxinfo"))).click().build().perform();
//		
//		}
//		
//		else {
//			
//			Thread.sleep(10000);
//			Actions act = new Actions(driver);
//			act.moveToElement(driver.findElement(By.id("divpaxinfo"))).click().build().perform();
//			
//		}
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.id("divpaxinfo"))).click().build().perform();
//		
//		Thread.sleep(2000);
		
		driver.findElement(By.id("BE_flight_paxInfoBox")).click();
		
		
		for (int i=1; i<=4; i++) {
		driver.findElement(By.xpath("//span[@class='ddSpinnerPlus']")).click();
		}
		
		driver.findElement(By.xpath("//span[@class='done']")).click();
		String personCount = driver.findElement(By.id("BE_flight_paxInfoBox")).getText();
		System.out.println(personCount);
		
		
		
		
	}

}
