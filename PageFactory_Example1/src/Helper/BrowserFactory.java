package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browserName,String url)
	{
if (browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		else if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
			  driver = new ChromeDriver();
			
		}
			driver.manage().window().maximize();
			driver.get(url);
			
			return driver;
	
	}

}
