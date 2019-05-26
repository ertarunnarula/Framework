import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		// Get count of links in the page   ::Hint - Every link has the anchor tag
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(driver.findElements(By.tagName("a")).size());   //Counts the no. of links in page
		
		System.out.println(driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a")).size());   ///Limiting WebDriver Scope  ::Links only in Footer
		
		WebElement firstColumn = footer.findElement(By.xpath("//table/tbody/tr/td/ul"));
		
		System.out.println(firstColumn.findElements(By.tagName("a")).size()); //Get links in first column
		
		int count = firstColumn.findElements(By.tagName("a")).size();;
		
		for (int i=1; i < count; i++) {
//			firstColumn.findElements(By.tagName("a")).get(i).click();
			
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		}   //Opens all the tabs
		
		
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}   //Moves to every tab and gets title
			
			
		
	

	}

}
