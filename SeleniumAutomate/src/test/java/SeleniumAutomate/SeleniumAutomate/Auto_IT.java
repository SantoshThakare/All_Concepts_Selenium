package SeleniumAutomate.SeleniumAutomate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto_IT {
	public static WebDriver driver;
	
	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	@Test
	public void fileU_upload_popup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("E:\\priyanka.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void file_upload_auto_it_1() throws IOException, InterruptedException {
		driver = new ChromeDriver();		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Select PDF file")).click();
		Runtime.getRuntime().exec("E:\\Shree\\Documents\\FileUploadScript.exe");
		Thread.sleep(3000);
//		driver.close();		
	}
	@Test
	public void file_upload_auto_it_2() throws IOException, InterruptedException {
		driver = new ChromeDriver();		
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Choose file")).click();
		Runtime.getRuntime().exec("E:\\Shree\\Documents\\FileUploadScriptVikky.exe");
		Thread.sleep(3000);
		driver.close();		
	}
	@Test
	public void file_download() throws InterruptedException {
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>(); 
		chromePrefs.put("profile.default_content_settings.popups", 0); 
		chromePrefs.put("download.default_directory", "C:\\Users\\Shree\\Downloads"); 
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = new DesiredCapabilities(); 
		cap.setCapability(ChromeOptions.CAPABILITY, options); 
		driver = new ChromeDriver(); 
		driver.get("http://www.seleniumhq.org/download/"); 
		Thread.sleep(3000); 
		String xp = "32 bit Windows IE"; 
		driver.findElement(By.linkText(xp)).click();
		driver.close();
	}
	
	@Test
	public void child_window_popup() throws InterruptedException { 
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		}
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void close_parent_window_browser() throws InterruptedException { 
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	String parentID = driver.getWindowHandle();
	System.out.println("Parent Id :" + parentID);
	driver.findElement(By.linkText("Register now")).click();
	Set<String> allWindowHandles = driver.getWindowHandles();
	int count = allWindowHandles.size();
	System.out.println("Number of browser windows opened on the system is : "+ count);
	for (String windowHandle : allWindowHandles) {
	driver.switchTo().window(windowHandle);
	if (windowHandle.equals(parentID)) {
	driver.close();
	
	}}}
	
	@Test
	public void handling_tab_browser_window_pop() {
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
//		driver.findElement(By.xpath("//a[text()='BUSES']")).click();
		driver.findElement(By.xpath("//a[@aria-label =\"Menu BUSES. Website will be opened in new tab\"]")).click();
		System.out.println(driver.getTitle());
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}
	
}
