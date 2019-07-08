package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_v1 {

	public static void main(String[] args) throws IOException {
		
		
		File src = new File("C:\\Users\\kartikey\\eclipse-workspace\\DataDriven_Example1\\src\\TestData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		
		
		
		
		int rowNum= wb.getSheetAt(0).getLastRowNum();
		
		for (int i =0;i<= rowNum;i++) {
			String data0 = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Value of cell is " +data0);
			
			String data1 = sh.getRow(i).getCell(2).getStringCellValue();
			System.out.println("Value of cell is " +data1);
		}
		
		wb.close();
		
		
		
		
		
		
		

	}

}
