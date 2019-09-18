package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
	WebElement usernamelabel;
	
	@FindBy(xpath = "//*[@id=\"glow-ingress-line2\"]")
	WebElement verifydelivery;
	
	@FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/span")
	WebElement verifyEN;
	
	@FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]/span")
	WebElement prime;
	
	@FindBy(xpath= "//*[@id=\"nav-orders\"]/span[2]")
	WebElement orders;
	
	//initialization the Home Page
	public HomePage() {
		PageFactory.initElements(driver, this);	
		
	}
	
	
	public String VerifyHomePageTitle() {
		return driver.getTitle();
	
	}
	
	public boolean VerifyUsernamelabel() {
		return usernamelabel.isDisplayed();
				
	}
	
	public String VerifyDelivery() {
		return verifydelivery.getText();
		
		
		
	}
	

}
