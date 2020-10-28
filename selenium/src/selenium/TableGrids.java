package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class TableGrids {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aakingbehin/Documents/aakingbehin/Research/Java/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		String title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentURL);
		
		driver.findElement(By.xpath("//nav[@class='cb-mat-mnu'] //a[contains(@title,'Rajasthan Royals')]")).click();
		driver.findElement(By.xpath("//nav[@class='cb-nav-bar'] //a[contains(@title,'Match Scorecard')]")).click();
		
		WebElement table = driver.findElement(By.xpath("//div[contains(@class,'cb-col cb-col-100 cb-ltst-wgt-hdr')]"));
		int rowCount = table.findElements(By.xpath("//div[contains(@class,'cb-col cb-col-100 cb-scrd-itms')]")).size();
		System.out.println(rowCount);
		
		//int table.findElement(By.xpath("//div[contains(@class,'cb-col cb-col-100 cb-scrd-itms')]/following-sibling::div[3]"));		
		
		//List<WebElement> tableContent = table.findElements(By.xpath("//div[contains(@class,'cb-col cb-col-100 cb-scrd-hdr-rw')]"));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/aakingbehin/Desktop"));
		
	}

}
