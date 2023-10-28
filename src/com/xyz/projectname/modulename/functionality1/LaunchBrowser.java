package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static String browser = "Chrome";
	
	//browser="Chrome";
	
	//public static ChromeDriver driver;
	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static void main(String[] args) throws InterruptedException {
		

		if(browser.equalsIgnoreCase("CHROME")) {
			
	     driver = new ChromeDriver(); // Responsible to launch the browser
		
		} else if(browser.equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver();
			
		} else {
			
			 driver = new FirefoxDriver();
			 
			// driver = new FirefoxDriver();
		}
		
		//System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver.exe");
	
//		ChromeDriver driver = new ChromeDriver();		
//		ChromeDriver driver = new ChromeDriver();	
//		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https:\\bymatautomation.com");
		
		driver.manage().window().maximize();
		
		//driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
				
		//driver.close();  // close current active window
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
