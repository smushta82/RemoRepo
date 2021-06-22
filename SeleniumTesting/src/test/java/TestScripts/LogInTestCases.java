package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Locators.DefaultPage;
import Locators.LoginPage;

public class LogInTestCases {
	//we will store all the test cases for login scenario here.
	@Test
	public void demoLoginWithPageFactory() throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "/Users/smushta/Downloads/chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.get("http://stackoverflow.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//below line will help you initialize all the elements in your page class.
		DefaultPage defPage = PageFactory.initElements(dr, DefaultPage.class);
		LoginPage logPage = PageFactory.initElements(dr, LoginPage.class);
//		defPage.clickOnAllCookieBtn();
//		dr.findElement(By.xpath("//div[4]/div/button[1]")).click();
//		defPage.clickOnLoginBtn();
//		logPage.performLogin("smushta82@gmail.com", "Adil0384!");
//		logPage.clickOnAskQuestionBtn();
//		logPage.clickOnPopUpWindow();
		Screen s = new Screen();
		s.click(System.getProperty("user.dir")+"/SikuliImages/SigninBtn.png");
		
		
	}
	
	

}
