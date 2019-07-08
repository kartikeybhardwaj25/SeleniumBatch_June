package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Parameterization {
	WebDriver driver;
	
	@BeforeMethod
	 public void openbrowser() {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(url);
	} 
		@Parameters({"user","pass"})
		  @Test
		  public void Loginfacebook(String username,String password) {
			  driver.findElement(By.name("email")).sendKeys(username);
			  driver.findElement(By.name("pass")).sendKeys(password);
			  
		  }
		  
		  @AfterMethod
		  public void closeBrowser() {
			  driver.close();
  }
	
}
