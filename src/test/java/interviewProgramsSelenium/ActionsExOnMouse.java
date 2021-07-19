package interviewProgramsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsExOnMouse {
	WebDriver driver;
	
	//Onmouse and click on WebElement
	
	@Test
	public void addToCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com");

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
		act.moveToElement(search).build().perform();
	
		Thread.sleep(5000);
		
		if(search.isDisplayed() && search.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}
	}
	
}
