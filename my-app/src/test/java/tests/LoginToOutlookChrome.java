package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objects.LoginPageOutlook;

public class LoginToOutlookChrome {

	@Test 
	
	public void OpenOutlookPage()
	{
		//Go to outlook.live.com login page using Chrome browser
		System.setProperty("web.chrome.driver", "C:\\Program Files\\WebDrivers");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1521823276&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d4e8b666e-8c7f-6f23-41cb-8d097d22f079&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		LoginPageOutlook lp=new LoginPageOutlook(driver);
		
		//Sign in using email and password
		lp.EmailID().sendKeys("tc_fwork@outlook.com");
		lp.Next().click();
		lp.Password().sendKeys("Run44runhot");
		lp.SignIn().click();
		
	}
	
	
}
