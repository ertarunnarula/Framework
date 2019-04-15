package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a") 
	@CacheLookup
	WebElement inputForm;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")
	@CacheLookup
	WebElement simpleForm;
	
	@FindBy(how=How.ID,using="user-message")
	@CacheLookup
	WebElement messageField;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"get-input\"]/button")
	@CacheLookup
	WebElement messageButton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"display\"]")
	@CacheLookup
	WebElement messageDisplay;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void input(String message) throws InterruptedException {
		inputForm.click();
		Thread.sleep(3000);
		simpleForm.click();
		Thread.sleep(3000);
		messageField.sendKeys(message);
		messageButton.click();
		String msg = messageDisplay.getText();
		System.out.println("The message is " + msg);
		
	}
}
