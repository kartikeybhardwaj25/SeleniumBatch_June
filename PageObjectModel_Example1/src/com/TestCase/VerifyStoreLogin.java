package com.TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.SignInPage;


public class VerifyStoreLogin {
	

	@Test
	public void VerifyStore() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	SignInPage login = new SignInPage(driver);
	
	login.VerifyLoginpage("edureka@edureka.co", "edureka");
	
		/*
		 * login.typeUsername("edureka@edureka.co"); login.typePassword("edureka");
		 * login.clickOnSignInButton();
		 */
	
	Thread.sleep(5000);
	driver.quit();
			
	
	
	
	
	
	

}
}
