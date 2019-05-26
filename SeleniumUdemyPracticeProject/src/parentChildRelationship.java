import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("Finally done");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys(Keys.ENTER
				);
//		driver.findElement(By.cssSelector("input[name='btnK']")).sendKeys(Keys.ENTER);;
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click();

	}

}
