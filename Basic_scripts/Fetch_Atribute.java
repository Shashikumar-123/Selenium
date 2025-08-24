package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Atribute {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
WebElement abc= driver.findElement(By.name("q"));
 String atribute= abc.getAttribute("title");
 System.out.println(atribute);
	}

}
