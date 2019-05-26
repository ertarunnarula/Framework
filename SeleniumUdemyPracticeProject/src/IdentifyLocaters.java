import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.get("http://www.facebook.com");
//			driver.findElement(By.id("email")).clear();
//			driver.findElement(By.id("email")).sendKeys("ertarunnarula");
//			driver.findElement(By.name("pass")).sendKeys("mega2lomaniac");
//			driver.findElement(By.linkText("Forgotten account?")).click();;
//			driver.findElement(By.id("u_0_2")).click();
			


			
			driver.get("http://login.salesforce.com");
//			driver.findElement(By.id("username")).sendKeys("practice");
//			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcdefgh");   //Create xpath for username
//			driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345678");   //Create xpath for password
			
//			driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abcdefgh");   //Create css for username
//			driver.findElement(By.cssSelector("input#username")).sendKeys("abcdefgh");   //Another way to create CSS
			driver.findElement(By.cssSelector("*[type='password']")).sendKeys("12345678");   //Create css for password
			
//			driver.findElement(By.name("pw")).sendKeys("12345678");
//			driver.findElement(By.xpath("//*[@id=\'Login\']")).click();;   //xpath
//			driver.findElement(By.cssSelector("#Login")).click();   //css
			driver.findElement(By.xpath("//input[@value='Log In']")).click();;   //Create xpath for Login button
			String ErrorMsg = driver.findElement(By.cssSelector("#error")).getText();
			System.out.println(ErrorMsg);
			driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
			
			
			
			
			

	}

}
