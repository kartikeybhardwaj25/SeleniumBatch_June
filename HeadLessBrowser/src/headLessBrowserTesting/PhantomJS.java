package headLessBrowserTesting;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhantomJS {
	@Test
	public void verifyFaceBookTitle() {
		File file = new File("C:\\Selenium_Jars\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path",file.getAbsolutePath());
		WebDriver driver =new PhantomJSDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("edureka");
		element.submit();
		System.out.println("Page title is : "+driver.getTitle());
		driver.quit();
		
		
		
	}

}
