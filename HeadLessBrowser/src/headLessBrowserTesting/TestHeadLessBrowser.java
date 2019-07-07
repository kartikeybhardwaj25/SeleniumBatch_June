package headLessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeadLessBrowser {

	@Test
	public void verifyFaceBookTitle() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		String facebookTitle =driver.getTitle();
		Assert.assertTrue(facebookTitle.contains("Facebook"));
		
		
	}

}
