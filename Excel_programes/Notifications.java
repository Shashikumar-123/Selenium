package Excel_programes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(co);
			driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[.='Notification']")).click();
			
	}

}
