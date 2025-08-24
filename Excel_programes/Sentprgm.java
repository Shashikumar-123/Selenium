package Excel_programes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sentprgm {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sentientgaming.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
				
		
XSSFWorkbook book = new XSSFWorkbook();
XSSFSheet sheet = book.createSheet("links");
int i=0;
for(WebElement url:ele)
{
String allurl = url.getAttribute("href");
XSSFRow row = sheet.createRow(i);
XSSFCell cell = row.createCell(0);
cell.setCellValue(allurl);
i++;
}
FileOutputStream fos = new FileOutputStream("./Excel/sentient.xlsx");
book.write(fos);
book.close();
fos.close();


}}
