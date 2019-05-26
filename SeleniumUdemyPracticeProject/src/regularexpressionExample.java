import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regularexpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
//		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("abcdefgh");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[name*='proceed']")).click();
		
		
		
		

	}

}
