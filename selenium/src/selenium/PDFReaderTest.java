package selenium;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReaderTest {
	
	@Test
	public void readPDF() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/aakingbehin/Documents/aakingbehin/Research/Java/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/webfolder/technetwork/tutorials/tutorial/cloud/r13/wn/fin/financials-wn.pdf");
		String currentURL = driver.getCurrentUrl();

		URL url = new URL(currentURL);
		InputStream is = url.openStream();
		BufferedInputStream parseFile = new BufferedInputStream(is);
		PDDocument document = null;
		
		document = PDDocument.load(parseFile);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
		Assert.assertTrue(pdfContent.contains("CONTENTS"));
	}

}
