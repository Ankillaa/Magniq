package magneq.projectk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import magneq.projectk.base.BaseClass;

public class RegisterPage extends BaseClass{

	public RegisterPage(WebDriver driver) {
		
		this.driver= driver;
		
		
	}
	
	By usernameLocator = By.xpath("//input[@name='username']");
	By passwordLocator = By.xpath("//input[@name='password']");
	By commentLocator=By.xpath("//textarea[@name='comments']");
	
	public void register(String username,String password,String comment) 
	{
		
		driver.findElement(usernameLocator).sendKeys(username);
		driver.findElement(passwordLocator).sendKeys(password);
		driver.findElement(commentLocator).sendKeys(comment);
		
		System.out.println("hi git hub");
		
	}
}
