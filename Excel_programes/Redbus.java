package Excel_programes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(By.id("src")).sendKeys("Banglore");
		driver.findElement(By.id("dest")).sendKeys("Anantapur raju road");
		driver.findElement(By.xpath("//span[.='Date']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[.='26']")).click();
		driver.findElement(By.xpath("//button[.='SEARCH BUSES']")).click();
		

		

	}

}
