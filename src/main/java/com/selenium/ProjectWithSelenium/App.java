package com.selenium.ProjectWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args )
    {
       
    	
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
    	
    	WebDriver driver = new ChromeDriver();        
    	driver.manage().window().maximize();
        driver.get("https://amazon.in");
        String title = driver.getTitle();
        System.out.println(title);   
      
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphones");
        driver.findElement(By.id("nav-search-submit-button")).click();
        

    }
}
