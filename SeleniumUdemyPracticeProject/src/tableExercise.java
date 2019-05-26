import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22483/srh-vs-kxip-48th-match-indian-premier-league-2019");
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22501/nor-vs-pak-2nd-practice-match-pakistan-tour-of-uk-practice-matches-2019");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).size();
		
		int total2 = 0;
		for (int i=1; i<count; i++) {
			String total1 = table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
//			System.out.println(total1);
			int total = Integer.parseInt(total1)+total2;
//			System.out.println(total);
			total2 = total;
			System.out.println(total2);
		}
		
		String extras = driver.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		
		int TeamTotal = Integer.parseInt(extras) + total2;
		System.out.println(TeamTotal);
		
		String score = driver.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
		
		if ((Integer.parseInt(score) == TeamTotal)) {
			
			System.out.println("Correct Score Predicted");
			
		}
	}

}


