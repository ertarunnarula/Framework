package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TableValues {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"treemenu\"]/li/ul/li[3]/a")
	WebElement tableOption;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[1]/a")
	WebElement tablePagination;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/p[1]")
	WebElement tableInfo;
	
	@FindBy(xpath="//*[@id=\"myPager\"]/li[2]/a")
	WebElement pageOne;
	
	@FindBy(xpath="//*[@id=\"myPager\"]/li[3]/a")
	WebElement pageTwo;
	
	@FindBy(xpath="//*[@id=\"myPager\"]/li[4]/a")
	WebElement pageThree;
	
	public TableValues() {
		this.driver = driver;
		
	}

	public void nextPage() throws InterruptedException {
		tableOption.click();
		Thread.sleep(2000);
		tablePagination.click();
		Thread.sleep(2000);
		String tableInformation = tableInfo.getText();
		System.out.println(tableInformation);
		if (pageOne.isEnabled()) {
			System.out.println("Page 1 is already selected");
			Thread.sleep(2000);
			pageTwo.click();
			System.out.println("Now selected page 2");
			Thread.sleep(2000);
		}
		else {
			pageThree.click();
			System.out.println("Selected Page 3 as we need to move forward");
			Thread.sleep(2000);
		}	
		
	}
	
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[2]/a")
	WebElement tableDataSearchOption;
	
	@FindBy(id="task-table-filter")
	WebElement tableSearchBar;
	
	@FindBy(xpath="//*[@id=\"task-table\"]/tbody/tr[4]/td[3]")
	WebElement assignee;
	
	public void tablesearch() throws InterruptedException {
		tableOption.click();
		tableDataSearchOption.click();
		Thread.sleep(2000);
		tableSearchBar.click();
		tableSearchBar.sendKeys("Emily John");
		String assigneeName=assignee.getText();
		if (assigneeName.equals("Emily John")) {
			System.out.println("We've found the correct match");
		}
		else {
			System.out.println("Option not present");
		}
		
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/button")
	WebElement filterButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[1]/input")
	WebElement serialNum;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[2]/input")
	WebElement userName;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[3]/input")
	WebElement fName;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[4]/input")
	WebElement lName;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[4]/td[3]")
	WebElement nameResult;
	
	
	public void tableFilter() {
		filterButton.click();
		serialNum.click();
		serialNum.sendKeys("4");
		userName.sendKeys("mikesali");
		fName.sendKeys("Byron");
		lName.sendKeys("Kathaniko");
		if (nameResult.equals("Byron")) {
			System.out.println("The search result is correct.....Yay");
		}
		else {
			System.out.println("God!!! It'll be a long night");
		}
	}
	
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[3]/a")
	WebElement tableFilterOption;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/p")
	WebElement headingMsg;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[1]")
	WebElement green;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[2]")
	WebElement orange;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[3]")
	WebElement red;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[4]")
	WebElement allOptions;
	
//	@FindBy(xpath="/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/div/div/h4/span")
	@FindBy(how=How.CSS,using="body > div.container-fluid.text-center > div > div.col-sm-7.text-left > section > div > div > div.panel-body > div.table-container > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > div > h4 > span")
	WebElement greenRecord;
	
//	@FindBy(xpath="/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/div/div/h4/span")
	@FindBy(how=How.CSS,using="body > div.container-fluid.text-center > div > div.col-sm-7.text-left > section > div > div > div.panel-body > div.table-container > table > tbody > tr:nth-child(2) > td:nth-child(3) > div > div > h4 > span")
	WebElement orangeRecord;
	
//	@FindBy(xpath="/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/div/div/h4/span")
	@FindBy(how=How.CSS,using="body > div.container-fluid.text-center > div > div.col-sm-7.text-left > section > div > div > div.panel-body > div.table-container > table > tbody > tr:nth-child(3) > td:nth-child(3) > div > div > h4 > span")
	WebElement redRecord;
	
	public void tableColorFilter() throws InterruptedException {
		tableOption.click();
		tableFilterOption.click();
		String heading = headingMsg.getText();
		System.out.println(heading);
		green.click();
		Thread.sleep(2000);
		String RecordText1 = greenRecord.getText();
		System.out.println(RecordText1);
		if (RecordText1.equals("(Green)")) {
			System.out.println("Green Records are displayed");
		}
		else {
			System.out.println("Please check your filtered results");
		}
		orange.click();
		Thread.sleep(2000);
		String RecordText2 = orangeRecord.getText();
		System.out.println(RecordText2);
		if(RecordText2.equals("(Orange)")) {
			System.out.println("Orange records are displayed");
		}
		else {
			System.out.println("Please check your filtered results");
		}
		red.click();
		Thread.sleep(2000);
		String RecordText3 = redRecord.getText();
		System.out.println(RecordText3);
		if(RecordText3.equals("(Red)")) {
			System.out.println("Red records are displayed");
		}
		else {
			System.out.println("Please check your filtered results");
		}
		Thread.sleep(2000);
		allOptions.click();
		System.out.println("All options are selected at the moment");
	}
	
	
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[4]/a")
	WebElement tableSortOption;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/h2")
	WebElement tableHeader;
	
	@FindBy(xpath="//*[@id=\"example_filter\"]/label/input")
	WebElement searchSortBar;
	
	@FindBy(xpath="//*[@id=\"example\"]/thead/tr/th[1]")
	WebElement sort;
	
	@FindBy(xpath="//*[@id=\"example\"]/tbody/tr[1]/td[1]")
	WebElement sortedName;
	
	public void tableSort() {
		tableOption.click();
		tableSortOption.click();
		String header = tableHeader.getText();
		System.out.println(header);
		searchSortBar.click();
		searchSortBar.sendKeys("Software");
		sort.click();
		String empName = sortedName.getText();
		System.out.println(empName);
		if (empName.equalsIgnoreCase("S. Frost")) {
			System.out.println("The search results have been sorted in descending order");
		}
	}
	
}
