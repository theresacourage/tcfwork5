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

public class LogOutOfOutlook {
		
	@Test 	
	public void OpenOutlookPage() throws InterruptedException
		{
			System.setProperty("web.chrome.driver", "C:\\Program Files\\WebDrivers");
			WebDriver driver=new ChromeDriver();
			OutlookHomePage hp = new OutlookHomePage(driver);
			
			//Logout code under construction
				
	}

}
