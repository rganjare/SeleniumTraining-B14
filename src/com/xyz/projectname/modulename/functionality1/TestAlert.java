package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAlert {
	
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
		
		driver.findElement(By.xpath("//*[@type = \"submit\"]")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert Text is:- " +alt.getText());
		Thread.sleep(2000);
		
//		alt.sendKeys("Delete");
		
		alt.accept();  // Confirm/Ok -- Delete the record 
		
	//	alt.dismiss(); // Cancel
				
		//driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id= \"login1\"]")).sendKeys("emailAddress");
		
		Thread.sleep(5000);
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
