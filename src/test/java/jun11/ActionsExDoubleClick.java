package jun11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExDoubleClick {
	
	//Enter a work in CAPS and select the same
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com");

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		
		//Double click on the webelemebt
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
		
		Thread.sleep(5000);
		
		//Right click on the web page
		act.moveToElement(search).contextClick().build().perform();
	}
	
}
