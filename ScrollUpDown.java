package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver105.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?");
		driver.manage().window().maximize();
		WebElement book = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']"));
		book.click();
		Thread.sleep(1000);
		
		WebElement about = driver.findElement(By.xpath("(//*[@class='nav_a'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",about);
		js.executeScript("window.scrollBy(100,1000)", args);
	
	System.out.println("success");
	}

}
