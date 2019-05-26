import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//selenium code
		//Invoke Google Chrome browser
		//Create driver Object
		//Invoke .exe file first
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\InternetExplorerDriver\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);


	}

}
