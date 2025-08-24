package Basic_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_texts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		 List<WebElement> elements = driver.findElements(By.xpath("//*"));
		 for(WebElement elem:elements)
		 {
		String txt= elem.getText();
		 
		System.out.println(txt);
		 }
		 driver.quit();
	}

}
