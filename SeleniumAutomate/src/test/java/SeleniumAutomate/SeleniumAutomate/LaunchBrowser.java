package SeleniumAutomate.SeleniumAutomate;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	public static WebDriver driver;
	public String WebsiteURL = "https://en-gb.facebook.com/";
	
	@SuppressWarnings("deprecation")
	@Test
	public void selection() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("select the browsers:\n 1.chromeBrowser\n 2.edgeBrowser\n 3.OperaBrowser");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(WebsiteURL);
			driver.close();
			break;
			
		case 2:
		
			System.setProperty("webdriver.edge.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\msedgedriver.exe");
		
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(WebsiteURL);
			driver.close();

			break;
		case 3: 
			System.setProperty("webdriver.opera.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\operadriver.exe");
			
			driver = new OperaDriver();
			driver.manage().window().maximize();
			driver.get(WebsiteURL);
			driver.close();

			break;
	
			}

		}		

}
