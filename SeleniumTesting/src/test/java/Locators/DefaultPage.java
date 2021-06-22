package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DefaultPage {
	WebDriver dr;
	
	public DefaultPage(WebDriver dr) {
		this.dr= dr;
	}
	
	// There are 2 ways you could locate an element in a webpage.
	@FindBy(linkText = "Log in") WebElement LoginBtn;
	//@FindBy(how=How.LINK_TEXT, using = "Log in") WebElement LoginBtn;
	
	//@FindBy(linkText = "Sign up") WebElement SignupBtn;
	@FindBy(how=How.LINK_TEXT, using = "Sign up") WebElement SignupBtn;
	
	@FindBy() WebElement AllCookieBtn;
	
	public void clickOnLoginBtn() {
		LoginBtn.click();
	}
	public void clickOnSignupBtn() {
		SignupBtn.click();
	}
	public void clickOnAllCookieBtn() {
		AllCookieBtn.click();
	}

}
