package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableTestCases {
	
	WebDriver driver;
	
	//This is the first commit
	
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
	public void tablePaginationTest() throws InterruptedException {
	
		TableValues table1 = PageFactory.initElements(driver, TableValues.class);
		table1.nextPage();
		System.out.println("This test ends here");
		
	}
	
	@Test(priority=2)
	public void tableSearchBarTest() throws InterruptedException {
		
		TableValues table2 = PageFactory.initElements(driver, TableValues.class);
		table2.tablesearch();
		System.out.println("The table search test case no. 1 ends here");
		
	}
	
	@Test(priority=3)
	public void tableFilterTest() {
		TableValues table3 = PageFactory.initElements(driver, TableValues.class);
		table3.tableFilter();
		System.out.println("The table search test case no. 2 ends here");
		
	}
	
	@Test(priority=4)
	public void tablefilterColorTest() throws InterruptedException {
		TableValues table4 = PageFactory.initElements(driver, TableValues.class);
		table4.tableColorFilter();
		System.out.println("The table color filter test ends here");
		
	}
	
	@Test(priority=5)
	public void tableSortTest() {
		TableValues table5 = PageFactory.initElements(driver, TableValues.class);
		table5.tableSort();
		System.out.println("Finally sorted the table values");
	}
}
