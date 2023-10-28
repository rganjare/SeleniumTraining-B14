package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAlertCopy {
	
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
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
