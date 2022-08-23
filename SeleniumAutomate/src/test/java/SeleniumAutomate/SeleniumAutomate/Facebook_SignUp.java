package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_SignUp {
	
	@Test
	public void signUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Roshni");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Thakare");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("thakareg@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("thakareg@gmail.com");
		Thread.sleep(3000);
//		driver.findElement(By.name("reg_passwd__")).sendKeys("santosh");
//		Thread.sleep(3000);
		driver.findElement(By.id("password_step_input")).sendKeys("santosh");
		Thread.sleep(3000);	
		driver.findElement(By.id("day")).sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("May");
		Thread.sleep(3000);
		driver.findElement(By.id("year")).sendKeys("1999");
		Thread.sleep(3000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.name("sex")).get(2).click();
//		Thread.sleep(3000);

//		driver.findElement(By.xpath("//label[contents(text),'Male]")).click();
//		Thread.sleep(3000);
		
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);

//		driver.close();


	}
}
