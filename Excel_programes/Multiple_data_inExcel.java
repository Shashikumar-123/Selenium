package Excel_programes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_data_inExcel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> url = driver.findElements(By.xpath("//a"));
		XSSFWorkbook book = new XSSFWorkbook();
	XSSFSheet sheet = book.createSheet("linksheet");
	int i=0;
	for(WebElement links:url)
	{
	String lin = links.getAttribute("href");
 XSSFRow row = sheet.createRow(i);
 XSSFCell cell = row.createCell(0);
 cell.setCellValue(lin);
 i++;
	}
	FileOutputStream fos=new FileOutputStream("./Excel/Flipkartlinks.xlsx");
	book.write(fos);
	book.close();
	fos.close();
	driver.close();
	}}
