package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_login_credientials {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.name("link")).click();
	driver.findElement(By.id("email")).sendKeys("shashikumar150910@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("shashi@123");
	driver.findElement(By.name("login")).click();
//driver.findElement(By.linkText(" facebook 2025")).click();
}
}