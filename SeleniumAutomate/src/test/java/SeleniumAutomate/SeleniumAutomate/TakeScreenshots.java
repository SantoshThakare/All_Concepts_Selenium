package SeleniumAutomate.SeleniumAutomate;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenshots {
	@Test
	public void screenshots() throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Browser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot tScreenshots = (TakesScreenshot) driver;
		File scrnFile = tScreenshots.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/"+"facebook"+".png");
		FileHandler.copy(scrnFile, destFile);
		Thread.sleep(2000);
		driver.close();
				
	}

}
