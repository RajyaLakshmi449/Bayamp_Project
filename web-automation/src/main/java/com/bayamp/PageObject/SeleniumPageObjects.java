package com.bayamp.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPageObjects {
	
	@FindBy(linkText= "Download")
	public WebElement lnkDownload;
	
	@FindBy(xpath ="//*[@id='header']/h1/a")
	public WebElement lnkHome;
	
	public void ClickDownload() {
		lnkDownload.click();
}
	public void NavigateHome() {
		lnkHome.click();
}
}