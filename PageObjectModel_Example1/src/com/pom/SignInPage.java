package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class will store all the locators related to Sign in page
public class SignInPage {
	WebDriver driver;
	
	By username = By.id("email");
	By password = By.id("passwd");
	By loginButton = By.id("SubmitLogin");
	
	//constructor
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void VerifyLoginpage(String usid,String psw) {
		driver.findElement(username).sendKeys(usid);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginButton).click();
		
	}
	
	public void typeUsername(String uid){
		driver.findElement(username).sendKeys(uid);
	}
	
public void typePassword(String pswd){
	driver.findElement(password).sendKeys(pswd);
		
	}

public void clickOnSignInButton(){
	driver.findElement(loginButton).click();
	
}

}
