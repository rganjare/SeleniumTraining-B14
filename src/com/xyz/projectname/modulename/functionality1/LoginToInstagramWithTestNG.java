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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToInstagramWithTestNG { // 1 to 1 Mapping

	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static Properties config;
	public static Properties or;
	
	@AfterClass (alwaysRun = true)
	public void generateExecutionReport() {
		
		System.out.println("Code to generate HTML execution Report");
	}
	
	@BeforeClass // 1 time activity
	public void initializePropFiles() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "/src/propfiles/config.properties");
		config = new Properties();
		config.load(fis);
		
		System.out.println("Config file has been loaded");
		
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")
				+ "/src/propfiles/OR.properties");
		or = new Properties();
		or.load(fis1);
		
		System.out.println("OR file has been loaded");
		
	}
	
	@BeforeMethod    // Launch browser before each test case execution 
	public void initializeBrowser() { 
		
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
			
			String actualResult_pagetilte = driver.getTitle();
			
			System.out.println("actualResult_pagetilte is "+actualResult_pagetilte);
			
			Assert.assertEquals(actualResult_pagetilte, "Instagram"); // Verification point
					
		
	}
	
	@Test (priority = 0, description = "description-loginToInstagramWithValidCred")
	public void loginToInstagramWithValidCred() throws IOException {
	
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
		
		//Assert.fail("force fail");
			
	}
	
	//@Test (priority = 1, description = "description-loginToInstagramWithInvalidUserName")
	public void loginToInstagramWithInvalidUserName() throws IOException {
	
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
			
	}
	
	
	//@Test (priority = 2, enabled = false, alwaysRun = true, description = "description-loginToInstagramWithInvalidUserName")
	public void loginToInstagramWithInvalidPassword() throws IOException {
	
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
			
	}
	
	//@Test (priority = -2, description = "description-loginToInstagramWithInvalidcredentials")
	public void loginToInstagramWithInvalidcredentials() throws IOException {
	
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
			
	}
	
	//@Test (priority = 3, dependsOnMethods = "loginToInstagramWithValidCred", alwaysRun = true, description = "description-loginToInstagramWithInvalidcredentials")
	public void likeInstraProfile() throws IOException {
	
		System.out.println("Code to like the Insta profile");
	}
	
	@AfterMethod
	public void quitDriver() {
		//Thread.sleep(3000);
		driver.quit();  // Kill the instance of driver	
	}
	
	

}
