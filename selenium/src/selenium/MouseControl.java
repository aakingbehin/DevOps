package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aakingbehin/Documents/aakingbehin/Research/Java/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick()
		.build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("TEST").doubleClick().build().
		perform();
		
		driver.get("https://myaccount.google.com/");
		//driver.navigate().to("https://myaccount.google.com/?pli=1");
		
		driver.findElement(By.xpath("//a[@class='VZLjze']")).click();
		
	}

}
