package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_CSS_selector {
	
	@Test
	public void facebookCSS() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Santosh");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Thakare");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("santoshthakare500@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("santoshthakare500@gmail.com");
		Thread.sleep(3000);
	
		driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("Abcd@123");
		Thread.sleep(3000);
		
	
//		driver.findElement(By.cssSelector("label[for='u_2_5_SN']")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("select[class='_9407 _5dba _9hk6 _8esg'][id='day']")).sendKeys("16");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#month")).sendKeys("May");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("select[class='_9407 _5dba _9hk6 _8esg'][id='year']")).sendKeys("2002");
		Thread.sleep(3000);
		driver.findElements(By.name("sex")).get(1).click();
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[id='u_2_5_SN']"));
//		Thread.sleep(3000);
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
