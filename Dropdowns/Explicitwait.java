package Dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait ew = new WebDriverWait(driver,10);
		//Testcase 1
		ew.until(ExpectedConditions.titleContains("log in"));
	String title = driver.getTitle();
	System.out.println(title);
		//testcase2
	ew.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
 String url = driver.getCurrentUrl();
 System.out.println(url);
 
 //testcase3
 WebElement un = driver.findElement(By.id("email"));
 ew.until(ExpectedConditions.visibilityOf(un));
 un.sendKeys("shashikumar");
 //testcase 4
 WebElement pswd = driver.findElement(By.id("pass")); 
 ew.until(ExpectedConditions.visibilityOf(pswd));
 pswd.sendKeys("shashi@12345");
 //testcase 5
WebElement btn = driver.findElement(By.xpath("//button[.='Log in']"));
 ew.until(ExpectedConditions.visibilityOf(btn));
 btn.click();
 driver.close();
 
 
 
 
	}

}
