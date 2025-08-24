package Excel_programes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
FileInputStream fis= new FileInputStream("./Excel/Integration.xlsx");
XSSFWorkbook book = new XSSFWorkbook(fis);
XSSFSheet sheet = book.getSheet("Sheet3");
XSSFRow row = sheet.getRow(0);
XSSFCell cell = row.getCell(0);
String value = cell.getStringCellValue();
System.out.println(value);
book.close();
fis.close();
	}

}
