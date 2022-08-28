package com.selenium.ProjectWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
    	
    	WebDriver driver = new ChromeDriver();        
    	driver.manage().window().maximize();
        driver.get("https://frontend.nopcommerce.com/?choosetheme=0");
        String title = driver.getTitle();
        System.out.println(title);      
        

    }
}
