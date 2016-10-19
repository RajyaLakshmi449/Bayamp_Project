package com.bayamp.PageObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyAccountPage {
	
	@Test
	public void indeed() {
		
	
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		//Open indeed home page
		driver.get("https://www.indeed.com/");
		
		//Find what field and enter Selenium
		//Thread.sleep(2000);
		driver.findElement(By.id("what")).sendKeys("Selenium");
		
		//Find location field and enter London
		driver.findElement(By.id("where")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.id("where")).sendKeys("San Jose");
		
		//Find Findjobs button and click on it
		//Thread.sleep(2000);
		driver.findElement(By.id("fj")).click();
		
		//From job search results page, get page title and jobs count message
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("SearchCount")).getText());
	}

}
