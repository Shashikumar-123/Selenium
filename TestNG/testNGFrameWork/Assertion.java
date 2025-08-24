package testNGFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void checkTitle()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String Expected = "Facebook – log in or sign ";
	    String Actual = driver.getTitle();
	   Assert.assertEquals(Actual, Expected);
	   System.out.println("veified");
	   driver.quit();
	}
	
	
	

}
