package magneq.projectk.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
     public void setUp() {
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 driver.manage().deleteAllCookies(); 
     }
	
	 @AfterClass
	 public void tearDown() {
		// driver.quit();
	 }
	
}
