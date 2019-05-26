import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.xpath("//ul[@class='Bgzgmd']/li/a")).click();   //Click on Help option which opens in another tab

		System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();   //get all windows handles currently open
		
		Iterator<String> it = ids.iterator();   // iterate between those handles
		String parentID = it.next();   //first next moves control to parent window
		String childID = it.next();   //second next moves control to first child window and so on
		
		driver.switchTo().window(childID);   //move to desired child window
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);   //move back to parent window
		System.out.println(driver.getTitle());
		
	}

}
