package jun9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//get method
		driver.get("http://automationpractice.com/");
		
		//get title
		String webPageTitle = driver.getTitle();
		System.out.println("Title of the webpage is " + webPageTitle);
		
		//get url
		String webPageURL = driver.getCurrentUrl();
		System.out.println("WebPage URL " + webPageURL);
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		driver.findElement(By.name("submit_search")).click();
		
		String searchText = driver.findElement(By.xpath("//span[@class='lighter']")).getText();
		System.out.println("Search test is = " + searchText);
		
		
		driver.findElement(By.linkText("Contact us")).click();
		webPageTitle = driver.getTitle();
		System.out.println("Title of the webpage is " + webPageTitle);
		
		
		webPageURL = driver.getCurrentUrl();
		System.out.println("WebPage URL " + webPageURL);
		
		
	}

}
