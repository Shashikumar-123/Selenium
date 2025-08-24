package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	Thread.sleep(2000);
//WebElement src1 = driver.findElement(By.xpath("//div[.='Rome']"));//text function not working 
//WebElement dst1 = driver.findElement(By.xpath("//div[.='Italy']"));
	WebElement src1 = driver.findElement(By.id("box6"));
	WebElement dst1 = driver.findElement(By.id("box106"));
	
	WebElement src2 = driver.findElement(By.id("box3"));
	WebElement dst2 = driver.findElement(By.id("box103"));
Actions act = new Actions(driver);
act.dragAndDrop(src1, dst1).perform();

	
	
}}