package magneq.projectk.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import magneq.projectk.base.BaseClass;
import magneq.projectk.utility.ExcelUtility;

public class ExcelUtilityUse extends BaseClass {
	@Test
	public void set() throws IOException {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		ExcelUtility eu=new ExcelUtility("C:\\Users\\ankil\\Desktop\\excelData.xlsx");
		
		driver.findElement(By.id("firstName")).sendKeys(eu.getData("sheet1", 1, 0));
		driver.findElement(By.id("lastname")).sendKeys(eu.getData("sheet1", 0, 1));
		
	}
	
	
	
	
	

}
