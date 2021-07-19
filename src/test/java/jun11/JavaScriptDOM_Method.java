package jun11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptDOM_Method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com");

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.id("input")); 
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("COLGATE").build().perform();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exe = "return document.getElementById(\"input\").value";
		System.out.println(exe);
		
		String res = (String) js.executeScript(exe);

		System.out.println("value is ==>" + res + "<==");

	}
	
}
