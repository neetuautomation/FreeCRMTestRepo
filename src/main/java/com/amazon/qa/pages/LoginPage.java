package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath = "//*[@id='nav-link-accountList']/span[1]")
	WebElement signin;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;

	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebtn;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signinbtn;
	
	@FindBy(xpath="//*[@id=\"nav-logo\"]/a[1]/span[1]")
	WebElement AmazonLogo;
	
	
	//Initializing the Page Objects 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String  validateLoginPage() {
		return driver.getTitle();
	}
	
	public boolean validateAmazonLogo() {
		return AmazonLogo.isDisplayed();
		
	}
	public HomePage login (String un, String pwd) {
		signin.click();
		username.sendKeys(un);
		continuebtn.click();
		password.sendKeys(pwd);
		signinbtn.click();
		return new HomePage();
		
		
	}
	
	
	
	

}
