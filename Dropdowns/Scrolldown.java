package Dropdowns;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {


		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
			Thread.sleep(2000);
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			// js.executeScript("window.scrollBy(0,300)");
			for(int i=1;i<4;i++)
			{
				js.executeScript("window.scrollBy(0,300)");
							}
			Thread.sleep(2000);
			for(int i=0;i<4;i++)
			{
				js.executeScript("window.scrollBy(0,-300)");
			}
	}

}
