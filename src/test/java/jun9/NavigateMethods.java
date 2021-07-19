package jun9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//navigate to
		driver.navigate().to("http://automationpractice.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Contact us")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("digitalcutlet@gmail.com");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
	}

}
