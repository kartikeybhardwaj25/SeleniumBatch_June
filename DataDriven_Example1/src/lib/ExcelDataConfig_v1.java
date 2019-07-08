package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig_v1 {
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelDataConfig_v1(String excelpath) throws IOException {
		
		File src =  new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		
		 wb =new XSSFWorkbook(fis);
		
		 
	}



	public String getData(int SheetNumber,int Row,int Col) {
	sh = wb.getSheet("Sheet1");
	String data0 = sh.getRow(Row).getCell(Col).getStringCellValue();
	
	return data0;
	
	
}
	public int getRowCount(int RowIndex) {
		int row = wb.getSheetAt(0).getLastRowNum();
		
		row =row+1;
		
		return row;
	}
	
}

