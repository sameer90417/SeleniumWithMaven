package com.selenium.ProjectWithSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Maximize chrome window
		driver.manage().window().maximize();

		// Navigate to amazon website
		driver.get("https://amazon.in");

		// Add to cart a "watch" with the help of method of product1 class
		product1.getWatch(driver);

		// redirect to home page
		driver.findElement(By.id("twotabsearchtextbox")).clear();

		// Add to cart a "IPhone" with the help of method of product2 class
		product2.getIPhone(driver);

	}

}
