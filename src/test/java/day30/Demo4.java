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


	public class Demo4 {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {

			Workbook wb = WorkbookFactory.create(new FileInputStream("./doc/Book2.xlsx"));

			CellType t1 = wb.getSheet("sheet1").getRow(0).getCell(0).getCellType();
			System.out.println(t1);
			
			String v=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
			System.out.println(v);
			
			String s1=wb.getSheet("sheet1").getRow(0).getCell(0).toString();
			System.out.println(s1);
			
			
			
			CellType t2 = wb.getSheet("sheet1").getRow(0).getCell(1).getCellType();
			System.out.println(t2);
			
			double v2 = wb.getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
			System.out.println(v2);
			
			String s2=wb.getSheet("sheet1").getRow(0).getCell(1).toString();
			System.out.println(s2);
			
			
			
			CellType t3 = wb.getSheet("sheet1").getRow(0).getCell(2).getCellType();
			System.out.println(t3);
			
			boolean v3 = wb.getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
			System.out.println(v3);
			
			String s3=wb.getSheet("sheet1").getRow(0).getCell(2).toString();
			System.out.println(s3);
			
			
			CellType t4 = wb.getSheet("sheet1").getRow(0).getCell(3).getCellType();
			System.out.println(t4);

			String s4=wb.getSheet("sheet1").getRow(0).getCell(3).toString();
			System.out.println(s4);
			
			
			CellType t5 = wb.getSheet("sheet1").getRow(0).getCell(4).getCellType();
			System.out.println(t5);

			double v5= wb.getSheet("sheet1").getRow(0).getCell(4).getNumericCellValue();
			int i=(int)v5;
			System.out.println(i);
			
			String s5=wb.getSheet("sheet1").getRow(0).getCell(4).toString();
			String s6=s5.replaceAll(".0","");
			System.out.println(s6);
			
			
			
			wb.close();
		}
	}












