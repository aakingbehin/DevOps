package selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

class ChromeDemo{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aakingbehin/Documents/aakingbehin/Research/Java/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		String title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentURL);
		
		Thread.sleep(2000);
		Select element = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		element.selectByValue("GBP");
		//element.selectByIndex(4);
		//element.selectByVisibleText("AED");
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		element = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		element.selectByIndex(4);
		
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")).click();
		element = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		element.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Calendar UI
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		
		//working with radio buttons and checking if an element is active or not
		//boolean able = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled();
		//System.out.println(able);
		String elementAttribute = driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
		System.out.println(elementAttribute);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		elementAttribute = driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
		System.out.println(elementAttribute);
		
		if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
	}
}