package com.bayamp.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	
	//Initialize my objects in the page
	public GoogleHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(name = "q")
	public WebElement txtSearch;
	
	@FindBy(name = "btnG")
	public WebElement btnSearch;
	
	@FindBy(linkText = "Selenium- web browser Automation")
	public WebElement lnkSelenium;
	
	public void SearchGoogle(String searchText) {
		//Search for the text Selenium
		txtSearch.sendKeys(searchText);
		//Click the search button
		btnSearch.click();
	}
	
	public void clickSelenium() {
		lnkSelenium.click();
	}
	

}
