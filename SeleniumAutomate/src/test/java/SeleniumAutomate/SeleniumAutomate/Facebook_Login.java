package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook_Login {

	@Test
	public void fb_automation() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("9623500474");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("santosh@12");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[name = \"login\"]")).click();
		Thread.sleep(2000);
		
		String Expected =  "The password that you've entered is incorrect. Forgotten password?";
		
		WebElement login =  driver.findElement(By.className("_9ay7"));
		
		String Actual = login.getText();
		Assert.assertEquals(Expected, Actual);
		
		
//		driver.findElement(By.name("login")).click();
 
//		driver.findElement(By.id("pass")).clear();
		
//		driver.close();
	}
}
