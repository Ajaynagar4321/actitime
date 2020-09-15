package script;

import org.testng.annotations.Test;

import generic.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TestHomePage extends BaseClass {
	
	
	@Test
	public void TestUser() {
		LoginPage lp = new LoginPage(driver);
		lp.loginToPage();
	}
	
	public void homepage()
	{
		HomePage hp=new HomePage(driver);
		hp.enterHomePage();
	}

}
