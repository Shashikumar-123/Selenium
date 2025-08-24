package Excel_programes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practiceexcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	try {
	WebElement clsbtn = driver.findElement(By.xpath("//button[contains(.,'X')]"));
	clsbtn.click();
	}
	catch(Exception e)
	{
		System.out.println("exception handled");
	}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
		Thread.sleep(5000);
			
			
	 List<WebElement> elements = driver.findElements(By.xpath("//*"));
	 
	 XSSFWorkbook book = new XSSFWorkbook();
	 XSSFSheet sheet = book.createSheet("totaltexts");

int i=0;	 
	 for(WebElement total:elements)
	{
	
			 String text = total.getText().trim();
			 if(!text.isEmpty())
			 {
	XSSFRow row = sheet.createRow(0);
	XSSFCell cell = row.createCell(0);
	cell.setCellValue(text);
	i++;
	}}
		
	 FileOutputStream fis = new FileOutputStream("./Excel/sentientgaming1.xlsx");
	
	 book.write(fis);
	 book.close();
	 fis.close();
	 System.out.println("data written successfully");
	
}

}
/*
public class Practiceexcel {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sentientgaming.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Wait for dynamic content to load (or use WebDriverWait for specific content)
        Thread.sleep(3000); // Optional but helps if content is loading after scroll

        // 🔁 Re-fetch elements AFTER scroll & DOM update
        List<WebElement> elements = driver.findElements(By.xpath("//*"));

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("totaltexts");

        int i = 0;
        for (WebElement total : elements) {
           
                String text = total.getText().trim();
                if (!text.isEmpty()) {
                    XSSFRow row = sheet.createRow(i++);
                    XSSFCell cell = row.createCell(0);
                    cell.setCellValue(text);
                }
                    }

        FileOutputStream fis = new FileOutputStream("./Excel/sentientgaming.xlsx");
        book.write(fis);
        book.close();
        fis.close();
        System.out.println("Data written successfully");

        driver.quit();
    }
}
*/