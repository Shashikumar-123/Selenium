package Dropdowns;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
					 JavascriptExecutor js=(JavascriptExecutor)driver;
					 js.executeScript("document.body.style.zoom='150'");
		}

}
