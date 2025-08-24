package Dropdowns;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_for_particular_loc {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//h3[.='eBooks']"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		
js.executeScript("arguments[0].scrollIntoView()",ele);
}
}


