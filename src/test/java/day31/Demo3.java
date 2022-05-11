package day31;

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

public class Demo3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./doc/Book3ma.xlsx"));
		Sheet sheet = wb.getSheet("sheet3");
		int rc = sheet.getLastRowNum();

		for (int i = 0; i <= rc; i++) {
			try {
				int cc = sheet.getRow(i).getLastCellNum();
				for (int j = 0; j < cc; j++) {
					try {
						String v = sheet.getRow(i).getCell(j).toString();
						System.out.print(v + " ");
					} catch (Exception e) {
						System.out.print("-- ");
					}
					Thread.sleep(500);
				}
			} catch (Exception e) {
				System.out.print("-- -- --");
			}

			System.out.println();
		}
		wb.close();
	}
}
