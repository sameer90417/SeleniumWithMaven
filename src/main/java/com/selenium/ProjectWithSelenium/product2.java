package com.selenium.ProjectWithSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class product2 {
	
	public static void getIPhone(WebDriver driver) {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13");

		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

		String parentHandle = driver.getWindowHandle();

		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']")).click();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);

				Select quantity = new Select(driver.findElement(By.cssSelector("#selectQuantity #quantity")));
				quantity.selectByIndex(1);

				driver.findElement(By.id("add-to-cart-button")).click();
				driver.findElement(
						By.xpath("//*[@id='attach-sidesheet-view-cart-button']//*[contains(@class, 'a-button-input')]"))
						.click();
				driver.findElement(By.xpath("//*[@name='proceedToRetailCheckout']")).click();
				driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("Enter number and continue");

			}

		}
	}

}
