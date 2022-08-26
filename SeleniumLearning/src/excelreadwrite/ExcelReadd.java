package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadd {

	public static void main(String[] args) throws IOException {
		File path = new File("C:\\Users\\Swapnil Bhosale\\Desktop\\VelocityforSelenium.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		XSSFSheet sheet2 = workbook.getSheetAt(1);
		String data1 = sheet2.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);

	}

}
