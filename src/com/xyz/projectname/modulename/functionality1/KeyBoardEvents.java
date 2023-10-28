package com.xyz.projectname.modulename.functionality1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyBoardEvents {
	
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
		
		driver.get("https://jqueryui.com/spinner/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);

//		Robot rb = new Robot(); // Java language Only.
//		
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_A);
//		rb.keyPress(KeyEvent.VK_C);
		
		// Click on the web element
		
//		rb.keyPress(KeyEvent.VK_V);
		
		
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_A);
//		rb.keyRelease(KeyEvent.VK_C);
//		rb.keyRelease(KeyEvent.VK_V);
		
		Actions act = new Actions(driver); 
		
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		driver.findElement(By.xpath("//*[@id=\"spinner\"]")).click();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		// Thread.sleep(2000);
		// act.contextClick(draggable).perform();
		
		Thread.sleep(5000);
		
		driver.quit();  // Kill the instance of driver
		
			
	}

}
