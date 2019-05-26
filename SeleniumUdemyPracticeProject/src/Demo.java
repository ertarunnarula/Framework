import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//selenium code
		//Invoke Google Chrome browser
		//Create driver Object
		//Invoke .exe file first
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");   //Hit URL on browser
		String title = driver.getTitle();   //Get page title
		System.out.println(title);
		String URL = driver.getCurrentUrl();   //Get current URL
		System.out.println(URL);
//		System.out.println(driver.getPageSource());   //Get page source
		driver.get("http://yahoo.com");   //Navigate to another site
		driver.navigate().back();   //Move back to 1st site
		driver.navigate().forward();   //Move back to 2nd site
		
		
		
		
		Thread.sleep(5000);
		driver.close();   //Closes current chrome window
		driver.quit();   //Closes all windows of chrome

		
	}

}
