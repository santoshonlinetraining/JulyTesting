package jun23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo3 {
  @Test
  public void test() {
	  System.out.println("i am from Test");
  }
  
  @Test
  public void test2() {
	  System.out.println("i am from Test2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
  }

}
