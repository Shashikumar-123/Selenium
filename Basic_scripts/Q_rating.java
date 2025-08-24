package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q_rating {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://github.com/login");
Thread.sleep(3000);
driver.findElement(By.name("login")).sendKeys("king");
driver.findElement(By.id("password")).sendKeys("king@123");
Thread.sleep(3000);
driver.findElement(By.linkText("Sign in with a passkey")).click();

//driver.findElement(By.linkText("Create an account")).click();


	}}

