package DDT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig_v1;

public class DemoTours2_UsingExcel_v1 {
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
	public Object[][] passData() throws IOException{
		
		ExcelDataConfig_v1 configFile = new ExcelDataConfig_v1("F:\\DataDriven\\TestData.xlsx");
		
		int rows = configFile.getRowCount(0);
		
		Object[][] data =new Object[rows][2];
		
		for(int i =1;i<=rows;i++) {
			data[i][0]=configFile.getData(0, i, 1);
			data[i][1] = configFile.getData(0, i, 2);
		}
		
		
		
		return data;
		
	}
	
	

}
