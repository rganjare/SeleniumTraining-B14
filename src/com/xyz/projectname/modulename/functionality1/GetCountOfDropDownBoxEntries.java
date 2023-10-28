package com.xyz.projectname.modulename.functionality1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetCountOfDropDownBoxEntries {
	
	public static String browser = "CHROME";
	
	//public static ChromeDriver driver;
	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static void main(String[] args) throws InterruptedException {
			
		if(browser.equalsIgnoreCase("CHROME")) {
			
	     driver = new ChromeDriver(); // Responsible to launch the browser
		
		} else if(browser.equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver();
			
		} else {
			
			 driver = new FirefoxDriver();
		}
			
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		System.out.println("User navigated to :- " +driver.getTitle());
		
		Thread.sleep(2000);
//				
//		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium");
//		System.out.println("User entered text in serch input box");
//		Thread.sleep(2000);
		
		WebElement dropdownBox = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		
		Select sel = new Select(dropdownBox);
		
		List<WebElement> listOfDropDownValues = sel.getOptions();
		
		///List<Integer> listOfDropDownValues1 = new ArrayList<>();
		
		System.out.println("Count of languages in the dropdown box " + listOfDropDownValues.size());
		
		//int count = listOfDropDownValues.size();
		
		System.out.println("############################" );
		
		for(int i = 0; i<listOfDropDownValues.size(); i++) { //0 + 69 = 71
		System.out.println("Values in the dropdown box " + listOfDropDownValues.get(i).getAttribute("value"));
		System.out.println("Visible Text in the dropdown box " + listOfDropDownValues.get(i).getText());
		System.out.println("****************************************" );
		}
		
		Thread.sleep(5000);
		driver.quit();  // Kill the instance of driver
		
			
	}

}
