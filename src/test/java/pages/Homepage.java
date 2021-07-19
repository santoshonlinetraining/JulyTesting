package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver = null;
	
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;
	
	@FindBy(linkText ="Sign in")
	private WebElement signInLink;
	
	
	@FindBy(linkText = "Contact us")
	private WebElement contactUs;


	


	public WebElement getSearchTextBox() {
		return searchTextBox;
	}


	public void setSearchTextBox(String str) {
		this.searchTextBox.sendKeys(str);
	}


	public WebElement getSignInLink() {
		return signInLink;
	}


	public WebElement getContactUs() {
		return contactUs;
	}


	
	
	
}
