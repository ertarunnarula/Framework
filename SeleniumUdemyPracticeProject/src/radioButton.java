import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		Thread.sleep(5000);
		
		int count = (driver.findElements(By.xpath("//input[@name='group1']"))).size();
		
//		for (int i=0;i<count;i++) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();
//		}
			
			for (int i=0;i<count;i++) {
				String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
				if (text.equals("Cheese")) {
					driver.findElement(By.xpath("//input[@name='group1']")).click();
				}
			}
		
		
		

	}

}
