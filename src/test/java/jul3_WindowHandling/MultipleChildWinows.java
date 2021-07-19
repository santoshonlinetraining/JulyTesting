package jul3_WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;		

public class MultipleChildWinows {				
  public static void main(String[] args) throws InterruptedException {									
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/browser-windows");

    // Opening all the child window
    driver.findElement(By.id("windowButton")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("messageWindowButton")).click();
    Thread.sleep(3000);
    String MainWindow = driver.getWindowHandle();
    System.out.println("Main window handle is " + MainWindow);

    // To handle all new opened window
    Set<String> s1 = driver.getWindowHandles();
    System.out.println("Child window handle is" + s1);
    Iterator<String> i1 = s1.iterator();

    // Here we will check if child window has other child windows and when child window
    //is the main window it will come out of loop.
      while (i1.hasNext()) {
          String ChildWindow = i1.next();
          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
              driver.switchTo().window(ChildWindow);
              driver.close();
              Thread.sleep(3000);
              System.out.println("Child window closed");
           }
       }
    }
}