package com.selenium.ProjectWithSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product1 {

	public static void getWatch(WebDriver driver) throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple watch");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

		String parentHandle2 = driver.getWindowHandle();
		driver.findElement(By.xpath(
				"//span[contains(text(), 'Apple Watch Series 7 (GPS + Cellular, 45mm) - Blue Aluminium Case with Abyss Blue Sport Band - Regular')]"))
				.click();
		Set<String> handles2 = driver.getWindowHandles();
		for (String handle2 : handles2) {
			if (!handle2.equals(parentHandle2)) {

				driver.switchTo().window(handle2);
				driver.findElement(By.xpath("//*[@id='a-autoid-22-announce']//*[contains(@class, 'imgSwatch')]"))
						.click();
				driver.findElement(By.id("add-to-cart-button")).click();
				driver.findElement(
						By.xpath("//*[@id='attach_add_accessory_button_0-0']//*[contains(@class, 'a-button-input')]"))
						.click();
				driver.findElement(
						By.xpath("//*[@id='attach-sidesheet-view-cart-button']//*[contains(@class, 'a-button-input')]"))
						.click();
				driver.findElement(By.xpath("//*[@name='proceedToRetailCheckout']")).click();
				driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("Enter number and continue");
				Thread.sleep(2000);
				driver.close();

			}
		}
		
		// Redirect to home page
		driver.switchTo().window(parentHandle2);
	}
}
