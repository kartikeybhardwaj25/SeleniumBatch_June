package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_All {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src =  new File("F:\\DataDriven\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowCount = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(rowCount);
		
		for(int i=0;i<rowCount;i++) {
		
		String data0 = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Value is: " +data0);
		}
		
		wb.close();

	}

}
