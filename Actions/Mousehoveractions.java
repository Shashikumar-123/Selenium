package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveractions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
WebElement ele2 = driver.findElement(By.xpath("//a[.='Documentation']"));
//WebElement ele3 = driver.findElement(By.xpath("//span[.='Fashion']"));
WebElement ele4 = driver.findElement(By.xpath("//span[.='Projects']"));


	Actions a = new Actions(driver);
	Robot r = new Robot();
	ArrayList<WebElement>list = new ArrayList<>();
	list.add(ele1);
	list.add(ele2);
//	list.add(ele3);
	list.add(ele4);
	for(WebElement arr:list)
	{
		a.contextClick(arr).perform();
		r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);

	//driver.quit();
	}}
	

}
