package com.xyz.projectname.modulename.functionality1;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestTabsandWindows {
	
	public static String browser = "CHROME";
	
	//public static ChromeDriver driver;
	
	public static WebDriver driver;  // WebDriver Interface 
    
	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("CHROME")) {
			
	     driver = new ChromeDriver(); // Responsible to launch the browser
		
		} else if(browser.equalsIgnoreCase("EDGE")) {
			
			 driver = new EdgeDriver();
			
		} else {
			
			 driver = new FirefoxDriver();
		}
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("User navigated to the URL:- " +driver.getTitle());
		
		Wait<WebDriver>	f_wait = new FluentWait<WebDriver>(driver) 						
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))  // 5*6 = 30
				.ignoring(NoSuchElementException.class);
		
		
		driver.findElement(By.xpath("//*[@class=\"newclose\"]")).click();
		
		driver.findElement(By.xpath("//*[@class=\"newclose2\"]")).click();
		
		driver.findElement(By.xpath("//*[@class=\"txtSign\"]")).click();
		
		
		Set<String> set_tabs = driver.getWindowHandles();  // Windows/Tabs ID associated with driver 
		//Set is a collection of unique records
															//List is a collection of records
		// List, Set, Hashtable, Map or HashMap all the types of Java Collections. // OOPs concepts 
		
		System.out.println("Number of tabs: " + set_tabs.size());
		
		Iterator<String> itr =  set_tabs.iterator();
		
		String p_window = null;
		String s_window = null;
//		int counter = 1;
//		while(itr.hasNext()) {		
//			p_window = itr.next();
//			//System.out.println("My window ID_ "+counter+":-" + itr.next());
//			counter++;		
//			s_window = itr.next();			
//			System.out.println("p_window:-" +p_window);
//			System.out.println("s_window:-" +s_window);
//		}
		
		p_window = itr.next();
		s_window = itr.next();
		
		System.out.println("p_window:-" +p_window);
	    System.out.println("s_window:-" +s_window);

		
		driver.switchTo().window(s_window);
		
		driver.findElement(By.xpath("//*[@id=\"User_Id\"]")).sendKeys("Username");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@class=\"cl fl ls_login\"]")).click();
		
		//Thread.sleep(5000);
		
		driver.close(); // Close the current active window
		
		driver.switchTo().window(p_window);
		
		driver.findElement(By.xpath("//*[@title=\"NRI Banking\"]")).click();
		
		set_tabs = driver.getWindowHandles();
		itr =  set_tabs.iterator();
		System.out.println("Number of tabs after clicking on NRI banking: " + set_tabs.size());
		String NRI_window = null;
		int counter = 1;
		while(itr.hasNext()) {		
			p_window = itr.next();
			//System.out.println("My window ID_ "+counter+":-" + itr.next());	
			s_window = itr.next();		
			//NRI_window = itr.next();
			counter++;
			
			System.out.println("p_window:-" +p_window);
			System.out.println("s_window:-" +s_window);
			//System.out.println("NRI_window:-" +NRI_window);
		}
		
		//Thread.sleep(2000);
		
		//driver.switchTo().window(NRI_window);
		driver.switchTo().window(s_window);
		driver.findElement(By.xpath("//*[@title=\"Close\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"lockSign\"]")).click();
		
		//Thread.sleep(2000);
		
		driver.switchTo().window(p_window);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"topMnuloans\"]")).click();
		//Thread.sleep(5000);
		driver.quit();  // Kill the instance of driver
		
			
	}

}
