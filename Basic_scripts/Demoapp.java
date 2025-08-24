package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("shashikumar");
		driver.findElement(By.id("email")).sendKeys("shashikumar150910@gmail.com");
		driver.findElement(By.id("password")).sendKeys("shashi@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		



		
	}

}
