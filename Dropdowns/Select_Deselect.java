package Dropdowns;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselect {

		public static void main(String[] args)  throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("file:///C:/Users/Dell/Desktop/Dropdownmultiple.html");
			Thread.sleep(2000);
			WebElement dd = driver.findElement(By.name("Dropdown"));
			Select s= new Select(dd);
			
		
			s.selectByVisibleText("manual");
			Thread.sleep(2000);
			s.selectByValue("c");
			Thread.sleep(2000);
           s.selectByIndex(3);
			Thread.sleep(2000);
			s.deselectByIndex(3);
			Thread.sleep(2000);
s.deselectByValue("c");
Thread.sleep(2000);
s.deselectByVisibleText("manual");
//s.deselectAll();

	}

}
