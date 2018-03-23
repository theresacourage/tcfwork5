package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objects.LoginPageEBay;


public class EbayLinks2{

	@Test
	public void CountLinksOnEbayHomepage() 
	{
		// Go to ebay in Chrome Browser
		System.setProperty("web.chrome.driver", "C:\\Program Files\\WebDrivers");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com/");
		LoginPageEBay ebay=new LoginPageEBay(driver);
				
		//Count of the Link in the Entire Page
		System.out.println("Number of links on the eBay Homepage");
		System.out.println(ebay.AllLinks());
		
		
		
		//Count of links in the second column of the footer section of the page
		System.out.println("Links in the 2nd column of the footer section");
		System.out.println(ebay.SecondColumnInFooter());
		
	}
	
	@Test
	
	public void CountLinksInFooterEbayHomepage() 
	{
		// Go to ebay in Chrome Browser
				System.setProperty("web.chrome.driver", "C:\\Program Files\\WebDrivers");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.ebay.com/");
				LoginPageEBay ebay=new LoginPageEBay(driver);
		
		//Count of links in the footer section of the page
				System.out.println("Links in the footer section");
				System.out.println(ebay.FooterSection());
	}
	
@Test
	
	public void CountLinksInSecondColumnOfFooter() 
	{
		// Go to ebay in Chrome Browser
				System.setProperty("web.chrome.driver", "C:\\Program Files\\WebDrivers");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.ebay.com/");
				LoginPageEBay ebay=new LoginPageEBay(driver);
		
		//Count of links in the footer section of the page
				System.out.println("Links in the footer section");
				System.out.println(ebay.FooterSection());
	}
	
	

	                   
}



