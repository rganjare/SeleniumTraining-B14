package com.xyz.projectname.modulename.functionality1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTotalAvailableLinksFromWebPage {
	
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
		
//		/// To get total URLs from the WebPage
//		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
//		
//		System.out.println("Count of links available on the WebPage is " + listOfLinks.size());
//		
//		//int count = listOfDropDownValues.size();
//		
//		System.out.println("############################" );
//		
//		for(int i = 0; i<listOfLinks.size(); i++) { 
//		System.out.println("User visible Text:-  " + listOfLinks.get(i).getText());
//		System.out.println("Link associated with that webelement:- " + listOfLinks.get(i).getAttribute("href"));
//		System.out.println("****************************************" );
//		}
		
		
		/// To get total URLs from the perticuler section
		
			WebElement section = driver.findElement(By.xpath("//*[@class= \"other-projects\"]")); //Bus
			
			List<WebElement> listOfLinksFromTheSection = section.findElements(By.tagName("a")); // seats		
				
				System.out.println("Count of links available on the WebPage is " + listOfLinksFromTheSection.size());
				
				//int count = listOfDropDownValues.size();
				
				System.out.println("############################" );
				
				for(int i = 0; i<listOfLinksFromTheSection.size(); i++) { // tradit 
				System.out.println("User visible Text:-  " + listOfLinksFromTheSection.get(i).getText());
				System.out.println("Link associated with that webelement:- " + listOfLinksFromTheSection.get(i).getAttribute("href"));
				System.out.println("****************************************" );
				}
		
				// Advance for loop				
				
			//	for (DataType  variable List) {
					
			//	}
				System.out.println("######### Advance For loop Output ###################" );
				for (WebElement list : listOfLinksFromTheSection) {
					//System.out.println(list);
					System.out.println("Text of the W.E is:- " +list.getText());
					System.out.println("link of the W.E HREF:- " +list.getAttribute("href"));
					System.out.println("****************************************" );
				}
		
		Thread.sleep(5000);
		driver.quit();  // Kill the instance of driver
		
			
	}

}
