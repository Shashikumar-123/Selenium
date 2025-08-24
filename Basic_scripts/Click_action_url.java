package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_action_url {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.tagName("a")).click();

	}

}
