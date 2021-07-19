package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

WebDriver driver = null;
	
	public MyAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement myAccPageHeading;

	public WebElement getMyAccPageHeading() {
		return myAccPageHeading;
	}
	
	
	
}
