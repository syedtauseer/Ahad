package script;

import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

import generic.BaseTest;

import page.LoginPage;

public class InValidLogin extends BaseTest {
	@Test(dataProvider = "getData", priority = 2, groups = { "Smoke" })
	public void testInValidLogin(String un, String pw) {
		LoginPage login = new LoginPage(driver);
		Reporter.log("Enter Valid User Name", true);
		login.enterUserName(un);
		Reporter.log("Enter Valid Password", true);
		login.enterPassword(pw);
		Reporter.log("Click on Login Button", true);
		login.clickLogin();
		Reporter.log("Verify Error Message is displayed", true);
		boolean result = login.verifyErrorMsg(wait);
		Assert.assertTrue(result, "error message is not displayed");
		test.pass("error message is Displayed");
		Reporter.log("Error Message is Displayed", true);

	}

}
