package Basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_pagesource {


			public static void main(String[] args) throws InterruptedException {
			

					/*String key ="webdriver.chrome.driver";
					String value ="./softwares/chromedriver.exe";
					*/
					System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
					

				WebDriver driver	= new FirefoxDriver();
		driver.get("https://www.Flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	String src = driver.getPageSource();
	System.out.println(src);
		driver.close();
		//driver.quit();
	}

}
