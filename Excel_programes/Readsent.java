package Excel_programes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readsent {

	public static void main(String[] args) throws IOException {

FileInputStream fis = new FileInputStream("./Excel/sentient.xlsx");

XSSFWorkbook book = new XSSFWorkbook(fis);
XSSFSheet sheet = book.getSheet("links");
int lrow = sheet.getLastRowNum();
for(int i=0;i<lrow;i++)
{
	XSSFRow row = sheet.getRow(i);
XSSFCell cell = row.getCell(0);
String result = cell.getStringCellValue();
System.out.println(result);
}
book.close();
fis.close();
	}

}
