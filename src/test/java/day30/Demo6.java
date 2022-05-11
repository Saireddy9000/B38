package day30;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//counting number of rows
public class Demo6 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./doc/Book4.xlsx"));
		int rc1 = wb.getSheet("sheet1").getLastRowNum();
		System.out.println(rc1);

		int rc2 = wb.getSheet("sheet2").getLastRowNum();
		System.out.println(rc2);

		int rc3 = wb.getSheet("sheet3").getLastRowNum();
		System.out.println(rc3);

		wb.close();
	}
}
