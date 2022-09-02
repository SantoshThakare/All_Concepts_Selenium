package SeleniumAutomate.SeleniumAutomate;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Waits_Explicity_and_Implicity {
	public static WebDriver driver;
	
	@BeforeTest
	public void browserlaunch() {		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");

	}
	
	@Test
	public void implicity_waits() {
		
		driver.findElement(By.name("email")).sendKeys("9623500474");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("pass")).sendKeys("santosh@12");
		
		driver.findElement(By.cssSelector("button[name = \"login\"]")).click();

		driver.close();		
	}
	
	@Test
	public void explicity_waits() {
		
		driver.findElement(By.name("email")).sendKeys("9623500474");
		
//		WebDriverWait waits = new WebDriverWait(driver, 20);
//		WebElement element = waits.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		
		driver.findElement(By.id("pass")).sendKeys("santosh@12");
		
		driver.findElement(By.xpath("button[name = \"login\"]")).click();
		
	}

}
