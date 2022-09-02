package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScript_Executor_Concepts {
public static WebDriver driver;
	
	@BeforeTest
	public void launchrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void enter_text_intoDisabledTextbox() throws InterruptedException {
		driver.get("file:///C:/Users/Shree/Desktop/Disabled_Text_Box_Prog.html");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value='manager'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').type='button'");
		
		}
	@Test
	public void scroll_up_and_down() throws InterruptedException {
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1000);
		}
		for (int i = 1; i < 10; i++) {
		js.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(1000);
		}
		driver.close();
		
	}
	@Test
	public void scroll_up_and_down_to_specific_element_on_webpage() throws InterruptedException {
		
		driver.get("http://seleniumhq.org/download");
		driver.findElement(By.className("close")).click();
		WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
		Thread.sleep(3000);

		
	}

	@Test
	public void navigate_to_bottom_of_the_page() throws InterruptedException {
		driver.get("http://www.seleniumhq.org/download/");
//		
//		driver.findElement(By.className("close")).click();
//		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("/html/body/div/footer"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		element.click();
	}

	

}



