package testNGFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WhyPOM {
	@Test
	public void POM()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement UN = driver.findElement(By.id("email"));
		UN.sendKeys("pooja");
		WebElement PSW = driver.findElement(By.id("pass"));
		PSW.sendKeys("pooja");
		driver.navigate().refresh();
		UN.sendKeys("pooja");
		driver.quit();
		
		
	}
	

}
