package Dropdowns;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
	TakesScreenshot ts =(TakesScreenshot)driver;	
	
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshots/defect.png");
	FileHandler.copy(temp, perm);
	}

}
