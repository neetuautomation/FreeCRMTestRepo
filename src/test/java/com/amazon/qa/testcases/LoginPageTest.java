package com.amazon.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;


public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitlePage() {
		String title = loginPage.validateLoginPage();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=2)
	public void AmazonlogoImageTest() {
//		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
		boolean flag = loginPage.validateAmazonLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
//		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	
	@AfterTest
	public void tearDown() {
//		driver.quit();
	}
}
