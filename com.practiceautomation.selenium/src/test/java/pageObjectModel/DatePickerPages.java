package pageObjectModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickerPages {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/ertar/Documents/Work/Eclipse/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		opt.addArguments("--disable-extensions");
		driver = new ChromeDriver(opt);
		driver.get("http://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]/div/span")).click();
		
		//This is for date range
		
		By FromDate = By.xpath("//*[@id=\"datepicker\"]/input[1]");
		By ToDate = By.xpath("//*[@id=\"datepicker\"]/input[2]");
		
		
		
		String date = "10-April 2018";
		String splitter[] = date.split("-");
		String monthYear = splitter[1];
		String day = splitter[0];
		
		List<WebElement> elements = driver.findElements(By.xpath(".//div[@class='datepicker-days']/table[@class='table-condensed']/thead/tr/th[@class='datepicker-switch']"));
//		List<WebElement> days = driver.findElements(By.xpath(".//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr/td[@class='day']"));
		
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
			
			if (elements.get(i).getText().equals(monthYear)) {
				List<WebElement> days = driver.findElements(By.xpath(".//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr/td[@class='day']"));
				for (WebElement d:days) {
					System.out.println(d.getText());
					if (d.getText().equals(day)) {
						d.click();
						break;
					}
					
					
				}
				
				
			}
//			break;
		}
		
		Thread.sleep(5000);
		
		driver.findElement(FromDate).click();
		String fromDate = "10-April 2018";
		String splitterFrom[] = fromDate.split("-");
		String monthyear1 = splitterFrom[1];
		String dayFrom = splitterFrom[0];
		System.out.println("Reached Here");
		List<WebElement> elementsFrom = driver.findElements(By.xpath(".//div[@class='datepicker-days']/table[@class='table-condensed']/thead/tr/th[@class='datepicker-switch']"));
		for (int j=0; j < elementsFrom.size(); j++) {
			System.out.println(elementsFrom.get(j).getText());
			if (elementsFrom.get(j).getText().equals(monthyear1)) {
				
				List<WebElement> elementsFromDays = driver.findElements(By.xpath(".//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr/td[@class='day']"));
				for (WebElement fromDays : elementsFromDays) {
					System.out.println(fromDays.getText());
					if (fromDays.getText().equals(dayFrom) ) {
						fromDays.click();
						break;
					}
					
				}
				
				
				
			}
//			break;
		}
		
		driver.findElement(ToDate).click();
		String endDate = "20-April 2018";
		String splitterTo[] = endDate.split("-");
		String monthyear2 = splitterTo[1];
		String dayTo = splitterTo[0];
		
		List<WebElement> elementsTo = driver.findElements(By.xpath(".//div[@class='datepicker-days']/table[@class='table-condensed']/thead/tr/th[@class='datepicker-switch']"));
		for (int k=0; k < elementsTo.size(); k++) {
			System.out.println(elementsTo.get(k).getText());
			if (elementsTo.get(k).getText().equals(monthyear2)) {
				
				List<WebElement> elementsToDays = driver.findElements(By.xpath(".//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr/td[@class='day']"));
				for (WebElement toDays : elementsToDays) {
					System.out.println(toDays.getText());
					if (toDays.getText().equals(dayTo) ) {
						toDays.click();
						break;
					}
				
				}
				
				
			}
//			break;
		}
		
		
	}
	

}
