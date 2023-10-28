package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestSlider {
	
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
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.contextClick().perform();
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		//driver.switchTo().frame(driver.findElement(By.id("id")));
		
		//driver.switchTo().frame(driver.findElement(By.name("iframe-name")));
		
		WebElement draggable = driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		
		//WebElement droppable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
				
	//	Actions act = new Actions(driver); // Expecting driver  // Argumented constructor 
		
		act.dragAndDropBy(draggable, 500, 0).perform();
		
		Thread.sleep(2000);
		act.dragAndDropBy(draggable, -300, 0).perform();
		
		// Thread.sleep(2000);
		// act.contextClick(draggable).perform();
		
		Thread.sleep(5000);
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
