package jun9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pooja {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Santosh\\\\Automation\\\\Workspace_new\\\\SeleniumJune\\\\drivers\\\\chromedriver.exe");
		WebDriver obj;
		obj = new ChromeDriver();
		
		obj.get("https://www.amazon.in/");
		
		obj.findElement(By.id("twotabsearchtextbox")).sendKeys("baby clothes");
		obj.findElement(By.id("nav-search-submit-button")).click();
		
		obj.findElement(By.className("s-image")).click();
		
		obj.findElement(By.name("submit.add-to-cart")).click();
				
		obj.findElement(By.linkText("Add to Shopping Cart")).click();
		
		obj.findElement(By.partialLinkText("buy")).click();

}
}
