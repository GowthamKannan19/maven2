package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String title;

	public static void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	
		driver= new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void toTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void fill(WebElement element) {
		element.sendKeys("usertxt");

	}

	public static void pass(WebElement element) {
		element.sendKeys("userpass");
	}

	public static void toClick(WebElement element) {
		element.click();

	}

	public static void toQuit() {
		driver.quit();
	}

}
