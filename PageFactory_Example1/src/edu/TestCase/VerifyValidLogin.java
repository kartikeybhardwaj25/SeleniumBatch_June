package edu.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import edu.WordPress.LoginPageNew;

public class VerifyValidLogin {
	
	@Test
	public void checkValidUser() {
		
		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		
		//Create Page object using page factory
		LoginPageNew LoginPage_New = PageFactory.initElements(driver, LoginPageNew.class);
		
		//call the method
		LoginPage_New.login_wordpress("admin", "demo123");
		
	}

}
