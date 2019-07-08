package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	public  ExcelDataConfig(String excelpath) {
		
		try {
			File src =  new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			
			 wb =new XSSFWorkbook(fis);
			
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} 
		
	}
	
	public String getData(int SheetNumber, int row, int col) {
		sh = wb.getSheetAt(0);
		String data0 = sh.getRow(row).getCell(col).getStringCellValue();
		return data0;
	}
	
	public int getRowCount(int RowIndex) {
		int row = wb.getSheetAt(0).getLastRowNum();
		row =row+1;
		
		return row;
		
		
		
	}
	

}
