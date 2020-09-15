package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Fileutils;

public class HomePage {

	@FindBy(xpath = "//span[.='Contacts']")
	private WebElement contact;
	@FindBy(xpath ="//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "i[class='save icon']")
	private WebElement save;
	@FindBy(xpath = "//span[.='Contacts']")
	private WebElement contact1;
	@FindBy(xpath = "//td[.='yogi mishra']")
	private WebElement checkbox;
	@FindBy(xpath = "//i[@class='trash icon']")
	private WebElement delete;
	@FindBy(xpath = "//button[@class='ui button']")
	private WebElement clickdelete;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterHomePage()
	{
		contact.click();
		firstname.sendKeys(Fileutils.loginName(2, 0, "sheet1"));
		lastname.sendKeys(Fileutils.loginName(2,1, "sheet1"));
		save.click();
		
	}
	
}
