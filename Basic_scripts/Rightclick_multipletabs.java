package Basic_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_multipletabs {


		public static void main(String[] args)  throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.selenium.dev/");
			//driver.manage().window().maximize();
			Thread.sleep(2000);
			

		WebElement ele1 = driver.findElement(By.xpath("//span['Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span['Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span['Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span['Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//span['Blog']"));
		Actions a = new Actions(driver);
		Robot r=new Robot();
			
			ArrayList<WebElement> arr= new ArrayList<>();
			arr.add(ele1);
			arr.add(ele2);
			arr.add(ele3);
			arr.add(ele4);
			arr.add(ele5);
			for(WebElement b:arr)
			{
				a.contextClick(b).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
	}
		}
}
