package pageObjectModel;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

// This class will store all locators and methods for a particular page

public class Pages {
	
	WebDriver driver;
	
	//The following properties are for Simple Input Form

	By inputForm = By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a");
	By simpleForm = By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a");
	By messageField = By.id("user-message");
	By messageButton = By.xpath("//*[@id=\"get-input\"]/button");
	By messageDisplay = By.xpath("//*[@id=\"display\"]");
	
	
	// The following properties are for Checkboxes
	
	By inputFormTree = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a");
	By checkboxOption = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[2]/a");
	By singleCheckbox = By.id("isAgeSelected");
	By checkAll = By.id("check1");
	By checkmsg = By.xpath("//*[@id=\"txtAge\"]");
	
	
	// The following properties are for Radio Buttons
	
	By radioButton = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]/a");
	By maleOption = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input");
	By femaleOption = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input");
	By getCheckedValue = By.id("buttoncheck");
	By radioSelectMessage = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");
	By sexMale = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input");
	By sexFemale = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input");
	By ageGroup = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input");
	By getValues = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");
	By getValuesMsg = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]");
	
	
	//The following properties are for DropDown list
	
	By dropDownOption = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[4]/a");
	By dropDownSingle = By.id("select-demo");
	By dropDownSingleMsg = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]");
	By multipleselect = By.id("multi-select");
	By getAllSelected = By.id("printAll");
	By multiselectmsg = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]");
	
	
	// The following properties are for Input Form Submit
	
	By inputFormSubmit = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[5]/a");
	By firstname = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input");
	By lastname = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input");
	By email = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input");
	By phoneNo = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input");
	By address = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input");
	By city = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input");
	By state = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select");
	By zipCode = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input");
	By website = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input");
	By hostingradioNo = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label/input");
	By projectDescription = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea");
	By sendbtn = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button");
	
	
	//The following properties are for AJAX Form submit
	
	By ajaxFormSubmit = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[6]/a");
	By ajaxName = By.id("title");
	By ajaxComment = By.id("description");
	By ajaxSubmit = By.id("btn-submit");
	By ajaxSubmitMsg = By.id("submit-control");
	
	
	//The following properties are for jQueryDropDown list
	
	By jqueryselectoption = By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[7]/a");
	By jquerysearchdd = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span");
	By jquerysearchstring = By.xpath("/html/body/span/span/span[1]/input");
	By jquerymultisearch = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input");
	By jquerydisableddd = By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/span/span[1]/span/span[2]");
	By jquerydiablesearchstring = By.xpath("/html/body/span/span/span[1]/input");
	By ddcategoryoption = By.xpath("//*[@id=\"files\"]");
	
	
	
	
	public Pages(WebDriver driver) {
		this.driver = driver;
			
	}
	
	public void inputFormSelection(String message) throws InterruptedException {
		driver.findElement(inputForm).click();
		Thread.sleep(3000);
		driver.findElement(simpleForm).click();
		Thread.sleep(3000);
		driver.findElement(messageField).sendKeys(message);
		driver.findElement(messageButton).click();
		String msg = driver.findElement(messageDisplay).getText();
		System.out.println("The entered message is " + msg);
		
	}
	
	public void checkBoxSelection() throws InterruptedException {
		driver.findElement(inputFormTree).click();
		driver.findElement(checkboxOption).click();
		Thread.sleep(3000);
		driver.findElement(singleCheckbox).click();
		String checkBoxMessage = driver.findElement(checkmsg).getText();
		System.out.println(checkBoxMessage);
		Thread.sleep(3000);
		driver.findElement(checkAll).click();
		Thread.sleep(2000);
		String checkStatus = driver.findElement(checkAll).getAttribute("value");
		System.out.println(checkStatus);
		
		if  (checkStatus.equals("Uncheck All")) {
			System.out.println("All the checkboxes are checked already");
		}
		else {
			System.out.println("All the checkboxes are unchecked");
		}
		
	}
	
	
	public void radioButtonSelection() throws InterruptedException {
		driver.findElement(inputFormTree).click();
		driver.findElement(radioButton).click();
		driver.findElement(maleOption).click();
		driver.findElement(getCheckedValue).click();
		Thread.sleep(2000);
		String RadioMessage = driver.findElement(radioSelectMessage).getText();
		System.out.println(RadioMessage);
		driver.findElement(sexMale).click();
		driver.findElement(ageGroup).click();
		driver.findElement(getValues).click();
		String GroupRadioMsg = driver.findElement(getValuesMsg).getText();
		System.out.println(GroupRadioMsg);
		
	}
	
	public void dropdownSelection() {
		driver.findElement(inputFormTree).click();
		driver.findElement(dropDownOption).click();
		
		Select dropdown = new Select(driver.findElement(dropDownSingle));
		dropdown.selectByVisibleText("Wednesday");
		String dropsinglemsg = driver.findElement(dropDownSingleMsg).getText();
		System.out.println(dropsinglemsg);
		
		Select multiselect = new Select(driver.findElement(multipleselect));
		multiselect.selectByVisibleText("Texas");
		multiselect.selectByVisibleText("Ohio");
		multiselect.selectByVisibleText("Florida");
		multiselect.selectByVisibleText("California");
		
		driver.findElement(getAllSelected).click();
		String multimsg = driver.findElement(multiselectmsg).getText();
		System.out.println(multimsg);
		
	}
	
	public void inputformsubmit() throws InterruptedException {
		driver.findElement(inputFormTree).click();
		driver.findElement(inputFormSubmit).click();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First name");
		String fname = scan.nextLine();
		driver.findElement(firstname).sendKeys(fname);
		System.out.println("Enter last name");
		String lname = scan.nextLine();
		driver.findElement(lastname).sendKeys(lname);
		System.out.println("Enter email address");
		String emailadd = scan.nextLine();
		driver.findElement(email).sendKeys(emailadd);
		Thread.sleep(2000);
		System.out.println("Enter address");
		String land = scan.nextLine();
		driver.findElement(address).sendKeys(land);
//		Thread.sleep(2000);
		System.out.println("Enter the city");
		String hometown = scan.nextLine();
		driver.findElement(city).sendKeys(hometown);
		System.out.println("Enter the website name");
		String web = scan.nextLine();
		driver.findElement(website).sendKeys(web);
		Thread.sleep(2000);
		System.out.println("Enter Project Description");
		String project = scan.nextLine();
		driver.findElement(projectDescription).sendKeys(project);
		
		System.out.println("Enter Mobile Number");
		long contact = scan.nextLong();
		String strLong = Long.toString(contact);
//		System.out.println("The mobile number is " + contact);
		driver.findElement(phoneNo).sendKeys(strLong);
		Thread.sleep(3000);
		System.out.println("Enter zip code");
		long zip = scan.nextLong();
		String strLongZip = Long.toString(zip);
		driver.findElement(zipCode).sendKeys(strLongZip);
		
		
		Select dropdownstate = new Select(driver.findElement(state));
		dropdownstate.selectByVisibleText("Florida");
		
		
		driver.findElement(hostingradioNo).click();
		Thread.sleep(2000);
		
		
		driver.findElement(sendbtn).click();
			
		}	
	
	
	public void ajaxFormSubmission(String name, String comment) throws InterruptedException {
		driver.findElement(inputFormTree).click();
		driver.findElement(ajaxFormSubmit).click();
		Thread.sleep(2000);
		driver.findElement(ajaxName).sendKeys(name);
		driver.findElement(ajaxComment).sendKeys(comment);
		driver.findElement(ajaxSubmit).click();
		Thread.sleep(6000);
		String ajaxMsg = driver.findElement(ajaxSubmitMsg).getText();
		System.out.println(ajaxMsg);
		
	}
	
	public void jqueryDropDown() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.findElement(inputFormTree).click();
		driver.findElement(jqueryselectoption).click();
		Thread.sleep(2000);
		driver.findElement(jquerysearchdd).click();
		Thread.sleep(2000);
		driver.findElement(jquerysearchstring).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(jquerysearchstring).sendKeys(Keys.ENTER);
		driver.findElement(jquerymultisearch).sendKeys("Arkansas");
		driver.findElement(jquerymultisearch).sendKeys(Keys.ENTER);
		driver.findElement(jquerymultisearch).sendKeys("Ohio");
		driver.findElement(jquerymultisearch).sendKeys(Keys.ENTER);
		driver.findElement(jquerymultisearch).sendKeys("Washington");
		driver.findElement(jquerymultisearch).sendKeys(Keys.ENTER);
		driver.findElement(jquerymultisearch).sendKeys("Colorado");
		driver.findElement(jquerymultisearch).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.presenceOfElementLocated(jquerydisableddd)).click();
		driver.findElement(jquerydisableddd).click();
		driver.findElement(jquerydiablesearchstring).sendKeys("Virgin Islands");
		driver.findElement(jquerydiablesearchstring).sendKeys(Keys.ENTER);
		
		Select drop = new Select(driver.findElement(ddcategoryoption));
		drop.selectByVisibleText("Java");
		Thread.sleep(2000);
	}
	
	
}
 



