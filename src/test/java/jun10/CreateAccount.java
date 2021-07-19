package jun10;

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
		
		driver.findElement(By.id("email_create")).sendKeys("digitalcutlet2@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Shiva");
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		driver.findElement(By.id("passwd")).sendKeys("Shiva@1");
		driver.findElement(By.id("days")).sendKeys("1");
		
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		
		
		boolean result = driver.findElement(By.id("id_gender1")).isSelected();
		
		if(result == true) {
			System.out.println("Selected Mr");
		} else {
			System.out.println("NOT Selected Mr");
		}
		
		boolean resultOfCheckBox  =driver.findElement(By.xpath("//input[@id='newsletter']")).isSelected();
		if(resultOfCheckBox == true) {
			System.out.println("News letter checkbox clicked");
		} else {
			System.out.println("News letter checkbox NOT clicked");
		}
		
		driver.findElement(By.xpath("//i[@class='icon-home']")).click();
		
	}

}
