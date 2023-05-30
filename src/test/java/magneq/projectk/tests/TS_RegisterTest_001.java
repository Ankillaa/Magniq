package magneq.projectk.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import magneq.projectk.base.BaseClass;
import magneq.projectk.pages.RegisterPage;

public class TS_RegisterTest_001 extends BaseClass {

	RegisterPage rp;
	@Test(priority = 1,description = "Validating the title")
	public void tc_01() {
		
		driver.get("https://testpages.herokuapp.com/basic_html_form.html");
		
		String expect = "HTML Form Elements";
		System.out.println("The expect title of the page = "+expect);
		String actual = driver.getTitle();
		System.out.println("The actual title of the page = "+actual);
		Assert.assertEquals(actual, expect);
		
	}
	
	@Test(priority = 02,description = "Validating the URL")
	
	public void tc_02() {
		String ExpectedURL="https://testpages.herokuapp.com/basic_html_form.html";
		System.out.println("the expected URL"+ ExpectedURL);
		String ActualURL=driver.getCurrentUrl();
		System.out.println("the ActualURL"+ ActualURL);
		Assert.assertEquals(ActualURL, ExpectedURL);	
	}

	@Test(priority = 3,description = "validate the first name and password with valid credentials")
	public void tc_03() {
		rp=new RegisterPage(driver);
		rp.register("surya","Test@123","comments");
	}
	
	@Test(priority = 4,description = "validate the first name and password with invalid credentials")
	public void tc_04() {
		rp=new RegisterPage(driver);
		rp.register("suryaabcdefghijklm","Test@123fjgjlkjvmlooooo","lakj;fE");
	}
	
	@Test(priority = 5,description = "file uploading")
	public void tc_05() throws InterruptedException, AWTException {
		WebElement ele=driver.findElement(By.xpath("(//tr)[4]"));
		ele.click();
		Thread.sleep(3000);
	String path ="C:\\Users\\ankil\\Downloads\\Selenium Material.pdf";
		
		StringSelection select = new StringSelection(path);
		
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		clip.setContents(select, select);
		
		Thread.sleep(3000);
		
		Robot robo = new  Robot();
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.delay(3000);
			
		
        robo.keyPress(KeyEvent.VK_ENTER);	
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	@Test(priority = 6, description = "validating checkboxes")
	public void tc_06() {
		driver.findElement(By.xpath("//input[@name='checkboxes[]']")).click();
			
	}
	@Test(priority = 7, description = "validating radio buttons")
	public void tc_07() {
		driver.findElement(By.xpath("(//input[@name='radioval'])[1]")).click();
			
	}
	
	
	
	
	
}
