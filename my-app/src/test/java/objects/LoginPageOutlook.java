package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageOutlook {

	WebDriver driver;
	By email=By.name("loginfmt");
	By next=By.cssSelector("input#idSIButton9.btn.btn-block.btn-primary");
	By password=By.name("passwd");
	By signin=By.id("idSIButton9");
	//By outlooktitle=By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/a/span");
	By outlooktitle=By.cssSelector("#app > div > div._3fpgaLm7NwXSzB_ETFcCNj > div.ms-FocusZone._2gjMH0HMa1J6DEB53u022T > a > span");
	
	
	public LoginPageOutlook(WebDriver driver)
	{
		this.driver=driver;
	}
		
	public WebElement EmailID()
	{
		return driver.findElement(email);
	}
	
	public WebElement Next()
	{
		return driver.findElement(next);
	}

	public WebElement Password() {
		
		return driver.findElement(password);
	}

	public WebElement SignIn() {
		
		return driver.findElement(signin);
		
	}
	
	public WebElement getOutlookTitle()
	{
		return driver.findElement(outlooktitle);
	}
	
	
}
