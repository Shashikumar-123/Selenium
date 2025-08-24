package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
Thread.sleep(2000);
Actions act = new Actions(driver);
act.doubleClick(btn).perform();
Thread.sleep(2000);
driver.quit();
	}

}
