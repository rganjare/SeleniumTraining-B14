package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestDropDownBox {
	
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
				
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium");
		System.out.println("User entered text in serch input box");
		Thread.sleep(2000);
		
		WebElement dropdownBox = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		
		Select sel = new Select(dropdownBox);
		
//		sel.selectByValue("hi");
//		System.out.println("User selected the value hi from Dropdown box");
		
//		sel.selectByIndex(7);
//		System.out.println("User performed the selectByIndex operation in Dropdown box");
			
		sel.selectByVisibleText("Dansk");
		System.out.println("User performed the selectByVisibleText operation in Dropdown box");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		System.out.println("User clicked on search button");
		
		Thread.sleep(10000);
		driver.quit();  // Kill the instance of driver
		
			
	}

}
