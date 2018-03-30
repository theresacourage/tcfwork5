package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objects.LoginPageOutlook;
import objects.OutlookHomePage;

public class LoginToOutlook {

	@Test 	
	public void OpenOutlookPage() throws InterruptedException
	{
		
			System.setProperty("web.chrome.driver", "C:\\Program Files\\WebDrivers");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1521823276&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d4e8b666e-8c7f-6f23-41cb-8d097d22f079&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
			LoginPageOutlook lp=new LoginPageOutlook(driver);
			OutlookHomePage hp=new OutlookHomePage(driver);
						
		
				
	}
	
	
}
