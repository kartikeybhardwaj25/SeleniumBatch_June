import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("file:///F:/fileUpload.html");
		 
		 driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
		 Runtime.getRuntime().exec("F:\\Autoit\\FileUpload.exe");

	}

}
