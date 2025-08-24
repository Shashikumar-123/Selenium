package Dropdowns;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assainment {


		public static void main(String[] args)  throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			Thread.sleep(2000);
			driver.manage().window().maximize();
		WebElement abc = driver.findElement(By.id("select-multiple-native"));
		Select s= new Select(abc);
			if(s.isMultiple())
			{
				s.selectByVisibleText("Running Shoes");
				Thread.sleep(2000);
s.selectByValue("Winter Coat");
Thread.sleep(2000);
s.selectByIndex(3);
driver.findElement(By.xpath("//button[.='Add']")).click();
driver.findElement(By.xpath("(//select[@aria-invalid='false'])[2]"));
s.selectByIndex(1);
driver.findElement(By.xpath("//button[text()='Remove']")).click();
//driver.findElement(By.xpath("//button[.='Remove All']")).click();
			}

			else
			{
				System.out.println("Single");

			}
	}
		//(//select[@aria-invalid='false'])[2]
}
