package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbsoluteXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver105.exe");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--incognito");
		options.addArguments("--disable");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/?");
		driver.manage().window().maximize();
		WebElement kid = driver.findElement(By.xpath("/html/body/div/div/div/header/div[2]/nav/div/div[3]/div/a"));
		kid.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,1000)", args);
		// js.executeScript("window.scrollBy(200,2000);", args);
		// js.executeScript("arguments[0].ScrollIntoView();", kid);
	}

}
