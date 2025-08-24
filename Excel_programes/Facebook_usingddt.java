package Excel_programes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_usingddt  {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/mmm.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
	XSSFSheet sheet = book.getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
int rowlast = sheet.getLastRowNum();


for(int i=0;i<=rowlast;i++)
{
	XSSFRow row = sheet.getRow(i);
String UN = row.getCell(0).getStringCellValue();
String password = row.getCell(1).getStringCellValue();

driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
 driver.findElement(By.id("email")).sendKeys(UN);
 driver.findElement(By.id("pass")).sendKeys(password);
 driver.findElement(By.name("login")).click();

	}

}}
