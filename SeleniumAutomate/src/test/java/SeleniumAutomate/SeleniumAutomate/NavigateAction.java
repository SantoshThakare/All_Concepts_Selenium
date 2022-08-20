package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateAction {

	@Test
	public void testlounchbrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("the title of the page is :" + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the URL of the page is :" + currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println("the source code of the page is :" + pageSource);
		Thread.sleep(2000);
		
		driver.navigate().to("https://twitter.com/");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
	}

}
