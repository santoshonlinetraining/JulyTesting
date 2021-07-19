package interviewProgramsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsExEnterCAPS {
	WebDriver driver;
	
	//Enter a work in CAPS and select the same
	
	@Test
	public void addToCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com");

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("tamato").build().perform();
		
		Thread.sleep(5000);
/*		search.clear();
		
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("santosh").doubleClick().build().perform();
		
		Thread.sleep(5000);

		act.moveToElement(search).contextClick().build().perform();
*/	}
	
}
