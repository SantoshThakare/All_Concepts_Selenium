package SeleniumAutomate.SeleniumAutomate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_Handling {
	
public static WebDriver driver;
	
	@BeforeTest
	public void launchrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@Test
	public void frame_demo() throws InterruptedException {
				
		driver.get("file:///C:/Users/Shree/Desktop/Page_2.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("a"); 
		driver.switchTo().frame("f1");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("b");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().frame("n1");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("c");
		Thread.sleep(2000);

		WebElement f = driver.findElement(By.className("c1"));
		System.out.println(f);
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("d");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(2000);

	
//		driver.close();
		}
	
	@Test
	public void context_click_using_actions_class() throws AWTException, InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
//		driver.quit();
		
	}
	@Test
	public void gmail_contextClickDemo_mailArchive() throws InterruptedException {

		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S638577925%3A1661967725182144&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmXnfAKDnqkBf1pBkofK3CFZ2g5NNkTN-cCwXR9reuZl5mw7gf0GsgUpTWflT_XZMNeUW6Ks");	
	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thakaresantosh129@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Santosh@9623 ");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(10000);
//		String xp = "//span[@class=\"bog\"]";
//		String xp = "//span[text()=\"Thank you for create dummy account\"]";
//		String xp = "//span[@data-legacy-last-non-draft-message-id=\"data-legacy-last-non-draft-message-id\"]";
		String xp = "//span[@class=\"bog\"][@id=\":2p\"]";
		

		driver.findElement(By.xpath(xp)).click();
		driver.findElement(By.xpath("//div[@class=\"ar8 T-I-J3 J-J5-Ji\"]"));
		WebElement mail = driver.findElement(By.xpath("//div[@class=\"ha\"]"));
		System.out.println(mail.getText());		
		Actions actions = new Actions(driver);
		actions.contextClick(mail).perform();
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void drop_down_menu() {

		driver.get("http://www.actimind.com/");
		String xp = "//a[@href='about-company.html']";
		WebElement menu = driver.findElement(By.xpath(xp));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		WebElement submenu = driver.findElement(By.linkText("ABOUT COMPANY"));
		submenu.click();

	}
	@Test
	public void mouse_hover() {

		driver.get("http://www.actimind.com/");
		Actions action = new Actions(driver);
	
		WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
		action.moveToElement(AreaOfExpertise).perform();
		
		WebElement cloudApp = driver.findElement(By.linkText("CLOUD APPLICATIONS"));
		action.moveToElement(cloudApp).click().perform();
	
		
	}
	
	@Test
	public void DragAndDropExample() throws AWTException {		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		
		driver.quit();
		}
		
	@Test
	public void DragAndDropExample_2() throws AWTException {
			
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement osloBox = driver.findElement(By.id("box1"));
		WebElement norwayBox = driver.findElement(By.id("box101"));
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(osloBox, norwayBox).build().perform();		
		
	}
	
	
}

