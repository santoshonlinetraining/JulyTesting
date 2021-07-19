package jun6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/");
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("digitalcutlet@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Shiva");
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		driver.findElement(By.id("passwd")).sendKeys("Shiva@1");
		
		driver.findElement(By.id("days")).sendKeys("1");
		
		
		
		
	}

}
