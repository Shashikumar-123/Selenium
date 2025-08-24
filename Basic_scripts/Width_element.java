package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Width_element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement image=driver.findElement(By.xpath("//img[@alt='Top Offers']"));
		Dimension size= image.getSize();
		System.out.println(size);
		int h=size.getHeight();
		System.out.println(h);
		int w=size.getWidth();
		System.out.println(w);


	}

}
