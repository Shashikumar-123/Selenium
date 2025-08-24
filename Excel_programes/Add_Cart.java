package Excel_programes;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_Cart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Mobiles");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.findElement(By.xpath("//div[.='Nokia 105 Single SIM, Keypad Mobile Phone with Wireless FM Radio']")).click();
Set<String> handles = driver.getWindowHandles();
ArrayList<String> arr= new ArrayList<>(handles);
WebDriver abc = driver.switchTo().window(arr.get(1));
abc.findElement(By.xpath("//button[.='Add to cart']")).click();

	
}
}