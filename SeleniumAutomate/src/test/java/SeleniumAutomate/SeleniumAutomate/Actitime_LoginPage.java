package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actitime_LoginPage {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
		@Test
	public void VerifyUNandPWDalignment() throws InterruptedException {
			

		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);						
		WebElement unTB = driver.findElement(By.id("email"));
		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height = unTB.getSize().getHeight();
		WebElement pwTB = driver.findElement(By.name("pass"));
		int pw_x = pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		if (un_x == pw_x && un_width == pw_width && un_height == pw_height)		
		{
		System.out.println("Username and password text box are aligned");
		} else 
		{
		System.out.println("Username and password text box are NOT aligned");
		}
		
		}
		
		@Test
		public void VerifyActime_UNandPassword_HeightandWidth() throws InterruptedException {
	
			driver.get("https://en-gb.facebook.com/");
			Thread.sleep(2000);	
			WebElement unTB = driver.findElement(By.id("email"));
			int username_height = unTB.getSize().getHeight();
			int username_width = unTB.getSize().getWidth();
			System.out.println(username_height);
			System.out.println(username_width);
			WebElement pwdTB = driver.findElement(By.name("pass"));
			int password_height = pwdTB.getSize().getHeight();
			int password_width = pwdTB.getSize().getWidth();
			System.out.println(password_height);
			System.out.println(password_width);
			if (username_height == password_height && username_width == password_width) 
			{
			System.out.println("Username and password fields are aligned");
			}
			else{
			System.out.println("Username and password fields are NOT aligned");
			}
			
			
		}
		
		@Test
		public void VerifyFB_Usernamefield_lessthanMobileNumberField() throws InterruptedException {
		
			driver.get("https://en-gb.facebook.com/");
			Thread.sleep(2000);	
			WebElement unTB = driver.findElement(By.id("email"));
			int username_width = unTB.getSize().getWidth();
			System.out.println(username_width);
			WebElement mobileNumTB = driver.findElement(By.xpath("//input[contains(@aria-label,'Email address or phone number')]"));
			int mobNumWidth = mobileNumTB.getSize().getWidth();
			System.out.println(mobNumWidth);
			if (username_width == mobNumWidth) 
			{
			System.out.println("Size of Both username and password fields are same  " + username_width+  " = " + mobNumWidth);
			}
			else
			{
			System.out.println("Size of username and password fields are NOT same that is : "
			+username_width+" Not equals to " + mobNumWidth);
			}
			}


}
