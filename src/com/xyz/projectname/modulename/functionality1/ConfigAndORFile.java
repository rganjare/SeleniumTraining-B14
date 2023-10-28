package com.xyz.projectname.modulename.functionality1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigAndORFile {
	
	public static Properties config = new Properties();
	
	//public Properties config = new Properties();
	
	//public static String browser= "chrome";
	
	//public static ChromeDriver driver;
	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		FileInputStream fis = new FileInputStream("D:\\BYMAT_Automation\\WorkSpace\\OnlineTraining\\SeleniumTraining_B14\\"
				+ "src\\com\\xyz\\projectname\\modulename\\propfiles\\config.properties");
		
		config.load(fis);
		
		System.out.println("Config file has been loaded");
		System.out.println("Browser = " + config.getProperty("browser"));
		System.out.println("Prod Application URL = " + config.getProperty("AppURL"));
		System.out.println("TEst Application URL = " + config.getProperty("TestAppURL"));
		System.out.println("UAT Application URL = " + config.getProperty("UATAppURL"));
		
		
		if(config.getProperty("browser").equalsIgnoreCase("CHROME")) {
			
	     driver = new ChromeDriver(); // Responsible to launch the browser
		
		} else if(config.getProperty("browser").equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver();
			
		} else {
			
			 driver = new FirefoxDriver();
		}
		
		driver.get(config.getProperty("AppURL"));
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
