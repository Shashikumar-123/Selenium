package Dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assainment2_usingexplicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait ew = new WebDriverWait(driver,10);
		WebElement txt = driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
		ew.until(ExpectedConditions.visibilityOf(txt));
txt.sendKeys("3");

WebElement btn = driver.findElement(By.xpath("//button[.='Start']"));
ew.until(ExpectedConditions.visibilityOf(btn));
btn.click();
WebElement dd = driver.findElement(By.xpath("//select[@id='']"));
		Select s = new Select(dd);
		ew.until(ExpectedConditions.visibilityOf(dd));
		s.selectByVisibleText("No");
		
		
		
	
	}}
