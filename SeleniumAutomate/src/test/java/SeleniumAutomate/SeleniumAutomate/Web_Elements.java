package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Elements {
	
	
	@Test
	public void RemoveElementFromTextBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("santosh@gmail.com");
		Thread.sleep(2000);
		
		String value = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");		
		System.out.println("Value present inside the text box is : " + value);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("againEntered Santosh");
		Thread.sleep(2000);
		driver.close();

	}
}
