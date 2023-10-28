package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectCheckBox {
	
	public static String browser = "EDGdsfdsfE";
	
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
			
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//*[@value=\"FeMale\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		
		Thread.sleep(5000);
		driver.quit();  // Kill the instance of driver
		
			
	}

}
