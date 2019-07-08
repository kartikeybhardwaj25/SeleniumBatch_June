package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserParallerTesting {
	WebDriver driver;
	String url = "https://www.edureka.co/";
@Parameters("browserType")	
  @Test
  public void invokeBrowser(String browserType) {
	  browserType = browserType.trim();
	  
	  if(browserType.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  
	  if(browserType.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  }
	  else {
		  System.out.println("Invalid browser");
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(url);
		  
  }
}
