package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	public static WebDriver driver;
	public String WebsiteURL = "https://en-gb.facebook.com/";
	@Test
	public void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(WebsiteURL);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println("window handle" + driver.getWindowHandle());
	}
	@Test
	public void edgeBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(WebsiteURL);
		System.out.println(driver.getTitle());
	}

}
