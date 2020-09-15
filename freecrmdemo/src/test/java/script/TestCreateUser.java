package script;

import org.testng.annotations.Test;

import generic.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TestCreateUser extends BaseClass {

	@Test
	public void TestUser() {
		LoginPage lp = new LoginPage(driver);
		lp.loginToPage();
		
	}
}
