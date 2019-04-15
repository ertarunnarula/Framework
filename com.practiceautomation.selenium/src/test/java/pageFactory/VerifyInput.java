package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VerifyInput {
	
	WebDriver driver;
	
	@BeforeSuite
	public void Config() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/ertar/Documents/Work/Eclipse/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		opt.addArguments("--disable-extensions");
		driver = new ChromeDriver(opt);
		driver.get("http://www.seleniumeasy.com/test/");	
	}
	
	@Test (priority = 1)
	public void inputvalue() throws InterruptedException {
		
		Login inputsimple = PageFactory.initElements(driver, Login.class);
//		Login inputsimple = new Login(driver);
		inputsimple.input("Guess this worked just fine !!!! Yay I'm happy now !!!! Done with Page Factory");
		
	}
	

}
