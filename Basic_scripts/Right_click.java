package Basic_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {


		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			WebElement cir = driver.findElement(By.xpath("//a[@title='Tamil']"));
			Thread.sleep(2000);
			Actions a = new Actions(driver);
			a.contextClick(cir).perform();
		Robot	r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);

					
	}

}
