package jun24;

import org.testng.annotations.Test;

public class Sample3 {
  @Test(priority=2)
  public void Apple() {
  System.out.println("i am from Apple");
  }
  
  @Test(priority=1)
  public void Banana() {
	  System.out.println("i am from Banana");
  }
  
  @Test(priority=3)
  public void Mango() {
	  System.out.println("i am from Mango");
  }
  
  @Test(priority=4, dependsOnMethods = "Banana")
  public void Papaya() {
	  System.out.println("i am from Papaya");
  }
  
}
