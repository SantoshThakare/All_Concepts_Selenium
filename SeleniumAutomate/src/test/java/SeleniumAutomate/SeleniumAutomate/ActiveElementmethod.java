package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActiveElementmethod {
	
	public static WebDriver driver;
	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	@Test
	public void remove_element_from_textbox() throws InterruptedException {
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("email")).sendKeys("santoshthakare@gmail.com");
		Thread.sleep(2000);

		String value = driver.findElement(By.id("email")).getAttribute("value");		
		System.out.println("Value present inside the text box is : " + value);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("againEntered Santosh");
		Thread.sleep(2000); 
		 driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		 driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a") ;
		 driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
		 Thread.sleep(2000);
				
		driver.close();

	}
	@Test
	public void print_tooltip_actitime_remembercheckbox() {
		
		driver.get("https://www.facebook.com/");
		WebElement Checkbox = driver.findElement(By.id("email"));
		String tooltipText = Checkbox.getAttribute("title");
		System.out.println(tooltipText);
//		driver.close();

	}
	@Test
	public void Checkbox_selectedornot() {
		
		driver.get("https://www.facebook.com/");

		WebElement KeepMeLogIN_Checkbox = driver.findElement(By.id("pass"));

		KeepMeLogIN_Checkbox.click();
	
		if (KeepMeLogIN_Checkbox.isSelected()) {
		System.out.println("Checkbox is selected");
		}else{
		System.out.println("Checkbox is NOT selected");
		}
		driver.close();
	}
}
