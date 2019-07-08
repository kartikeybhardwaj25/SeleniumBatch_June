package TestNG;

import org.testng.annotations.*;

public class AnnotationClass {
  @Test
  public void f1() {
	  
	  System.out.println("function 1");
  }
  
  @Test
  public void f2() {
	  System.out.println("function 2");
  }
  
  @Test
  public void f3() {
	  System.out.println("function 3");
  }
  
  @Test
  public void f4() {
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
