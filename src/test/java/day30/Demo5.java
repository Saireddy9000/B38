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

public class Demo5 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./doc/Book3.xlsx"));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String v = wb.getSheet("sheet1").getRow(i).getCell(j).toString();
				System.out.print(v + " ");
			}

			System.out.println();
		}
		wb.close();
	}
}
