package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingUniqueElement {
	@Test
	public void home_page_unique() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("9623500474");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("Santosh@9623");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
//		
//		WebElement logoutBtn = driver.findElement(By.xpath(""));
//		if (logoutBtn.isDisplayed()) {
//		System.out.println("Home page is displayed");
//		} else{
//		System.out.println("Home page is NOT displayed");
//		}

	}
}
