package jun24;

import org.testng.annotations.Test;

public class Sample4DependsOn {
  @Test
  public void Apple() {
  System.out.println("i am from Apple");
  }
  
  @Test
  public void Banana() {
	  System.out.println("i am from Banana");
  }
  
  @Test
  public void Mango() {
	  System.out.println("i am from Mango");
  }
  
  @Test( dependsOnMethods = "Banana")
  public void Papaya() {
	  System.out.println("i am from Papaya");
  }
  
}
