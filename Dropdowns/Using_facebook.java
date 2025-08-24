package Dropdowns;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_facebook {

	public static void main(String[] args)  throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.name("birthday_day"));
		Select s= new Select(dd);
List<WebElement> opt = s.getOptions();		
Thread.sleep(2000);
for(WebElement p:opt)
{
	String abc = p.getText();
	System.out.println(abc);
}
		
	
		
}
}