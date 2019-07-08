package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookScreenShot {
	
	@Test
	public void captureScreenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.facebook.com");
		  driver.findElement(By.xpath("//*[@id=\"email\"]"));
		  TakesScreenshot ts = ((TakesScreenshot)driver);
		  
		  //file path where screen shot will get saved
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File("./ScreenShots/facebook.png"));
		  
		  
		  
		  System.out.println("ScreenShot");
		  
		  driver.quit();
		  
		
	}

}
