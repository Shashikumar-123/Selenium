package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_css {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("shashikumarr");
driver.findElement(By.cssSelector("input[data-testid='royal-pass']")).sendKeys("shashi@1234");
driver.findElement(By.cssSelector("button[type='submit']")).click();
Thread.sleep(3000);

driver.close();



	}

}
