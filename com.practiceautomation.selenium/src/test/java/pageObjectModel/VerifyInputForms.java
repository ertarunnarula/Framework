package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VerifyInputForms {
	
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
	
	
	@Test(priority = 1)
	public void VerifySimpleInput() throws InterruptedException {
		 
		Pages simpleInput = new Pages(driver);
		simpleInput.inputFormSelection("Guess, this worked!!!");
		
	}
	
	@Test(priority = 2)
	public void VerifyCheckBoxes() throws InterruptedException {
		
		Pages checkBox = new Pages(driver);
		checkBox.checkBoxSelection();
	
	}
	
	@Test(priority = 3)
	public void VerifyRadioButtons() throws InterruptedException {
		
		Pages radioButton = new Pages(driver);
		radioButton.radioButtonSelection();
		
	}
	
	
	@Test(priority = 4)
	public void VerifyDropDown() {
		
		Pages ddown = new Pages(driver);
		ddown.dropdownSelection();
	}
	
	
/*	@Test(priority = 5)
	public void VerifyInputSubmit() throws InterruptedException {
		
		Pages inputscanner = new Pages(driver);
		inputscanner.inputformsubmit();
	}
*/	
	@Test(priority = 6)
	public void VerifyAjaxForm() throws InterruptedException {
		
		Pages ajaxform = new Pages(driver);
		ajaxform.ajaxFormSubmission("Tarun", "Been doing this finally");
		
	}
	
	@Test(priority = 7)
	public void VerifyJQueryDD() throws InterruptedException {
		
		Pages jquerydd = new Pages(driver);
		jquerydd.jqueryDropDown();
	}
	
	
	
	
	
/*	@Test(priority = 99)
	public void KillInstance() {
		
		driver.quit();
		
	}
*/	
	
	
}
