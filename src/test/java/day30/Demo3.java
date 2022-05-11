package day30;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
public class Demo3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// open the xl file
		Workbook wb = WorkbookFactory.create(new FileInputStream("./doc/Book1.xlsx"));
		// goto sheet1-> 1st row->1st cell-> get data
		// String
		// v=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		// System.out.println(v);

		Cell c = wb.getSheet("sheet1").getRow(0).getCell(0);
		System.out.println(c);// in Cell class toString() method overriden

		wb.close();
	}
}
