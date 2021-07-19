package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
	
	WebDriver driver = null;
	
	public AuthenticationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email_create")
	private WebElement createAccountEmail;
	
	@FindBy(id="SubmitCreate")
	private WebElement createAccountSubmitButton;
	
	@FindBy(name="email")
	private WebElement loginEmail;

	
	@FindBy(name="passwd")
	private WebElement loginPassword;

	
	@FindBy(name="SubmitLogin")
	private WebElement loginSubmitButton;


	@FindBy(linkText = "Sign out")
	private WebElement signOutLink;
	
	public WebElement getCreateAccountEmail() {
		return createAccountEmail;
	}


	public void setCreateAccountEmail(String createAccountEmail) {
		this.createAccountEmail.sendKeys(createAccountEmail);;
	}


	public WebElement getLoginEmail() {
		return loginEmail;
	}


	public void setLoginEmail(String loginEmail) {
		this.loginEmail.sendKeys(loginEmail);
	}


	public WebElement getLoginPassword() {
		return loginPassword;
	}


	public void setLoginPassword(String loginPassword) {
		this.loginPassword.sendKeys(loginPassword);
	}


	public WebElement getCreateAccountSubmitButton() {
		return createAccountSubmitButton;
	}


	public WebElement getLoginSubmitButton() {
		return loginSubmitButton;
	}

	
	public void LoginToApplication(String username, String password) {
		this.setLoginEmail(username);
		this.setLoginPassword(password);
		this.getLoginSubmitButton().click();
	}


	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
