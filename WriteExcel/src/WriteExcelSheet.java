import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\poiexcel\\test.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		sh.getRow(0).createCell(2).setCellValue("Pass");
		sh.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		

	}

}
