package Basic_scripts;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shashikumar");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File perm = new File("./Screenshots/ssssss.png");
org.openqa.selenium.io.FileHandler.copy(temp, perm);

	
		
	}

}
