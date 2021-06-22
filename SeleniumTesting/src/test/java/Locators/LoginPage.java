package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver dr;
	
	public LoginPage(WebDriver dr) {
		this.dr = dr;
	}
	
	@FindBy(id="email") WebElement email;
	
	@FindBy(id="password") WebElement pass;
	
	@FindBy(id="submit-button") WebElement LoginBtn;
	
	@FindBy(xpath="//*[@href='/questions/ask']") WebElement AskQuestBtn;
	
	@FindBy(xpath="/html/body/aside/div/div[2]/button[2]")WebElement PopupWindow;
	
	@FindBy(xpath="/html/body/div[4]/div/button[1]") WebElement AcceptAllCookieBtn;
	
	public void performLogin(String emailID, String pwd) {
		email.sendKeys(emailID);
		pass.sendKeys(pwd);
		LoginBtn.click();
	}
	public void clickOnAskQuestionBtn() {
		AskQuestBtn.click();
	}
	public void clickOnPopUpWindow() {
		PopupWindow.click();
	}
	public void clickOnAcceptAllCookieBtn() {
		AcceptAllCookieBtn.click();
	}
	
}
