package jun24;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class  Sample1{
  @Test
  public void f() {
	  System.out.println("i am from test");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am from Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am from After Test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from after method");
  }
}
