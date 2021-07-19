package interviewProgramsSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddToCardBigBasketSingleItem {
	WebDriver driver;
	
	@Test
	void addToCart() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Santosh\\\\Class\\\\TestingClass\\\\drivers\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/ps/?q=vegetables");
		String vegetables = "Cabbage";
		
		List<WebElement> vegetablesList = driver.findElements(By.xpath("//div[@qa='product_name']//a[@class='ng-binding']"));
		
		for(int i=0; i < vegetablesList.size(); i++) {
			System.out.println(vegetablesList.get(i).getText());
			
			if(vegetablesList.get(i).getText().contains(vegetables)) {
				System.out.println("Product is available");
				System.out.println("//a[text()='"+vegetables+"']/parent::div[@qa='product_name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[@qa='add']");
				driver.findElement(By.xpath("//a[text()='"+vegetables+"']/parent::div[@qa='product_name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[@qa='add']")).click();
				
				
				//driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).click();
				
				
	
			}
		}
		
	}	
		
/*		for(int i=0;i<vegetablesList.size();i++) {
			
			List vegList = Arrays.asList(vegetables);
			System.out.println(vegList);
			
			if(vegetablesList.get(i).getText().contains("Tomato - Local")) {
				System.out.println("found : " + vegetablesList.get(i).getText());
				String elements = "//a[text()='"+vegetablesList.get(i).getText()+"']/parent::div[@class='col-sm-12 col-xs-7 prod-name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[@qa='add']";
				System.out.println(elements);
				Thread.sleep(5000);
				
				driver.findElement(By.xpath(elements)).click();
				if(driver.findElement(By.xpath("//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[1]/div/div[2]/a")).isEnabled() && driver.findElement(By.xpath("//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[1]/div/div[2]/a")).isDisplayed()) {
					driver.findElement(By.xpath("//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[1]/div/div[2]/a")).click();
				}
			} else {
				System.out.println(" not found : " + vegetablesList.get(i).getText());
			}
		}
	}
*/
		}



//Actions actions = new Actions(driver);
//actions.moveToElement((WebElement) By.xpath("//a[text()='Tomato - Hybrid']/parent::div[@class='col-sm-12 col-xs-7 prod-name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[@qa='add']")).click().build().perform();
