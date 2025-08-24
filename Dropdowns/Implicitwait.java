package Dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement name = driver.findElement(By.id("name"));
		  WebElement email = driver.findElement(By.id("email"));
		  WebElement pswd = driver.findElement(By.id("password"));
		WebElement reg = driver.findElement(By.xpath("//button[.='Register']"));
		name.sendKeys("shashikumar");
		email.sendKeys("sipl@gmail.com");
		pswd.sendKeys("shashi@12345");
		reg.click();
		driver.close();
  
		  
			
				}
	}


