package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
  @Test(dataProvider ="inputData")
  public void inputData(String username, String password) {
	  System.out.println("Username :" +username);
	  System.out.println("Password :" +password);
  }
  @DataProvider
  public String[][] inputData() {
	  String[][] data = new String[4][2];
	  data[0][0] = "edureka1";
	  data[0][1] = "edureka@123";
	  
	  data[1][0] = "edureka2";
	  data[1][1] = "edureka@123";
	  
	  data[2][0] = "edureka3";
	  data[2][1] = "edureka@123";
	  
	  data[3][0] = "edureka4";
	  data[3][1] = "edureka@123";
	  
	  return data;
	  
  }
  
}
