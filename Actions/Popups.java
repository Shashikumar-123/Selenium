package Actions;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		/*ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("browNotButton")).click();
		driver.close();
		
		*/
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='view more']")).click();
     Set<String> window = driver.getWindowHandles();
  for(String handle:window)
  {
	WebDriver browser = driver.switchTo().window(handle);
String title = browser.getTitle();
System.out.println(title);
//if(!title.equals("Demoapps - Luxury Watch"))
if(!title.equals("DemoApps | Qspiders | Browser Windows"))
{
 browser.close();

 
  System.out.println(title);

} 
  }}}


