package com.xyz.projectname.modulename.functionality1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToInstagramWithFiles {
	
	public static String browser = "CHROMEgfdgd";
	
	//public static ChromeDriver driver;
	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//FileInputStream fis = new FileInputStream("D:\\BYMAT_Automation\\WorkSpace\\OnlineTraining\\SeleniumTraining_B14\\"
		//		+ "src\\com\\xyz\\projectname\\modulename\\propfiles\\config.properties");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\com\\xyz\\projectname\\modulename\\propfiles\\config.properties");
		Properties config = new Properties();
		config.load(fis);
		
		System.out.println("Config file has been loaded");
		
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\com\\xyz\\projectname\\modulename\\propfiles\\OR.properties");
		Properties or = new Properties();
		or.load(fis1);
		
		System.out.println("OR file has been loaded");
			
		if(config.getProperty("browser").equalsIgnoreCase("CHROME")) {
			
	     driver = new ChromeDriver(); // Responsible to launch the browser
		
		} else if(config.getProperty("browser").equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver();
			
		} else {
			
			 driver = new FirefoxDriver();
		}
			
		driver.get(config.getProperty("AppURL"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath(or.getProperty("accptcookie"))).click();
		
		driver.findElement(By.xpath(or.getProperty("username"))).sendKeys(config.getProperty("username"));
		
		driver.findElement(By.xpath(or.getProperty("password"))).sendKeys(config.getProperty("password"));	
		
		driver.findElement(By.xpath(or.getProperty("loginBTN"))).click();
			
		boolean errormessage = driver.findElement(By.xpath(or.getProperty("message"))).isDisplayed();
			
		System.out.println(errormessage);
		
		if(errormessage) {
			
		System.out.println("Error Message is:-" + driver.findElement(By.id(or.getProperty("salert"))).getText());
		
		} else {
			
			System.out.println("User logged in to the Instragram account !!!" );
		}
		
		
		driver.findElement(By.xpath(or.getProperty("FBLoginBtn"))).click();
		
		Thread.sleep(3000);
		driver.quit();  // Kill the instance of driver
		
			
	}

}
