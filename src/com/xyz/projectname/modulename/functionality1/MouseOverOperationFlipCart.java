package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOverOperationFlipCart {
	
	public static String browser = "CHROME";
	
	//public static ChromeDriver driver;
	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static void main(String[] args) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("CHROME")) {
			
	     driver = new ChromeDriver(); // Responsible to launch the browser // Default constructor 
		
		} else if(browser.equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver(); // Default constructor 
			
		} else {
			
			 driver = new FirefoxDriver(); // Default constructor 
		}
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[@class=\"_1sLnDu\"]"));
				
		Actions act = new Actions(driver); // Expecting driver  // Argumented constructor 
		
		//Select sel = new Select(signInBtn);   // Expecting Webelement
		
		act.moveToElement(signInBtn).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()=\"Orders\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class=\"IiD88i _351hSN\"]")).sendKeys("training@bymatautomation.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
