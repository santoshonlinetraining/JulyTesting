package jun11;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetFooterAnchorTags {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\SeleniumJune\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com");

		// instead of above 2 lines u can use below line as well
		List<WebElement> footerLinks =  driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[1]/ul/li/a"));
		
		System.out.println("total links " + footerLinks);
		
		for(int i=0; i<footerLinks.size(); i++) {
			if(footerLinks.get(i).getText().equals("Privacy Policy")){
				continue;
			}
			System.out.println(footerLinks.get(i).getText());
			
		}
	}
}
