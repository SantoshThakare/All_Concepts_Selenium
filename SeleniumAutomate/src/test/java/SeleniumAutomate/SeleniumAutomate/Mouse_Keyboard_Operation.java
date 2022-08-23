package SeleniumAutomate.SeleniumAutomate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mouse_Keyboard_Operation {
	

	@Test	
	public void  mouse_keyboard() throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Browser\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Robot robot = new Robot();
			driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		Thread.sleep(3000);
		robot.mouseMove(830, 300);
		Thread.sleep(3000);
		robot.mouseWheel(8);
		
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_F);
		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_F);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_W);
		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(2000);
		driver.close();
	
	}

}
