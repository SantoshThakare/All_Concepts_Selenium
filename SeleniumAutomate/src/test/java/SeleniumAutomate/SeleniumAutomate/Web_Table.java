package SeleniumAutomate.SeleniumAutomate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web_Table {
	
public static WebDriver driver;
	
	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	@Test
	public void web_table_example() {
				
		driver.manage().window().maximize();
		
		driver.get("file:///E:/WebTable.html");
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		int countNumberValue = 0;
		int sum = 0;
		for (WebElement cell : allCells) {
		String cellValue = cell.getText();
		try{
		int number = Integer.parseInt(cellValue);
		System.out.print(" " + number);
		countNumberValue++;
		sum = sum + number;
		}catch (Exception e) {
			}
		}
		System.out.println("Total count of numeric values is : " +countNumberValue);
		System.out.println("Total sum of all the numeric values is :" +sum);
		driver.quit();
		}
	@Test
	public void auto_suggestion_ex_google_search() throws InterruptedException {
		driver.get("http://www.google.com");
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[@aria-label=\"No thanks\"]")).click();
		driver.findElement(By.xpath("//input[@aria-label=\"Search\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions =
		driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Number of values present in the dropdown is : " + count);
		String expectedValue="selenium interview questions";
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(" "+text);
		if (text.equalsIgnoreCase(expectedValue)) {
		option.click();
		break;
		}
	}
}		
	
}
	
  



