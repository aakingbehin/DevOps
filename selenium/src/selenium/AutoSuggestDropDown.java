package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AutoSuggestDropDown{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aakingbehin/Documents/aakingbehin/Research/Java/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentURL);
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> menuOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		int numofElements = menuOptions.size();
		System.out.println(numofElements);
		
		for(WebElement menuOption: menuOptions) {
			if(menuOption.getText().equalsIgnoreCase("India")){
				menuOption.click();
				break;
			}
				
		}
		
		int numbElements = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(numbElements);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click(); 
		
	}
}