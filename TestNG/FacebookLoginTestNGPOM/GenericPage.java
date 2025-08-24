package FacebookLoginTestNGPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericPage {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}

}
