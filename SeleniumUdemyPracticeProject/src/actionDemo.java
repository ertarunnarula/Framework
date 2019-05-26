import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(move).build().perform();   //MouseHover over an element
		
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("wow biotin").doubleClick().build().perform();   //Enter anything in capital letters
		
		action.moveToElement(move).contextClick().build().perform();   //Right Click

	}

}
