package Yard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Specify the location of Excel file
		File src = new File("D:\\Log4j_jars\\New folder\\Test.xlsx");

		// Load File
		FileInputStream fis = new FileInputStream(src);

		// Load WorkBook
		// XSSFWorkbook wb=new XSSFWorkbook(fis);
		//XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);

		// Load WrokShee
		XSSFSheet sh = wb.getSheet("Sheet1");

		// print the loaded sheet name
		System.out.println(sh.getSheetName());

	}

}
