package Excel_programes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_fk_links {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("./Excel/Flipkartlinks.xlsx");
XSSFWorkbook book = new XSSFWorkbook(fis);
 XSSFSheet sheet = book.getSheet("linksheet");
int lastrow = sheet.getLastRowNum();
for(int i=0;i<=lastrow;i++)
{
	 XSSFRow row = sheet.getRow(i);
	XSSFCell cell = row.getCell(0);
String value = cell.getStringCellValue();
System.out.println(i+" "+value);	 
	}
book.close();
fis.close();

}}
