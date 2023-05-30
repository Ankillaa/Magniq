package magneq.projectk.pages;

import java.io.IOException;

import org.testng.annotations.Test;

import magneq.projectk.utility.ExcelUtility;

public class exceltest {
	@Test
	public void dataRead()throws IOException
	{
		ExcelUtility eu=new ExcelUtility("C:\\\\Users\\\\ankil\\\\Desktop\\\\TestData.xlsx");
		String value=eu.getData("Data", 0,0 );
		System.out.println(value);
		int rows=eu.getRows("Data");
		int cols=eu.GetCells("data", rows);	
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println(eu.getData("Data", i, j));
			}
			System.out.println();
		}
	}

}
