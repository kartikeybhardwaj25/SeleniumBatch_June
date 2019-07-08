package TestNG;

import org.testng.annotations.*;

public class GroupingDemo2 {
  @Test (groups = {"B"})
  public void g1() {
	  
	  System.out.println("function 1");
  }
  
  @Test (groups = {"C"})
  public void g2() {
	  System.out.println("function 2");
  }
  
  @Test (groups = {"D"})
  public void g3() {
	  System.out.println("function 3");
  }
  
  @Test (groups = {"A"})
  public void g4() {
	  System.out.println("function 4");
  }
  
  @Test (groups = {"D"})
  public void g5() {
	  System.out.println("function 4");
  }
  
  @BeforeMethod
  public void BeforeEveryMethod() {
	  
	  System.out.println("Before Every method");
  }
  
  @AfterMethod
  public void AfterEveryMethod() {
	  System.out.println("After Every method");
  }
  
  @BeforeTest
  public void BeforeEveryTest() {
	  System.out.println("Before Any test Method");
  }
  
  @AfterTest
  public void afterAllTest() {
	  System.out.println("After All Test");
  }
  
}
