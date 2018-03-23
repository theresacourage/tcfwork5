package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageEBay {

	WebDriver driver;
	
	public LoginPageEBay(WebDriver driver)
	{
		this.driver=driver;
	}
		
	public int AllLinks()
	{
		return driver.findElements(By.tagName("a")).size();
	}
	
	public int FooterSection()
	{
		WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		return footer.findElements(By.tagName("a")).size();
	
	}
	
	public int SecondColumnInFooter()
	{
		WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		return col.findElements(By.tagName("a")).size();
	
	}
		
}
