package WriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet_Eg1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\poiexcel\\test.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		sh.getRow(1).createCell(2).setCellValue("Pass");
		sh.getRow(2).createCell(2).setCellValue("Failed");
		
		FileOutputStream fout = new FileOutputStream(file);
		
		wb.write(fout);
		wb.close();
		

	}

}
