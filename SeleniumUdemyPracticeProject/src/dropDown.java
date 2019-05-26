import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");   //Hit URL on browser
		
		Select dropDown = new Select(driver.findElement(By.id("select-demo")));
		dropDown.selectByValue("Wednesday");
		dropDown.selectByVisibleText("Friday");
		
		Select multiDD = new Select(driver.findElement(By.id("multi-select")));
		multiDD.selectByValue("Florida");
		driver.findElement(By.id("printMe")).click();
		String msg = driver.findElement(By.xpath("//*[@class='getall-selected']")).getText();
		System.out.println(msg);
		
	}

}
