package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class ChromeDemo{

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/aakingbehin/Documents/aakingbehin/Research/Java/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
		System.out.println(title);
		System.out.println(currentUrl);
		
		//select drop down - static drop down
		//Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		//s.selectByValue("USD");
		//s.selectByIndex(1);
		//s.selectByVisibleText("AED");
		
		//input drop down - dynamic drop down
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).click();
	}
}