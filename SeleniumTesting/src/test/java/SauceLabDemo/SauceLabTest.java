package SauceLabDemo;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceLabTest {
	
	public static final String USERNAME = "Smushta82";
	public static final String ACCESS_KEY = "943a5717-1f67-4f7f-805e-b94358cfbc95";
	public static final String URL = "https://Smushta82:943a5717-1f67-4f7f-805e-b94358cfbc95@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	@Test
	public static void test1() throws Exception {
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "MacOS");
		caps.setCapability("version", "latest");
		
		WebDriver dr = new RemoteWebDriver(new java.net.URL(URL), caps);
		//System.setProperty("webdriver.chrome.driver", "/Users/smushta/Downloads/chromedriver");
		//WebDriver dr = new ChromeDriver();
		dr.get("http://www.google.com");
		System.out.println(dr.getTitle());
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Automation Step by Step");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		dr.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
		System.out.println(dr.getTitle());
		dr.quit();
		System.out.println("Test Completed");
	}

}
