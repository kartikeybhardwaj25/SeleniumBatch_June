package keyWordDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.ReadExcel;

public class Application {
	@Test
	
	public void applicationTest() throws IOException {
		String[][] data = ReadExcel.getData("C:\\Users\\kartikey\\eclipse-workspace\\KeywordDriven_Example2\\src\\testData\\KeyWord_TestCase.xlsx", "Sheet2");
		String[][] data1 = ReadExcel.getData("C:\\Users\\kartikey\\eclipse-workspace\\KeywordDriven_Example2\\src\\testData\\KeyWord_TestCase.xlsx", "Sheet1");
		
		
		
		for(int i=1;i<data.length;i++) {
			
			switch(data[i][3]) {
			
			case "openBrowser":
			methods.openBrowser();
			break;
			
			case "maximizeWindow":
				methods.maximizeWindow();
				break;
				
			case "implementWait":
				methods.implementWait();
				break;	
				
			case "navigateTo":
				methods.navigateTo(data[i][6]);
				break;		
				
			case "enterUserName":
				methods.enterUserName(data[i][5],data[i][6]);
				break;	
				
			case "enterPassword":
				methods.enterPassword(data[i][5],data[i][6]);
				break;	
				
			case "clickSubmit":
				methods.clicksubmit(data[i][5]);
				break;	
				
			case "verifyMessage":
				methods.VerifyMessage(data[i][5],data[i][6]);
				break;		
				
			case "closeBrowser":
				methods.closeBrowser();
				break;	
			}
			
			}
			
		}
	}


