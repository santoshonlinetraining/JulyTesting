package jun27;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import testbase.TestBase;

public class LoginToApp extends TestBase{

	@Test(groups= {"login", "smoke", "regression"})
	public void Login() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test is Started");
		
		logger.log(LogStatus.INFO, "Clicking on the Sign-in link");
		homePageObj.getSignInLink().click();
		
		logger.log(LogStatus.INFO, "Enter the username and password in authentication Page");
		authPageObj.setLoginEmail(prop.getProperty("Username"));
		authPageObj.setLoginPassword(prop.getProperty("Password"));
		authPageObj.getLoginSubmitButton().click();
		
		logger.log(LogStatus.PASS, "Logged in Successfully");
	}
	
	@Test(groups= {"search", "regression"})
	public void search() {
		Login();
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test is Started");
		
		logger.log(LogStatus.INFO, "In Home page Serch with T-Shirts");
		homePageObj.setSearchTextBox("T-Shirts");
		
		logger.log(LogStatus.PASS, "Searhed successfully");
	}
	
	
	@Test(groups= {"contactus", "smoke", "regression"})
	public void verifyContactUs() {
		homePageObj.getContactUs().click();
	}
	
	@Parameters({"username","password"})
	@Test(groups= {"login", "regression"})
	public void login2(String uname, String pword) {
		homePageObj.getSignInLink().click();
		
		authPageObj.LoginToApplication(uname, pword);
	}
	
	@Test(groups= {"login", "regression"})
	public void login3() throws InterruptedException {
		homePageObj.getSignInLink().click();
		
		int rowcount = excelReader.getRowCount("Login-Cred");
		
		for(int i=2; i<=rowcount; i++) {
			String username = excelReader.getCellData("Login-Cred", "Username", i);
			String password = excelReader.getCellData("Login-Cred", "Password", i);
			authPageObj.LoginToApplication(username, password);
			Thread.sleep(5000);
			authPageObj.getSignOutLink().click();
		}
	}
	
	@Test(groups= {"login", "regression"})
	public void login4() throws InterruptedException {
		String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();
		
		logger = extent.startTest(TestcaseId, "Test is Started");

		logger.log(LogStatus.INFO, "Clicking on the Sign-in link");

		homePageObj.getSignInLink().click();

		String username = excelReader.getCellData("Login-Cred", "Username", 3);
		String password = excelReader.getCellData("Login-Cred", "Password", 3);
		authPageObj.LoginToApplication(username, password);
		
		String pageHeading = "MY ACCOUNT";
		
		String webPageHeading = myAccObj.getMyAccPageHeading().getText();
		
		if(pageHeading.equals(webPageHeading)) {
			logger.log(LogStatus.PASS, "Testcase PASS");
			Assert.assertEquals(pageHeading, webPageHeading);
		} else {
			logger.log(LogStatus.FAIL, "Testcase Fail");
			Assert.assertEquals(pageHeading, webPageHeading);
		}
		
	}	
	
	
}
