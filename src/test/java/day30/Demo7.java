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

//counting number of columns
public class Demo7 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./doc/Book5.xlsx"));

		int cc1 = wb.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(cc1);

		int cc2 = wb.getSheet("sheet2").getRow(0).getLastCellNum();
		System.out.println(cc2);

		int cc3 = wb.getSheet("sheet3").getRow(0).getLastCellNum();
		System.out.println(cc3);

		wb.close();
	}
}
