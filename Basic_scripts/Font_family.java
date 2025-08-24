package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Font_family {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	WebElement	abcd = driver.findElement(By.xpath("//input[@autocomplete='off']"));
System.out.println(abcd.getCssValue("height"));
System.out.println(abcd.getCssValue("width"));
System.out.println(abcd.getCssValue("font-family"));
System.out.println(abcd.getTagName());//tagname
System.out.println(abcd.getLocation());

driver.quit();

	
	}

}
