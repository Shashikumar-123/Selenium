package Dropdowns;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
				WebElement sear = driver.findElement(By.id("email"));
	File temp = sear.getScreenshotAs(OutputType.FILE);
	File perm=new File("./Screenshots/Element.png");
	FileHandler.copy(temp, perm);

	}

}
