package day30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * Excel file is called as workbook
 * workbook contains sheet
 * sheet contains rows
 * rows contains cells
 * cell contains data
 * 
 * 
 */
public class Demo1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./doc/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String v = c.getStringCellValue();
		System.out.println(v);
		wb.close();
	}
}
