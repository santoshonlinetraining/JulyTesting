package jun10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
				
				WebDriver driver;
				driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http://automationpractice.com/");
				driver.findElement(By.linkText("Sign in")).click();
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh@test.com");
				driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
				
				Thread.sleep(5000);
				
				String username = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
				String password = driver.findElement(By.xpath("//input[@name='passwd']")).getAttribute("value");
				
				System.out.println(username);
				System.out.println(password);
				
	}

}
