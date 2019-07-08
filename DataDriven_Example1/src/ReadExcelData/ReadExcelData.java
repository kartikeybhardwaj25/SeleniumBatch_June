package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("F:\\DataDriven\\TestData.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));

	}

}
