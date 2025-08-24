package Basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(3000);
		WebElement rd=driver.findElement(By.id("attended"));
		if(rd.isDisplayed())
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");	
		}
		if(rd.isEnabled())
		{
			System.out.println("enebled");
		}
		else
		{
			System.out.println("not enebled");

		}
		if(rd.isSelected())
		{
						System.out.println("is selected");
				}
		else
		{
			rd.click();
			//System.out.println("not selected");
		}
		driver.close();
}}