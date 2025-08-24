package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement text =driver.findElement(By.xpath("//a[.='Login']"));
String	abc	= text.getText();
System.out.println(abc);
	}

}
