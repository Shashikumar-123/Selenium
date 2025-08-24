package Excel_programes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_Booking {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://tickets.paytm.com/flights/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.findElement(By.xpath("//label[.='Round Trip']")).click();
driver.findElement(By.id("srcCode")).click();
//     driver.findElement(By.xpath("//div[.='From']"));
driver.findElement(By.xpath("//div[.='Bengaluru']")).click();//from

driver.findElement(By.id("destCode")).click();
//    driver.findElement(By.xpath("//div[.='To']"));
driver.findElement(By.xpath("//div[.='Hyderabad']")).click();//to

driver.findElement(By.id("departureDate")).click();
 driver.findElement(By.xpath("(//div[.='27'])[1]")).click(); //start date
 
 
driver.findElement(By.xpath("(//div[.='2'])[2]")).click();// return date

 
 
driver.findElement(By.xpath("//span[.='1 Traveller, Economy']")).click();
 
 driver.findElement(By.xpath("(//div[@class='KMRc9'])[2]")).click();//number of people
 driver.findElement(By.xpath("//div[.='Done']")).click();
 
  WebElement ele = driver.findElement(By.id("flightSearch"));
 ele.click(); //search flight
 Thread.sleep(2000);
 System.out.println("tickets confirmed");
 driver.close();
}}
