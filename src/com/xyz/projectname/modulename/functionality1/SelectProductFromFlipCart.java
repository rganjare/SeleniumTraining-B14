package com.xyz.projectname.modulename.functionality1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectProductFromFlipCart {
	
	public static String browser = "CHROME";
	
	//public static ChromeDriver driver;
	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("CHROME")) {
			
	     driver = new ChromeDriver(); // Responsible to launch the browser // Default constructor 
		
		} else if(browser.equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver(); // Default constructor 
			
		} else {
			
			 driver = new FirefoxDriver(); // Default constructor 
		}
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(60));
		
		System.out.println(driver.getTitle());
		
		//Thread.sleep(2000); // 50  -- 10 sec == 500   500*10 == 5000/60 (30 mins) Hard coded wait
		
	try{
		if(driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")).isDisplayed())
			driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		} catch (Throwable t) {
			
			System.out.println("No expection found:-" + t.getMessage());
			
		}
		
		//Thread.sleep(2000);
		WebElement electronicsOpt = driver.findElement(By.xpath("//*[text()=\"Electronics\"]"));
				
		Actions act = new Actions(driver); // Expecting driver  // Argumented constructor 
		
		//Select sel = new Select(signInBtn);   // Expecting Webelement
		
		act.moveToElement(electronicsOpt).perform();
		
		//Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("//*[text()=\"Computer Peripherals\"]"))).perform();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()=\"Projectors\"]")).click();
		
		//Thread.sleep(10000); // halt execution 
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
