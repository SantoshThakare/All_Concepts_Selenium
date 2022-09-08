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
//		driver.close();
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
		@Test
		public void list_box_example() {
			
			driver.get("file:///E:/ListBoxBreakFast.html");
					WebElement list = driver.findElement(By.id("mtr"));
					Select s = new Select(list);
					List<WebElement> options = s.getOptions();
					int size = options.size();
					System.out.println("Number of elements present inside the listbox is : "+ size);
					for (WebElement webElement : options) {
					String text = webElement.getText();
					System.out.println(text);
					}
					s.selectByIndex(0);
					s.selectByValue("v");
					
					s.selectByVisibleText("Poori");
					System.out.println("************Print all selected options***********");
					List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
					int size2 = allSelectedOptions.size();
					System.out.println("Number of items that is selected in the list box is : "+size2);
					System.out.println(" Selected items are printed below ");
					for (WebElement webElement : allSelectedOptions) {
					System.out.println(webElement.getText());
					}
					System.out.println("check whether it is a multiple select listbox or not");
					boolean multiple = s.isMultiple();
					System.out.println(multiple +" yes , it is multi select");
					if (multiple) {
					WebElement firstSelectedOption = s.getFirstSelectedOption();
					System.out.println(firstSelectedOption.getText()+"is the first selected item in the list box");
					s.deselectByIndex(0);
					WebElement firstSelectedOption1 = s.getFirstSelectedOption();
					System.out.println(firstSelectedOption1.getText()+" is the first selected item");
					s.deselectByValue("v");
					WebElement firstSelectedOption2 = s.getFirstSelectedOption();
					System.out.println(firstSelectedOption2.getText()+" is the first selected item");
					s.deselectByVisibleText("Poori");
					}
				}
		@Test
		public void printlistvalues_sorted_order() {
			driver.get("file:///E:/ListBoxBreakFast.html");
					WebElement listElement = driver.findElement(By.id("mtr"));
					Select s = new Select(listElement);
					List<WebElement> allOptions = s.getOptions();
					int count = allOptions.size();
					System.out.println(count);
					System.out.println("-----print the values in the list ----");
					ArrayList<String> list = new ArrayList<String>();
					for (WebElement option : allOptions) {
					String text = option.getText();
					System.out.println(text);
					list.add(text);
					}
					Collections.sort(list);
					System.out.println("-----print the value in sorted order----");
					for (String value : list) {
					System.out.println(value);
					}
		}
		@Test
		public void print_unique_element_in_the_listbox() {
			driver.get("file:///E:/ListBoxBreakFast.html");
			WebElement listElement = driver.findElement(By.id("mtr"));
			Select s = new Select(listElement);
			List<WebElement> allOptions = s.getOptions();
			int count = allOptions.size();
			System.out.println(count);
			System.out.println("-----print the values in the list ----");
			HashSet<String> allElements = new HashSet<String>();
			for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			allElements.add(text);
			}
			System.out.println(allElements);
			}
		@Test
		public void print_unique_element_sorted() {
			driver.get("file:///E:/ListBoxBreakFast.html");
			WebElement listElement = driver.findElement(By.id("mtr"));
			Select s = new Select(listElement);
			List<WebElement> allOptions = s.getOptions();
			int count = allOptions.size();
			System.out.println(count);
			System.out.println("-----print the values in the list ----");
			TreeSet<String> allElements = new TreeSet<String>();
			for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			allElements.add(text);
			}
			System.out.println(allElements);
			}
		@Test
		public void checklist_has_duplicate_values_hashset() {
			driver.get("file:///E:/ListBoxBreakFast.html");
					 WebElement listbox = driver.findElement(By.id("mtr"));
					 Select s = new Select(listbox);
					 List<WebElement> allOptions = s.getOptions();
					 int count1 = allOptions.size();
					 System.out.println("Number of elements in the list is :" +count1);
					 HashSet<String> allElementText = new HashSet<String>();
					 for (int i = 0; i < count1; i++) {
					 String text = allOptions.get(i).getText();
					 System.out.println(text);
					 allElementText.add(text);
					 }
					 int count2 = allElementText.size();
					 System.out.println("Number of elements in the hashset is :" +count2);
					 if (count1==count2) {
					 System.out.println("list box has NO duplicate values");
					 }
					 else{
					 System.out.println("list box has duplicate values");
					 }
					 System.out.println(allElementText);
					 driver.close();
					 
		}
		@Test
		public void print_the_duplicate_item_inthelist_hashset() {
			driver.get("file:///E:/LisatBoxBreakFast.html");
					 WebElement listbox = driver.findElement(By.id("mtr"));
					 Select s = new Select(listbox);
					 List<WebElement> allOptions = s.getOptions();
					 int count1 = allOptions.size();
					 System.out.println("Number of elements in the list is :" +count1);
					 HashSet<String> allElementText = new HashSet<String>();
					 for (int i = 0; i < count1; i++) {
					 String text = allOptions.get(i).getText();
					
					 if (!allElementText.add(text)) {
					 System.out.println(text +" is the duplicate item in the list box");
					 }
					 }
					 System.out.println(allElementText.size());
					 System.out.println(allElementText);
					 driver.close();
					 }
		@Test
		public void hash_map_example_print_theOcuuranceOfPoori() {
			driver.get("file:///E:/ListBoxBreakFast.html");
					WebElement list = driver.findElement(By.id("mtr"));
					Select s = new Select(list);
					List<WebElement> allElements = s.getOptions();
					HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
					for (WebElement element : allElements) {
					String text = element.getText();
					if (hashMapObj.containsKey(text)) {
					Integer value = hashMapObj.get(text);
					value++;
					hashMapObj.put(text, value);
					}else{
					hashMapObj.put(text, 1);
					}
					}
					Set<String> allKeys = hashMapObj.keySet();
					for (String key : allKeys) {
					Integer value = hashMapObj.get(key);
					System.out.println(key +" -->"+ value);
					if (value>1) {
					System.out.println("Occurance of " + key + " is :" + value);
					}}
		}
		
}
	
  



