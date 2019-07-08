package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTours {
	WebDriver driver;
	@Test(dataProvider="MercuryTours")
	 public void loginToDemoTours(String username,String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.newtours.demoaut.com");
		 
		 driver.findElement(By.name("userName")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(Password);
		 
		 driver.findElement(By.name("login")).click();
		 
		 Thread.sleep(5000);
		 driver.getTitle();
		 
		 Assert.assertTrue(driver.getTitle().contains("Mercury"),"User is not able to login -Invalid Credentials");
		 
		 System.out.println("Page title verified -user is able to login successfully");
		 
		 
		 
		 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="MercuryTours")
	public Object[][] passData(){
		
		Object[][] data =new Object[3][2];
		
		data[0][0] = "admin1";
		data[0][1]= "demo1";
		
		data[1][0] = "admin2";
		data[1][1]= "demo2";
		
		data[2][0] = "admin3";
		data[2][1]= "demo3";
		
		return data;
		
	}
	
	

}
