package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");
		Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement dst1 = driver.findElement(By.xpath("//div[.='Laptop Accessories']"));
		//WebElement src2 = driver.findElement(By.xpath("//div[.='Mobile Cover']"));

			Thread.sleep(2000);
Actions act = new Actions(driver);
act.dragAndDrop(src1, dst1).perform();
	}

}
