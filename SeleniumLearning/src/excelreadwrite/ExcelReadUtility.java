package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {
	public String excelReading(int sheetNo,int rowValue,int cellValue) throws IOException {
		File path = new File("C:\\Users\\Swapnil Bhosale\\Desktop\\VelocityforSelenium.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		return sheet1.getRow(rowValue).getCell(cellValue).getStringCellValue();
	}
	public static void main(String[] args) throws IOException {
		ExcelReadUtility exRead= new ExcelReadUtility();
		System.out.println(exRead.excelReading(0,0,0));
		System.out.println(exRead.excelReading(0,0,1));
		System.out.println(exRead.excelReading(0,0,2));
	}

}
