package day31;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/* never throw exception -always handle it
 * never hard code the input- method arg
 * 
 * by default make the method as static unless if it is accessing any 
 * non static member of the class
 */
public class Demo4 {

	public static String getXLData(String path, String sheet, int row, int col) {
		String v = "";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v = wb.getSheet(sheet).getRow(row).getCell(col).toString();
			wb.close();
		} catch (Exception e) {
		}
		return v;
	}

	public static int getXlRowCount(String path, String sheet) {
		int row = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			row = wb.getSheet(sheet).getLastRowNum();
			wb.close();
		} catch (Exception e) {
		}
		return row;
	}

	public static int getXlColCount(String path, String sheet, int row) {
		int col = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			col = wb.getSheet(sheet).getRow(row).getLastCellNum();
			wb.close();
		} catch (Exception e) {
		}
		return col;
	}

	public static void main(String[] args) {
		String path = "./doc/login.xlsx";
		String sheet = "sheet1";

		int rc = Demo4.getXlRowCount(path, sheet);
		System.out.println(rc);

		int cc = Demo4.getXlColCount(path, sheet, 0);
		System.out.println(cc);

		for (int i = 0; i <= rc; i++) {

			for (int j = 0; j < cc; j++) {
				String v = Demo4.getXLData(path, sheet, i, j);
				System.out.print(v + " ");
			}
			System.out.println();
		}

		String un = Demo4.getXLData("./doc/login.xlsx", "sheet1", 1, 0);
		System.out.println(un);

		String pw = Demo4.getXLData("./doc/login.xlsx", "sheet1", 1, 1);
		System.out.println(pw);

	}
}
