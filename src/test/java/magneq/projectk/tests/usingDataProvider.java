package magneq.projectk.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import magneq.projectk.utility.ExcelUtility;

public class usingDataProvider {
	
	
	@Test(dataProvider = "data")
	public void dataTest(String user, String pwd) {
		System.out.print(user);
		System.out.print("|"+ pwd);
		System.out.println();
	}
	@Test(dataProvider = "excelData")
	public void dataExcelTest(String username, String password) {
		System.out.print(username);
		System.out.print("|"+ password);
		System.out.println();
	}
	
	@DataProvider(name = "data")
	public String[][] getData(){
		String values[][]= {{"un1","pw1"},{"un2","pw2"}};
		return values;
	}
	
	@DataProvider(name="excelData")
	public String[][] getExcelData() throws IOException{
		ExcelUtility eu=new ExcelUtility("C:\\Users\\ankil\\Desktop\\excelData.xlsx");
		int rows=eu.getRows("Sheet1");System.out.println("rows="+rows);
		int cols=eu.GetCells("Sheet1", rows);System.out.println("cols="+cols);
		String values[][]=new String[rows][cols];
		
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				values[i-1][j]=eu.getData("Sheet1",i, j);
			}
		}
		return values;
	}
}
