import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderUI {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.path2usa.com/travel-companions");
		
		driver.manage().window().maximize();
		
		//23rd June 2019
		//Grab common attribute   //Put into the list   //Iterate
		
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("March 2020"))
			
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		Thread.sleep(2000);
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int dateCount = driver.findElements(By.className("day")).size();
		
		for (int i=0;i<dateCount;i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equals("25")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
