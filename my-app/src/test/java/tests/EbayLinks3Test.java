package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import objects.LoginPageEBay;


public class EbayLinks3Test{

		
	@Test
	public void CountLinksOnEbayHomepage() 
	{
		// Go to ebay in Chrome Browser
			System.setProperty("web.chrome.driver", "C:\\Program Files\\WebDrivers");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.ebay.com/");
			LoginPageEBay ebay=new LoginPageEBay(driver);
							
		//Count of the links in the entire homepage
			System.out.println("Number of links on the eBay Homepage ");
			System.out.println(ebay.AllLinks());
			//Assert.assertEquals(380,ebay.AllLinks());
	
		//Count of links in the footer section of the page
				System.out.println("Links in the footer section");
				System.out.println(ebay.FooterSection());
				Assert.assertEquals(87, ebay.FooterSection());
			
		//Count of links in the second column of the footer section of the page
				System.out.println("Links in the 2nd column of the footer section");
				System.out.println(ebay.SecondColumnInFooter());
				Assert.assertEquals(10, ebay.SecondColumnInFooter());
	}
                 
}



