package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_hold {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
	Thread.sleep(2000);

	WebElement cir = driver.findElement(By.id("circle"));
	Thread.sleep(2000);
	Actions a = new Actions(driver);
	a.clickAndHold(cir).perform();
	Thread.sleep(2000);
a.release();
driver.close();

}
}