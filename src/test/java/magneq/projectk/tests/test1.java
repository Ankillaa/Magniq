package magneq.projectk.tests;

import java.io.IOException;

import magneq.projectk.utility.ExcelUtility;

public class test1 {
	@org.testng.annotations.Test
	public void Test() throws IOException{
		ExcelUtility eu=new ExcelUtility("C:\\Users\\ankil\\Desktop\\TestData.xlsx");
		int rowCount=eu.getRows("Data");
		System.out.println(rowCount);
		int cellCount=eu.GetCells("Data", rowCount);
		System.out.println(cellCount);
		
	}
	

}
