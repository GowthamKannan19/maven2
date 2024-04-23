package org.base;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleNew extends BaseClass {

	public static void main(String[] args) {
		launchBrowser();

		loadUrl("https://www.facebook.com/");

		maximize();

		currentUrl();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("gowtham30@gmail.com");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("gowtham123");

		WebElement element = driver.findElement(By.name("login"));
		element.click();
	}

}
