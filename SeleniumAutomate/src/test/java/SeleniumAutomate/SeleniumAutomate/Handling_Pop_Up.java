package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handling_Pop_Up {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		

	}
	@Test
	public void alert_pop_up() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		
	}
	@Test
	public void confirmation_pop_up() throws InterruptedException {
		
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		
		Alert alert = driver.switchTo().alert();  
		Thread.sleep(2000);

		alert.accept();
		driver.close();

	}
	@Test
	public void promt_pop_up() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Santosh");
		alert.dismiss();
		driver.close();
		
	}
	@Test
	public void hidden_div_pop_up() throws InterruptedException {
		driver.navigate().to("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[local-name()='svg' and @fill=\"none\" and @class =\" c-pointer c-neutral-900\"]/*[local-name()='path']")).click();
		driver.findElement(By.xpath("//*[local-name()='svg' and @class=\"t-all ml-2\"]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Wed, Sep 14')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("14")).click();
		
	}	
}
