import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code
				//Invoke Google Chrome browser
				//Create driver Object
				//Invoke .exe file first
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\FirefoxDriver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
				driver.get("http://www.google.com");
				String title = driver.getTitle();
				System.out.println(title);

	}

}
