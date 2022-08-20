package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionTimeLink {
	@Test
	public void fb_automation() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("santoshthakare50@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("santoshth");	
		driver.findElement(By.id("pass")).clear();
		
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);

	}


}
