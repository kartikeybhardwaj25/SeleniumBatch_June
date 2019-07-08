import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

@Test
public class Sikouli_Ddemo1 {
  public void f() throws FindFailed {
	  
	  Screen screen = new Screen();
	  Pattern username = new Pattern("F:\\Sikouli\\emailname_img.jpg");
	  Pattern password = new Pattern("F:\\Sikouli\\password.jpg");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 screen.wait(username,10);
		 screen.type(username,"abc");
		 screen.type(password,"abc");
  }
}
