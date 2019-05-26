import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronisationImplicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.alaskaair.com/hotels/mp/home/en/?t=1556051173543&utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-homepage-bookingformlet-hotelstab-Q12019-home-tr");
		driver.findElement(By.cssSelector("input[name='Location']")).sendKeys("nyc");
		driver.findElement(By.cssSelector("input[name='Location']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//butoon[@type='submit']")).click();

	}

}
