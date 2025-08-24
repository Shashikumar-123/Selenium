package Excel_programes;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	/*
	 public static void main(String[] args) throws IOException {
	
FileOutputStream fos = new FileOutputStream("./Excel/data.xlsx");
XSSFWorkbook book = new XSSFWorkbook();
XSSFSheet sheet = book.createSheet("data");



String[][] users= {
		{"Admin0","admin@123"},
		{"Admin1","admin@123"},
		{"Admin2","admin@123"},
};

for(int i=0;i<users.length;i++)
{
	XSSFRow row1 = sheet.createRow(i);
	row1.createCell(0).setCellValue(users[i][0]);
	row1.createCell(1).setCellValue(users[i][1]);			
}
book.write(fos);
book.close();
fos.close();
System.out.println("data entered");

	}
 */
	public static void main(String[]args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("./Excel/mmm.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
	XSSFSheet sheet = book.createSheet("sheet1");
	String[][] cred= {
			{"abc1","password1"},{"abc2","password2"},{"abc3","password3"}
	};
	
	for(int i=0;i<=2;i++)
	{
		XSSFRow row = sheet.createRow(i);
 XSSFCell username = row.createCell(0);
 username.setCellValue(cred[i][0]);
		XSSFCell password = row.createCell(1);password.setCellValue(cred[i][1]);		
	}
book.write(fos);
book.close();
fos.close();
System.out.println("dd");
	}
	
}
