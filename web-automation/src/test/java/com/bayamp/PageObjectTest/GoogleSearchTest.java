package com.bayamp.PageObjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bayamp.PageObject.GoogleHomePageObjects;
import com.bayamp.PageObject.SeleniumPageObjects;
import com.bayamp.PageObject.SeleniumPageObjects;

public class GoogleSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://www.google.com/");
	    String pageTitle = driver.getTitle();
	    //Object for the page
	    GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
	    //Search for selenium
	    page.SearchGoogle("Selenium");
	    
	    //click the selenium website
	    page.clickSelenium();
	    //Wait for the page to load
	    Thread.sleep(5000);
		
	    //Click download tab
	    SeleniumPageObjects selPage = new SeleniumPageObjects();
	    selPage.ClickDownload();
	    
	    //Navigate to Home Page
	    selPage.NavigateHome();
	}
	

}
