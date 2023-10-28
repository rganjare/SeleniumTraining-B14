package com.xyz.projectname.modulename.functionality1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginToInstagram {
	
	public static String browser = "CHROMEgfdgd";
	
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
			
		driver.get("https://www.instagram.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		//Thread.sleep(2000);
				
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0_gP\"]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/button[1]")).click();
		
		//								//*[@id="mount_0_0_hy"]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/button[1]
		
		driver.findElement(By.xpath("//*[text() = \"Allow all cookies\"]")).click();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("training@bymatAutomation.com");
		
		//driver.findElement(By.name("username")).sendKeys("training@bymatAutomation.com");
		
		driver.findElement(By.xpath("//*[@name= \"username\"]")).sendKeys("training@bymatAutomation.com");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("password1234");
		
		//driver.findElement(By.name("password")).sendKeys("dfsdfsdf");
		
		driver.findElement(By.xpath("//*[@name= \"password\"]")).sendKeys("dfsdfsdf");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
		
		driver.findElement(By.xpath("//button[@class= \"_acan _acap _acas _aj1-\"]")).click();
		
		//Thread.sleep(2000);
		
		//boolean errormessage = driver.findElement(By.id("slfErrorAlert")).isDisplayed();
		
		boolean errormessage = driver.findElement(By.xpath("//*[@id= \"slfErrorAlert\"]")).isDisplayed();
			
		System.out.println(errormessage);
		
		if(errormessage) {
			
		System.out.println("Error Message is:-" + driver.findElement(By.id("slfErrorAlert")).getText());
		
		} else {
			
			System.out.println("User logged in to the Instragram account !!!" );
		}
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Log in with Facebook")).click();
		
		driver.findElement(By.xpath("//*[text() = \"Log in with Facebook\"]")).click();
		
		//Thread.sleep(5000);
		driver.quit();  // Kill the instance of driver
		
			
	}

}
