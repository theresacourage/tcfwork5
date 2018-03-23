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
	
	
}
