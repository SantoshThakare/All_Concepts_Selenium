package SeleniumAutomate.SeleniumAutomate;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_SignUps {
	
	@Test
	public void selection() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.signUp_crome\n 2.signUp_edge\n ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:	signUp_crome();
			break;
		case 2: signUp_edge();
			break;
	
			}

		}	

	@Test
	public void signUp_crome() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.linkText("Create New Account")).click(); 
//		Thread.sleep(3000);
			
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		Thread.sleep(3000);
//
//		
//		driver.findElement(By.name("firstname")).sendKeys("Santosh");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("Rahul");
//		Thread.sleep(3000);
		
//		driver.findElement(By.cssSelector("//*[@id=\"u_1k_b_je\"]")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Santosh");
		Thread.sleep(3000);		
		driver.findElement(By.name("lastname")).sendKeys("Thakare");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("santoshthakare5000@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("santoshthakare5000@gmail.com");
		Thread.sleep(3000);
//		driver.findElement(By.name("reg_passwd__")).sendKeys("santosh");
//		Thread.sleep(3000);
		driver.findElement(By.id("password_step_input")).sendKeys("santosh@123");
		Thread.sleep(3000);	
		driver.findElement(By.id("day")).sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("May");
		Thread.sleep(3000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(3000);
			
		driver.findElements(By.name("sex")).get(1).click();
		Thread.sleep(3000);

//		driver.findElement(By.xpath("//label[contents(text),'Male]")).click();
//		Thread.sleep(3000);
		
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);

//		driver.close();


	}
	
	@Test
	public void signUp_edge() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Ranbir");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("kapoor");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("kapoor@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kapoor@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password_step_input")).sendKeys("kapoor");
		Thread.sleep(3000);
		WebElement daypass = driver.findElement(By.id("day"));
		Select day = new Select(daypass);
		day.selectByIndex(20);
		WebElement monthpass = driver.findElement(By.id("month"));
		Select month = new Select(monthpass);
		month.selectByIndex(5);
		WebElement yearpass = driver.findElement(By.id("year"));
		Select year = new Select(yearpass);
		year.selectByVisibleText("1999");
		Thread.sleep(3000);
		driver.findElements(By.name("sex")).get(1).click();
//		driver.close();
				
	}
	

	
}

