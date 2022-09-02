package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Interface_Method {
	
	@Test
	public void VerifyInstagram_GetLocationMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement unTB = driver.findElement(By.xpath("//input[@type='text']"));
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println(username_Ycordinate);
		WebElement pwdTB = driver.findElement(By.xpath("//input[@type='password']"));
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println(password_Ycordinate);
		if (username_Ycordinate == password_Ycordinate) {
			System.out.println("Both username and password fields are displayed in the same row");
		} else {
			System.out.println("username and password fields are NOT aligned in the same row");
		}
	}

}
