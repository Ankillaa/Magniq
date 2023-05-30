package magneq.projectk.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtility {
	
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	String path;
	
	public ExcelUtility(String path) {
		this.path=path;
		
	}
	
	public int getRows(String TestData) throws IOException {
		
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(TestData);
		int rows=sheet.getLastRowNum();
		
		wb.close();
		fis.close();
		return rows;
		
	}
	
	public int GetCells(String sheetname,int rowCount) throws IOException {
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rowCount);
		int cells=row.getLastCellNum();
		
		wb.close();
		fis.close();
		return cells;
		
		
	}
	public String getData(String sheetname,int rowCount ,int cellCount) throws IOException {
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rowCount);
		cell=row.getCell(cellCount);
		String data=cell.getStringCellValue();
		wb.close();
		fis.close(); 
		return data;
		
		
	}
}
		
	
	
		
		
		
	


