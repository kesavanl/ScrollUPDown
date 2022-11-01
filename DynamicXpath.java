package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver105.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?");
		driver.manage().window().maximize();
		WebElement mob = driver.findElement(By.xpath("//a[text()='Best Sellers']//following-sibling::a//following-sibling::a"));
		mob.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].ScrollIntoView();", args);
		js.executeScript("window.scrollBy(100,1000)", args);
	}

}
