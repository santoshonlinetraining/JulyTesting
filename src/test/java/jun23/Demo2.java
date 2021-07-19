package jun23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Demo2 {
  @Test
  public void horse() {
	  System.out.println("i am from Horse");
  }
  
  @Test
  public void fox() {
	  System.out.println("i am from fox method");
  }
  
  @Test
  public void apple() {
	  System.out.println("i am from Apple method");
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
