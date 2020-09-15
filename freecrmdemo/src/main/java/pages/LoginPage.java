package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Fileutils;

public class LoginPage {
	@FindBy(xpath = "//input[@placeholder='E-mail address']")
	private WebElement loginName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement loginPassword;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement lgnBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginToPage() {
		loginName.sendKeys(Fileutils.loginName(1, 0, "Sheet1"));
		loginPassword.sendKeys(Fileutils.loginName(1, 1, "Sheet1"));
		lgnBtn.click();
	}

}
