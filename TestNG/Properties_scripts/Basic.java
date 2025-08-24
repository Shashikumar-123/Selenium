package Properties_scripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Basic {
	@Test
	public void exampl () throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","./softwares"
				+ "/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");

        WebDriver driver = new ChromeDriver();
        FileInputStream fis=new FileInputStream("./Test_Data/LoginData.properties");
        Properties p = new Properties();
        p.load(fis);
        String url1=p.getProperty("Test_URL");
        String psw1=p.getProperty("Test_PSW");
        String usn1=p.getProperty("Test_USN");
		driver.get(url1);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement usn =driver.findElement(By.id("email"));
		WebElement psw =driver.findElement(By.id("pass"));
		WebElement btn =driver.findElement(By.name("login"));
		usn.sendKeys(usn1);
		psw.sendKeys(psw1);
		btn.click();
	}

}
