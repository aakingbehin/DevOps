package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/aakingbehin/Documents/aakingbehin/Research/Java/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentURL);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("akin");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		driver.quit();

	}

}
