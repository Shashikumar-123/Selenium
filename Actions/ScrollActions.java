package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollActions {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
ChromeOptions options = new ChromeOptions();

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("9505069261");
		driver.findElement(By.id("pass")).sendKeys("9491833293");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        

		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("Windows.ScrollBy(1990,700)");
		
		
}}
