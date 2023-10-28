package com.xyz.projectname.modulename.functionality1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExplicitWait {
	
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
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		driver.manage().window().maximize(); // POM
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		//Thread.sleep(2000);
		
//		String textbeforeClickingBtn = driver.findElement(By.xpath("//*[text()=\"Click and Wait for \"]")).getText();
//		
//		System.out.println(textbeforeClickingBtn);
//		
//		//Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[text()='Click Me - Fluent Wait']")).click();
//		
//		//Thread.sleep(11000);
//		String textAfterClickingBtn = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
//		
//		//Thread.sleep(2000);
//		System.out.println(textAfterClickingBtn);
//		
		//Thread.sleep(5000);
		
		// *********************  WebDriverWait ******************//
		
	//	WebDriverWait wd_wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//			
//		String textbeforeClickingBtn = wd_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Click and Wait for \"]"))).getText();
//		
//		System.out.println("Text Before clicking the Fluent button:-" +textbeforeClickingBtn);
//		
//		//Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[text()='Click Me - Fluent Wait']")).click();
//		
//		wd_wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id=\"demo\"]"), textbeforeClickingBtn)); // Ex Wait
//		
//		String textAfterClickingBtn = wd_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"demo\"]"))).getText();
//		
//		System.out.println("Text After clicking the Fluent button:-" +textAfterClickingBtn);
//			
		// *********************  Fluent Wait ******************//
		
				//WebDriverWait wd_wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
						
				Wait<WebDriver>	f_wait = new FluentWait<WebDriver>(driver) 						
						.withTimeout(Duration.ofSeconds(30))
						.pollingEvery(Duration.ofSeconds(5))  // 5*6 = 30
						.ignoring(NoSuchElementException.class);
					
				String textbeforeClickingBtn = f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Click and Wait for \"]"))).getText();
				
				System.out.println("Text Before clicking the Fluent button:-" +textbeforeClickingBtn);
				
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//*[text()='Click Me - Fluent Wait']")).click();
				
				f_wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id=\"demo\"]"), textbeforeClickingBtn)); // Ex Wait
				
				String textAfterClickingBtn = f_wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"demo\"]"))).getText();
				
				System.out.println("Text After clicking the Fluent button:-" +textAfterClickingBtn);
							
		//Thread.sleep(5000);
		 
		driver.quit();  // Kill the instance of driver
				
	}

}
