package Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("9505069261");
		driver.findElement(By.id("pass")).sendKeys("9491833293");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
TakesScreenshot ts= (TakesScreenshot)driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File perm = new File("./Screenshots/Facebooklogin.png");

FileHandler.copy(temp, perm);
driver.close();
	
	}

}
