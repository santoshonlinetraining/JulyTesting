package jun25;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Demo1 {

	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));
		// Double click on the webelemebt
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
		Thread.sleep(5000);
		// Right click on the web page
		act.moveToElement(search).contextClick().build().perform();
	}

	@Test
	public void f2() {
		String vegName = "tamato";

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();
	}

	@Test
	public void f3() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
		act.moveToElement(shopByCat).build().perform();
	
		Thread.sleep(5000);
		
		if(shopByCat.isDisplayed() && shopByCat.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://bigbasket.com/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
